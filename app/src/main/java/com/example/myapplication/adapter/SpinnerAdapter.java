package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.bean.SpinnerItem_entity;

import java.util.List;

public class SpinnerAdapter  extends BaseAdapter {
    private  List<SpinnerItem_entity> mList;
    private  Context mContext;

    public SpinnerAdapter(Context pContext, List<SpinnerItem_entity> plist){
        this.mContext=pContext;
        this.mList=plist;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater _LayoutInflater=LayoutInflater.from(mContext);
        convertView=_LayoutInflater.inflate(R.layout.song_spinner_item, null);
        if(convertView!=null) {
            TextView _TextView1=(TextView)convertView.findViewById(R.id.textview1);
            _TextView1.setText(mList.get(position).getSpinnerItem());
        }
        return convertView;
    }
}
