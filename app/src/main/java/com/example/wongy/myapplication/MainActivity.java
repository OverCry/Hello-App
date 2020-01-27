package com.example.wongy.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary));

            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.orange));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //grab text in editText field and put it as the text
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText)){
                    ((TextView)findViewById(R.id.textView)).setText("Hello from Wong!");
                } else {
                    ((TextView) findViewById(R.id.textView)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //reset text color back to black
                ((TextView)findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black));

                //reset background color to colorAccent
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent));

                //reset text to Hello from wong
                ((TextView)findViewById(R.id.textView)).setText("Hello from Wong!");
            }
        });
    }


}
