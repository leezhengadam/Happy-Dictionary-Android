package edu.qxh151330utdallas.qiyuanhu.quiz_game;

/**
 * Created by huqiy on 4/16/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Level_Choose_Activity extends AppCompatActivity {

    private Button mButtonReturnMain;
    private Button mButtonScience;
    private Button mButtonHistory;
    private Button mButtonEconomic;
    private Button mButtonPolitics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.level_choose);

         mButtonReturnMain = (Button)findViewById(R.id.return_main);
         mButtonScience = (Button)findViewById(R.id.field_science);
         mButtonHistory = (Button)findViewById(R.id.field_history);
         mButtonEconomic = (Button)findViewById(R.id.field_economic);
         mButtonPolitics = (Button)findViewById(R.id.field_computer);


        //Start of Return Button
        mButtonReturnMain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Level_Choose_Activity.this.finish();
                finish();
            }
        });

        mButtonScience.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Level_Choose_Activity.this.finish();
                finish();
                Intent intent = new Intent();
                intent.setClass(Level_Choose_Activity.this,Question_Activity_Science.class);
                intent.putExtra("Field",1);
                startActivity(intent);
            }
        });

        mButtonHistory.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Level_Choose_Activity.this.finish();
                finish();
                Intent intent = new Intent();
                intent.setClass(Level_Choose_Activity.this,Question_Activity_History.class);
                intent.putExtra("Field",2);
                startActivity(intent);
            }
        });

        mButtonEconomic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Level_Choose_Activity.this.finish();
                finish();
                Intent intent = new Intent();
                intent.setClass(Level_Choose_Activity.this,Question_Activity_Economic.class);
                intent.putExtra("Field",3);
                startActivity(intent);
            }
        });

        mButtonPolitics.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Level_Choose_Activity.this.finish();
                finish();
                Intent intent = new Intent();
                intent.setClass(Level_Choose_Activity.this,Question_Activity_Computer.class);
                intent.putExtra("Field",4);
                startActivity(intent);
            }
        });

    }

}