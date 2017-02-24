package Login;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Observable;

public class Comunicacion extends Observable implements Runnable {

	private DatagramSocket socket;
	private DatagramPacket packet;
	private final int PORT= 6000;
    public  final String myIp = "225.0.1.2";
	
	public Comunicacion() {
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
