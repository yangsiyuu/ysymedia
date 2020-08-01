package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.example.myapplication.adapter.Albums_item_Adapter;
import com.example.myapplication.bean.albums_entity;

import java.util.ArrayList;
import java.util.List;

public class AlbumsActivity extends AppCompatActivity {
    private List<albums_entity> albumsList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_albums);
        //显示GridView的界面
        intiAlbums();
        Albums_item_Adapter adapter=new Albums_item_Adapter(AlbumsActivity.this,R.layout.albums_grid_item,albumsList);
        GridView gridView=(GridView)findViewById(R.id.GV_1_Id);
        gridView.setAdapter(adapter);

    }

    private void intiAlbums() {
        for (int i=0;i<10;i++){
            albums_entity a=new albums_entity(R.drawable.music_img_album_default,"A");
            albumsList.add(a);
            albums_entity b=new albums_entity(R.drawable.music_img_album_default,"A");
            albumsList.add(b);
            albums_entity c=new albums_entity(R.drawable.music_img_album_default,"A");
            albumsList.add(c);
            albums_entity d=new albums_entity(R.drawable.music_img_album_default,"A");
            albumsList.add(d);
            albums_entity e=new albums_entity(R.drawable.music_img_album_default,"A");
            albumsList.add(e);
        }
    }
}