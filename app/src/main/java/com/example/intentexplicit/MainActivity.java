package com.example.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//         Person person = new Student("", 0);
    }

    public void sendString(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("chuoi","hello");
        startActivity(intent);
//        Toast.makeText(this,"onClick", Toast.LENGTH_SHORT).show();
    }

    public void sendIntArray(View view) {
        int[] arrNums={1,2,3,4,5,6,7,8,9,10};
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra(AppConstant.KEY_MANG_SO,arrNums);
        startActivity(intent);

    }

    public void sendObject(View view) {
//        Type Casting

        Student student = new Student("Nguyen van teo" , 10);
        ArrayList<Student> students  = new ArrayList<>();
        students.add(student);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra(AppConstant.KEY_OBJECT,  student);
        startActivity(intent);
    }
}