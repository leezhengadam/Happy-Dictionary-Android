package edu.qxh151330utdallas.qiyuanhu.quiz_game;

/**
 * Created by huqiy on 4/16/2017.
 */

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class  Question_Activity_Economic extends AppCompatActivity {

    private QuestionLibrary_Economic mQuestionLibrary = new QuestionLibrary_Economic();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonReturn;
    private SensorManager sensorManager;
    private Vibrator vibrator;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);
        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);

        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonReturn = (Button)findViewById(R.id.return_main);
        updateQuestion();
        //Start of Button Listener for Return
        mButtonReturn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Question_Activity_Economic.this.finish();
                finish();
            }
        });
        //End of Button Listener for Return




        //Start of Button Listener for Button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mButtonChoice1.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(Question_Activity_Economic.this,"Correct",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Question_Activity_Economic.this,"Wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(Question_Activity_Economic.this,"Correct",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Question_Activity_Economic.this,"Wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of Button Listener for Button2


        //Start of Button Listener of Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    Toast.makeText(Question_Activity_Economic.this,"Correct",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Question_Activity_Economic.this,"Wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        //End of Button Listener of Button3
    }


    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        if(mQuestionNumber <= 9 ){
            mQuestionNumber++;
        }
        else{
            Save_Record();
            Question_Activity_Economic.this.finish();
            finish();
        }
    }


    private void updateScore(int mScore) {
        mScoreView.setText("" + mScore);

    }

    /**
     * Start of The Sensor
     */
    @Override
    protected void onResume() {
        super.onResume();
        if (sensorManager != null) {// 注册监听器
            sensorManager.registerListener(sensorEventListener, sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER), SensorManager.SENSOR_DELAY_NORMAL);
// 第一个参数是Listener，第二个参数是所得传感器类型，第三个参数值获取传感器信息的频率
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (sensorManager != null) {// 取消监听器
            sensorManager.unregisterListener(sensorEventListener);
        }
    }

    private SensorEventListener sensorEventListener = new SensorEventListener() {
        @Override
        public void onSensorChanged(SensorEvent event) {
            // 传感器信息改变时执行该方法
            float[] values = event.values;
            float x = values[0]; // x轴方向的重力加速度，向右为正
            float y = values[1]; // y轴方向的重力加速度，向前为正
            float z = values[2]; // z轴方向的重力加速度，向上为正
            // 一般在这三个方向的重力加速度达到40就达到了摇晃手机的状态。
            int medumValue = 19;
            if (Math.abs(x) > medumValue || Math.abs(y) > medumValue || Math.abs(z) > medumValue) {
                vibrator.vibrate(200);
                Toast.makeText(Question_Activity_Economic.this,"Pass",Toast.LENGTH_SHORT).show();
                updateQuestion();
            }
        }
        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    };
    /**
     * End of The Sensor
     */
    public void Save_Record(){

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date curDate = new Date(System.currentTimeMillis());
        String dateStr = format.format(curDate);

        File RecordFile = new File("Record.txt");
        if(!RecordFile.exists()){
            try{
                RecordFile.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        ArrayList<String> Recorddata = new ArrayList();
        try{
            FileInputStream FileInput = openFileInput("Record.txt");
            InputStreamReader fReader = new InputStreamReader(FileInput);
            BufferedReader breader = new BufferedReader(fReader);
            String Record_Data = mScore + "\t" + dateStr;
            openFileInput("Record.txt").close();
            Recorddata.add(Record_Data);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        Collections.sort(Recorddata);
        try{
            FileOutputStream FileOutput = openFileOutput("Record.txt", Context.MODE_APPEND);
            int length = Recorddata.size();
            for(int i = 0; i < length; i++){
                FileOutput.write(Recorddata.get(i).getBytes());
                FileOutput.write("\n".getBytes());
            }
            FileOutput.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }



}
