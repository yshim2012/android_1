package com.im.communication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ClientSocket implements Runnable{

	public static void Da(TextView textview1,TextView textview2,EditText et1) {
		// TODO Auto-generated method stub
/*		try {
			String ip = "";
				InetAddress ia = InetAddress.getLocalHost();
				 ip = ia.getHostAddress();
				System.out.println(ip);
				textview1.setText(ip);
//			Toast.makeText(this, "点击成功", Toast.LENGTH_LONG).show();
			Log.e("=======", ip);
			//建立udp的服务
			DatagramSocket datagramSocket = new DatagramSocket();
			//准备数据，把数据封装到数据包中。
			String data;
			data = (et1.getText()).toString();
			//创建了一个数据包
			DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length,ia , 9090);
			//调用udp的服务发送数据包
			while(!(packet==null)){
			datagramSocket.send(packet);
			}
			datagramSocket.close();//关闭资源 ---实际上就是释放占用的端口号
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

	@Override
	public void run() {
		
	}

}
