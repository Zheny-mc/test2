package springhw.Model;

import java.util.Vector;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
//main
public abstract class ComplexMoving {
	protected Vector<Moving> movings = new Vector<Moving>(); // инициализирован
	protected Vector<StateFigure> states = new Vector<StateFigure>();
	
	public Vector<StateFigure> executeMovings(Circle circle) {
		states.clear();

		for (Moving i: movings) {
			states.add(i.move(circle));
		}

		return states;
	}
	
}
