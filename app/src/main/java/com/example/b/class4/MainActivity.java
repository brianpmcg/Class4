package com.example.b.class4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create an anonymous class with an onClick listener and attach it to button 1
        Button b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Button 1 Anonymous OnClickListener", Toast.LENGTH_SHORT).show();

            }
        });

        //Set button 2 to use another class (Button2OnClickListener) as the onClick Listener)
        Button b2=(Button)findViewById(R.id.button2);
        Button2OnClickListener b2click=new Button2OnClickListener();
        b2.setOnClickListener(b2click);

        //Set both buttons 3 and 4 to use this class as an onClick listener
        Button b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);

        Button b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);

        Button b5=(Button)findViewById(R.id.button5);
        b5.setOnClickListener(this);

        Button b6=(Button)findViewById(R.id.button6);
        b6.setOnClickListener(this);
    }

    @Override
    public void onClick(View arg0) {
        Toast.makeText(getApplicationContext(), "Button 3, 4, 5 and 6 MainActivity OnClickListener", Toast.LENGTH_SHORT).show();

        if(arg0.equals((View)findViewById(R.id.button4))) {
            //add android:id="@+id/tableLayout" to table layout xml
            TableLayout table1 = (TableLayout) findViewById(R.id.tableLayout);
            if(table1.getVisibility()==View.VISIBLE) {
                table1.setVisibility(View.INVISIBLE);
            }else{
                table1.setVisibility(View.VISIBLE);

            }
        }
        else if(arg0.equals((View)findViewById(R.id.button5)))
        {
            //change all of the labels on the screen
            TextView t1=(TextView)findViewById(R.id.textView);
            t1.setText("Text 1 Label");

            TextView t2=(TextView)findViewById(R.id.textView2);
            t2.setText("Text 2 Label");

            TextView t3=(TextView)findViewById(R.id.textView3);
            t3.setText("Text 3 Label");

            TextView t4=(TextView)findViewById(R.id.textView4);
            t4.setText("Text 4 Label");

            TextView t5=(TextView)findViewById(R.id.textView5);
            t5.setText("Text 5 Label");

            TextView t6=(TextView)findViewById(R.id.textView6);
            t6.setText("Text 6 Label");
        }
        else if(arg0.equals((View)findViewById(R.id.button6)))
        {
            //change all of the labels on the screen
            Button b1=(Button)findViewById(R.id.button);
            if(b1.isEnabled()) {
                b1.setText("Button 1 disabled");
                b1.setEnabled(false);
            }
            else{
                b1.setText("Button 1 enabled");
                b1.setEnabled(true);
            }

            Button b2=(Button)findViewById(R.id.button2);
            if(b2.isEnabled()) {
                b2.setText("Button 2 disabled");
                b2.setEnabled(false);
            }
            else{
                b2.setText("Button 2 enabled");
                b2.setEnabled(true);
            }

            Button b3=(Button)findViewById(R.id.button3);
            if(b3.isEnabled()) {
                b3.setText("Button 3 disabled");
                b3.setEnabled(false);
            }
            else{
                b3.setText("Button 3 enabled");
                b3.setEnabled(true);
            }
        }


    }
}
