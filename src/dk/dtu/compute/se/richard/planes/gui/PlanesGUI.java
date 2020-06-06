package dk.dtu.compute.se.richard.planes.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ToolTipManager;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EStructuralFeature;

import dk.dtu.compute.se.richard.planes.coordination.PlanesModel;
import dk.dtu.imm.se.ecno.engine.ExecutionEngine;
import dk.dtu.imm.se.ecno.engine.IController;
import dk.dtu.imm.se.ecno.gui.ElementButtonPanel;
import planes.Field;
import planes.FlyingObject;
import planes.PlanesPackage;
import planes.impl.FlyingObjectImpl;
import planes.impl.PlaneImpl;

@SuppressWarnings("serial")
public class PlanesGUI extends JFrame implements IController {

	private ExecutionEngine engine;

	Adapter observer = new Adapter() {

		@Override
		public void notifyChanged(Notification notification) {

			if (engine.isExclusivelyLocked()) {
				return;
			}

			if (notification.getFeature().equals(PlanesPackage.eINSTANCE.getFlyingObject_Proximity())) {
				// Do nothing if notification occurred due to proximity change.
				return;
			}

			Notifier notifier = (Notifier) notification.getNotifier();

			if (notifier instanceof Field) {

				Field field = (Field) notifier;
				FlyingObject newFO = (FlyingObject) notification.getNewValue();
				FlyingObject oldFO = (FlyingObject) notification.getOldValue();

				if (notification.getEventType() == Notification.REMOVE) {

					for (FlyingObject curFO : field.getFlyingObject()) {
						curFO.getProximity().remove(oldFO);
					}

					oldFO.getProximity().clear();

				}

				if (notification.getEventType() == Notification.ADD) {

					for (FlyingObject curFO : field.getFlyingObject()) {
						curFO.getProximity().add(newFO);
					}

					newFO.getProximity().addAll(field.getFlyingObject());
					newFO.getProximity().remove(newFO);

				}

			}

			if (notifier instanceof FlyingObject) {
				if (notification.getNewValue() == null) {
					System.out.println("FlyingObject " + ((FlyingObject) notifier).getId() + " crashed");
				} else {
					System.out.println("FlyingObject " + ((FlyingObject) notifier).getId() + " moved from Field "
							+ ((Field) notification.getOldValue()).getName() + " to Field "
							+ ((FlyingObject) notifier).getField().getName());
				}

			}

		}

		@Override
		public void setTarget(Notifier newTarget) {
			// TODO Auto-generated method stub

		}
		
		@Override
		public boolean isAdapterForType(Object type) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Notifier getTarget() {
			// TODO Auto-generated method stub
			return null;
		}

	};

	public PlanesGUI(final ExecutionEngine engine, final PlanesModel model) {
		super();

		this.engine = engine;

		engine.addController(this);
	}

	public synchronized void addElement(Object element) {

	}

	public synchronized void removeElement(Object element) {

	}

	public synchronized void elementEncountered(Object element) {

		((Notifier) element).eAdapters().add(observer);

	}

}
