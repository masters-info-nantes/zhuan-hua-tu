import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import com.dsl.DSLStandaloneSetup;

import com.google.inject.Injector;

public class LaunchAtl {

	/**
	 * @param args
	 * @throws ATLCoreException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws ATLCoreException, IOException {
                // Replace DSL by your Language name
		DSLStandaloneSetup dsl = new DSLStandaloneSetup();		
		Injector injector = dsl.createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI("URI to your dsl file"), true);
		
		// Create factory and injector
		EMFModelFactory factory = new EMFModelFactory();
		EMFInjector emfinjector = new EMFInjector();
		// Load the DSL metamodel
		EMFReferenceModel dslMetamodel = (EMFReferenceModel) factory.newReferenceModel();
		emfinjector.inject(dslMetamodel, "DSL Metamodel Path");
		// Load the XtextResource as an EMFModel
		EMFModel model = (EMFModel) factory.newModel(dslMetamodel);
		emfinjector.inject(model, resource);

		EMFReferenceModel outMetamodel = (EMFReferenceModel) factory.newReferenceModel();
		emfinjector.inject(outMetamodel, "OUT Metamodel Path");
		EMFModel outModel = (EMFModel) factory.newModel(outMetamodel);
		
		EMFVMLauncher launcher = new EMFVMLauncher();
		launcher.initialize(Collections.<String, Object> emptyMap());
		
		launcher.addInModel(model, "IN", "DSL");
		launcher.addOutModel(outModel, "OUT", "OUTMM");
		
		InputStream asm = Main.class.getResourceAsStream("transformation.asm path"); 
		
		launcher.launch(
				ILauncher.RUN_MODE, 
				new NullProgressMonitor(), 
				Collections.<String, Object> emptyMap(),
				new Object[] {asm} );
		
		outModel.getResource().setURI(URI.createURI("URI to store out model"));
		outModel.getResource().save(Collections.EMPTY_MAP);
	}

}