package com.mohammedev.androidschool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    /*
    *students عرفو مصفوفة بسم
    *  define an arraylist named students
     */

    //   Student  index
    //   s1      , 0
    //   s2      , 1
    //   s3      , 2
    ArrayList<Student> students = new ArrayList<>();
    int cuurentStudent = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.studentListView);



        //String studentName, int studentAge, int studentGrade, int studentImg
        Student s1 = new Student("يوسف",14,12,R.drawable.boy);
        Student s2 = new Student("سلمان",13,10,R.drawable.boy1);
        Student s3 = new Student("ماجد",15,11,R.drawable.boy2);

        students.add(s1);
        students.add(s2);
        students.add(s3);






        /*
         *  ضيفوا عناصر من الكلاس
         *  add objects from class Student
         */


        StudentAdapter studentAdapter = new StudentAdapter(this,0,students);


        listView.setAdapter(studentAdapter);
    }
}