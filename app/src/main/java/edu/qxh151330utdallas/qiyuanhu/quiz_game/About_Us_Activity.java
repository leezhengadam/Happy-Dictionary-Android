package edu.qxh151330utdallas.qiyuanhu.quiz_game;

/**
 * Created by huqiy on 4/16/2017.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class About_Us_Activity extends AppCompatActivity {

    private Button mButtonReturnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);

        mButtonReturnMain = (Button)findViewById(R.id.return_main);


        mButtonReturnMain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                About_Us_Activity.this.finish();
                finish();
            }
        });

    }
}