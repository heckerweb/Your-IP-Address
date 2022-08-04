*
  This program is to print your system's IP Address. 
  Created by ProCoder
  ❌Don't Copy❌
 */

import java.net.InetAddress;
public class ip_address{
  public static void main(String args[]) throws Exception{
	InetAddress IP = InetAddress. getLocalHost();
	System.out.println();
	System. out. println("Your IP Address is: "+IP.getHostAddress());
	System.out.println("______________________________");
	System.out.println("Created by ProCoder");
  }
}
