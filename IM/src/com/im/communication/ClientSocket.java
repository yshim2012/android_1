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
//			Toast.makeText(this, "����ɹ�", Toast.LENGTH_LONG).show();
			Log.e("=======", ip);
			//����udp�ķ���
			DatagramSocket datagramSocket = new DatagramSocket();
			//׼�����ݣ������ݷ�װ�����ݰ��С�
			String data;
			data = (et1.getText()).toString();
			//������һ�����ݰ�
			DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length,ia , 9090);
			//����udp�ķ��������ݰ�
			while(!(packet==null)){
			datagramSocket.send(packet);
			}
			datagramSocket.close();//�ر���Դ ---ʵ���Ͼ����ͷ�ռ�õĶ˿ں�
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