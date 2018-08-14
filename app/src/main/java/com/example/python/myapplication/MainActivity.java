package com.example.python.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnClicked(View view){
       TextView txt = (TextView)findViewById(R.id.txtHello);
       Button btn = (Button)findViewById(R.id.btnHello);
       txt.setText("I was changed when Button Pressed");
       btn.setText("Clicked!");
       Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show();
    }
}
