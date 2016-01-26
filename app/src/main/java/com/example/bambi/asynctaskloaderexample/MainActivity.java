package com.example.bambi.asynctaskloaderexample;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.main_button);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main_button:
                EditText et = (EditText) findViewById(R.id.main_edit_text);
                String url = et.getText().toString();
                Bundle b = new Bundle();
                b.putString("URL", url);

                Intent intent = new Intent(this, ShowActivity.class);
                intent.putExtras(b);
                startActivity(intent);
        }
    }
}
