/*
 * generated by Xtext
 */
package org.alma.mde.statemachine;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class ZhuStandaloneSetup extends ZhuStandaloneSetupGenerated{

	public static void doSetup() {
		new ZhuStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

