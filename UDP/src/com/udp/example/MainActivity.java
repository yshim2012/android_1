package com.udp.example;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends Activity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}
        
 /*       InitUI();
        
        //获得Button对象
        Button btnConnect = (Button) findViewById(R.id.buttonConnect);
        btnConnect.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v)
            {
                //这里处理事件
                
                //ConnectServer();
                //UDPClient udpET = new UDPClient("192.168.0.14","123");
                //udpET.start();
                //DisplayToast("点击了\"连接\"按钮");
            }
        });
        
        //发送Button
        btnConnect = (Button) findViewById(R.id.buttonSend);
        btnConnect.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v)
            {
                //这里处理事件
                SendText();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
     显示Toast  
    public void DisplayToast(String str)
    {
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
    
    public void InitUI()
    {
        TextView text=(TextView)findViewById(R.id.editTextIP);
        text.setText("192.168.0.14");
        
        text = (TextView)findViewById(R.id.editTextFilePath);
        text.setText("Udp Client Send Test");
    }
    
    // connect server
    public void SendText() 
    {
        TextView editIP=(TextView)findViewById(R.id.editTextIP);
        TextView editText=(TextView)findViewById(R.id.editTextFilePath);
        String message = editText.getText().toString() + "\r\n"; 
        
        UDPClient udpET = new UDPClient(editIP.getText().toString(), message);
        udpET.start();
    }*/
}