/**
 * 
 */
package org.pictolearn.docker;

/**
 * @author Luis.Pimenta
 *
 */
public class HelloWorldPing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(int i = 0 ; i < 100; i++){
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
