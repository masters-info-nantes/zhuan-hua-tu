/*
 * generated by Xtext
 */
package org.alma.mde.statemachine.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractZhuValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(org.alma.mde.statemachine.zhu.ZhuPackage.eINSTANCE);
		return result;
	}
}
