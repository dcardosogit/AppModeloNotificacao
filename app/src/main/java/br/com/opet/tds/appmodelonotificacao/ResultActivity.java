package br.com.opet.tds.appmodelonotificacao;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        TextView textCount = (TextView) findViewById(R.id.textCount);

        Intent resultIntent = getIntent();
        if(resultIntent.hasExtra("MESSAGE_COUNT")){
            textCount.setText(String.valueOf(resultIntent.getIntExtra("MESSAGE_COUNT",0)));
        }
    }
}
