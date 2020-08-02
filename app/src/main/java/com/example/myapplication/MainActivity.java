package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.widget.Spinner;

import com.example.myapplication.adapter.SpinnerAdapter;
import com.example.myapplication.bean.SpinnerItem_entity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_spinner);
        //初始化控件
        Spinner spinner1  = (Spinner) findViewById(R.id.spinner1);
        // 建立数据源
        List<SpinnerItem_entity> s=new ArrayList<SpinnerItem_entity>();
        s.add(new SpinnerItem_entity("USB"));
        s.add(new SpinnerItem_entity("BT"));
        //  建立Adapter绑定数据源
        SpinnerAdapter _MyAdapter=new SpinnerAdapter(this, s);
        //绑定Adapter
        spinner1.setAdapter(_MyAdapter);
    }
}