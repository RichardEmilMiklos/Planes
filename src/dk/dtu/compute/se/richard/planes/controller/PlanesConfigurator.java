package dk.dtu.compute.se.richard.planes.controller;

import dk.dtu.compute.se.richard.planes.gui.PlanesGUI;
import dk.dtu.imm.se.ecno.eclipse.configurators.IControllerConfigurator;
import dk.dtu.imm.se.ecno.eclipse.save.behaviourstates.ControllerState;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.gui.ECNOGUI;

/**
 * This is a controller configurator, which installs the planes GUI.
 * 
 * @author Richard Emil Miklos
 *
 */
public class PlanesConfigurator implements IControllerConfigurator {

	@Override
	public void initializeControllers(ExecutionEngine engine, ControllerState state) {

		engine.addController(new PlanesGUI(engine, null));

		new ECNOGUI(engine);
	}
}
