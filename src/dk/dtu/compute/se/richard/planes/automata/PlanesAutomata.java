/**
 * This is an automatically generated class. It was generated by the
 * Petri net component of the ECNO framework. This class defines
 * the behaviour of a element, as defined by the Petri net.
 */
package dk.dtu.compute.se.richard.planes.automata;

import dk.dtu.imm.se.ecno.engine.ExecutionEngine;

import planes.PlanesPackage;
import dk.dtu.imm.se.ecno.model.adapter.EMFBehaviourAdaptor;
import dk.dtu.imm.se.ecno.model.runtime.SimpleEMFBehaviour;

public class PlanesAutomata extends EMFBehaviourAdaptor {

	public PlanesAutomata(ExecutionEngine engine) {
		super(engine);		
		this.addElementBehaviour(PlanesPackage.eINSTANCE.getField(), Field.class);		
		this.addElementBehaviour(PlanesPackage.eINSTANCE.getFlyingObject(), FlyingObject.class);		
		
		this.addPackage(PlanesPackage.eINSTANCE, SimpleEMFBehaviour.class);
	}

}