package com.example.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // 1 : Nhan du lieu dang string
//        Intent intent =getIntent();
//        if (intent!= null){
//            String chuoi = intent.getStringExtra("chuoi");
//            Toast.makeText(this,chuoi,Toast.LENGTH_SHORT).show();
//        }
//        2 : Nhan du lieu dang mang so
//        Intent intent = getIntent();
//        if (intent != null){
//            int[] arrNums = intent.getIntArrayExtra(AppConstant.KEY_MANG_SO);
//            Toast.makeText(this, arrNums.length + "", Toast.LENGTH_SHORT).show();
//        }

//        3: Nhan du lieu dang object
        Intent intent = getIntent();
        if (intent != null){
            Student student = (Student) intent.getParcelableExtra(AppConstant.KEY_OBJECT);
            Toast.makeText(this, student.name + "", Toast.LENGTH_SHORT).show();

        }
    }

}