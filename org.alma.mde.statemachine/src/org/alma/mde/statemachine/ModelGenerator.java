package org.alma.mde.statemachine;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceSet;

public class ModelGenerator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ZhuStandaloneSetup.doSetup();
        XtextResourceSet resourceSet = new XtextResourceSet();
        URI uri = URI.createURI("model/Book.zhu");
        Resource xtextResource = resourceSet.getResource(uri, true);
        Resource xmiResource = new XMIResourceFactoryImpl()
                .createResource(URI.createURI("model/generated/Zhu.xmi"));
        xmiResource.getContents().add(xtextResource.getContents().get(0));
        try {
            xmiResource.save(null);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
