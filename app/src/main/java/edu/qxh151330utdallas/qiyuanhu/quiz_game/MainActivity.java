package edu.qxh151330utdallas.qiyuanhu.quiz_game;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Dialog;

public class MainActivity extends AppCompatActivity {

    private Button mButtonStart;
    private Button mButtonAboutUs;
    private Button mButtonHighScore;
    private Button mButtonQuit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonStart = (Button) findViewById(R.id.start);
        mButtonHighScore = (Button) findViewById(R.id.high_score);
        mButtonAboutUs = (Button) findViewById(R.id.about_us);
        mButtonQuit = (Button) findViewById(R.id.quit);


        //Start of Button for Start The Game
        mButtonStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, Level_Choose_Activity.class);
                startActivity(intent);
            }
        });
        //End of Button for Start The Game

        //Start of Button for High Score
        mButtonHighScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,High_Score_Activity.class);
                startActivity(intent);
            }
        });
        //End of Button for High Score

        //Start of Button for About Us
        mButtonAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, About_Us_Activity.class);
                startActivity(intent);
            }
        });
        //End of Button for About Us

        //Start of Button for Quit Application
        mButtonQuit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.exitDialog();

            }
        });
        //End of Button for Quit Application
    }
    private void exitDialog(){  //退出程序的方法

        Dialog dialog = new AlertDialog.Builder(MainActivity.this)

                .setMessage("Are You Sure To Exit？")    //表示对话框的内容

                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {

                        MainActivity.this.finish();
                        finish();

                    }

                }).setNegativeButton("No", new DialogInterface.OnClickListener() {

                    public void onClick(DialogInterface dialog, int which) {

                    }

                }).create();  //创建对话框

        dialog.show();  //显示对话框

    }
}
