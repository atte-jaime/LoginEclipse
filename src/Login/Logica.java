package Login;

import java.util.Observable;
import java.util.Observer;

import processing.core.PApplet;

public class Logica implements Observer {

	private PApplet app;
	private Comunicacion com;

	public Logica(PApplet app) {
		this.app = app;
		com = new Comunicacion();
		com.addObserver(this);
		(new Thread(com)).start();
	}

	public void update(Observable arg0, Object arg1) {

	}

}
