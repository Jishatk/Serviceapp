package example.com.serviceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bStart,bStop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bStart=findViewById(R.id.button);
        bStop=findViewById(R.id.button2);
    }

    public void startServ(View v)
    {
        Intent in1=new Intent(MainActivity.this,MyService1.class);
        startService(in1);
    }

    public void stopServ(View v)
    {
        Intent in1=new Intent(MainActivity.this,MyService1.class);
        stopService(in1);
    }
}
