package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.myapplication.R;
import com.example.myapplication.bean.albums_entity;

import java.util.List;

public class Albums_item_Adapter extends ArrayAdapter<albums_entity> {
    private int resoureId;
    public Albums_item_Adapter(Context context, int headImage, List<albums_entity> obj){
        super(context,headImage,obj);
        resoureId = headImage;//这个是传入我们自己定义的界面

    }

    @NonNull
    @Override
    public View getView( int position,  View convertView,  ViewGroup parent) {

        albums_entity myBean = (albums_entity) getItem(position);
        View view;
        if(convertView ==null) {
            view = LayoutInflater.from(getContext()).inflate(resoureId, parent, false);//这个是实例化一个我们自己写的界面Item
        }else {
            view = convertView;
        }

        ImageView headImage = view.findViewById(R.id.grid_IV_Id);
        TextView headText = view.findViewById(R.id.grid_TV_Id);
        headImage.setImageResource(myBean.getImg());
        headText.setText(myBean.getImg_text());
        return view;

        }
}
