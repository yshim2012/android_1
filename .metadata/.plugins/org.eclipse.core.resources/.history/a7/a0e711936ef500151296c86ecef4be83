package com.im.communication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

import android.support.v7.app.ActionBarActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	TextView textview1,textview2;
	EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview1 = (TextView) findViewById(R.id.textview1);
        textview2 = (TextView) findViewById(R.id.textview2);
        et1 = (EditText) findViewById(R.id.edittext1);
    }
    @SuppressLint("ShowToast")
	public void send(View v){
    	//this.sender();
    	this.received();
    	Toast.makeText(this, "点击成功", Toast.LENGTH_LONG).show();    
    }
	private void received() {
		new Thread(new Thread(){
			@Override
			public void run() {
				try {
					String ip = "";
					InetAddress ia = InetAddress.getLocalHost();
					 ip = ia.getHostAddress();
					System.out.println(ip);
					textview1.setText(ip);				
					Log.e("########", ip);
					DatagramSocket socket = new DatagramSocket(9090);
					byte[] buf = new byte[1024];
					@SuppressWarnings("unused")
					DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
					DatagramPacket packet = new DatagramPacket(buf, buf.length);
					boolean flag = true;
					while(flag){
						socket.receive(packet);
						// packet.getAddress() 获取对方数据 包的IP地址对象。
						Log.e("########", packet.getAddress().getHostAddress()+"说:"+new String(buf,0,packet.getLength()));
						textview2.setText(new String(buf,0,packet.getLength()));
					}
					//关闭资源
					socket.close();
				} catch (SocketException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
    		
    	}).start();
	}
	private  void sender() {
		new Thread(new Thread(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					String ip = "";
						InetAddress ia = InetAddress.getLocalHost();
						 ip = ia.getHostAddress();
						System.out.println(ip);
						textview1.setText(ip);				
					Log.e("=======", ip);
					DatagramSocket datagramSocket = new DatagramSocket();
					String data;
					data = (et1.getText()).toString();
					DatagramPacket packet = new DatagramPacket(data.getBytes(), data.getBytes().length,ia , 9090);
					while(!(packet==null)){
					datagramSocket.send(packet);
					}
					datagramSocket.close();//关闭资源 ---实际上就是释放占用的端口号
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (SocketException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
    	}).start();
	}  
}
