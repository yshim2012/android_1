package inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			InetAddress ia = InetAddress.getLocalHost();
//			if(!(ia==null)){
			String ip = ia.getHostAddress();
			System.out.println(ip);
		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			Toast.makeText(this, "huoqushibai", Toast.LENGTH_LONG).show();
			e.printStackTrace();
		}
	}

}
