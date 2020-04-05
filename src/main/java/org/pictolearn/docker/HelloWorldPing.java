/**
 * 
 */
package org.pictolearn.docker;

import java.net.MalformedURLException;
import java.util.Random;

/**
 * @author Luis.Pimenta
 *
 */
public class HelloWorldPing {

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		Random r = new Random();
		
		int n = r.nextInt(100) + 50;
		
		
		
		for(int i = 0 ; i < n; i++){
			System.out.println("Hello World Pinging nr: " + i );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
