package com.example.androidtest10.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.androidtest10.R;
import com.example.androidtest10.model.school;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class schoolAdapter extends BaseAdapter
{
    private final Context context;
    private final ArrayList<school> list;

    public schoolAdapter(Context context, ArrayList<school> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater infl=((Activity) context).getLayoutInflater(); //lớp
        //LayoutInflater la 1 lớp được sử dụng để khởi tạo tệp XML bố trí vào
        view=infl.inflate(R.layout.item_vdspinner1,viewGroup,false);
        //ánh xạ các đối tượng trên layout
        ImageView imghinh=view.findViewById(R.id.imghinh);
        TextView txtten=view.findViewById(R.id.txtcoso);
        //Cập nhật dữ liệu
        imghinh.setImageResource(list.get(i).getHinh());
        txtten.setText(list.get(i).getHoten());
        return view;
    }
}
