package edu.qxh151330utdallas.qiyuanhu.quiz_game;

/**
 * Created by huqiy on 4/16/2017.
 */

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.AlphabeticIndex;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;


public class High_Score_Activity extends AppCompatActivity {

    private Button mButtonReturnMain;
    private ListView view;
    private List<String> Recorddata = new ArrayList<>();
    private Button mButtonDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.highscore_list);
        load();
        mButtonDelete = (Button) findViewById(R.id.delete);
        mButtonReturnMain = (Button) findViewById(R.id.return_main);
        mButtonDelete.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Dialog dialog = new AlertDialog.Builder(High_Score_Activity.this)

                        .setMessage("Are You Sure To Clear All The Records？")    //表示对话框的内容

                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {
                                File RecordFile = new File("record.txt");
                                if (!RecordFile.exists()) {
                                    try {
                                        RecordFile.createNewFile();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                    }
                                }
                                ArrayList<String> Recorddata = new ArrayList();
                                try {
                                    FileInputStream fileinput = openFileInput("Record.txt");
                                    InputStreamReader fReader = new InputStreamReader(fileinput);
                                    boolean del = false;
                                    fileinput.close();
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                try {
                                    FileOutputStream fileoutput = openFileOutput("Record.txt", Context.MODE_PRIVATE);
                                    int length = Recorddata.size();
                                    for (int i = 0; i < length; i++) {
                                        fileoutput.write(Recorddata.get(i).getBytes());
                                        fileoutput.write("\n".getBytes());
                                    }
                                    fileoutput.close();
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                finish();
                            }
                        }).setNegativeButton("No", new DialogInterface.OnClickListener() {

                            public void onClick(DialogInterface dialog, int which) {

                            }

                        }).create();  //创建对话框

                dialog.show();  //显示对话框
            }


        });


        mButtonReturnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }

    private void load() {
        view = (ListView) findViewById(R.id.list);
        view.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        String loadData;
        File RecordFile = new File("Record.txt");
        if (!RecordFile.exists()) {
            try {
                RecordFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileInputStream FileInput = openFileInput("Record.txt");
            InputStreamReader fReader = new InputStreamReader(FileInput);
            BufferedReader bReader = new BufferedReader(fReader);

            while ((loadData = bReader.readLine()) != null) {
                String[] source = loadData.split("\t");
                Recorddata.add("\t Score: " + source[0] + "\t Time:  " + source[1] + "\t");
            }
            FileInput.close();

            ArrayAdapter<String> arr = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Recorddata);
            view.setAdapter(arr);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}