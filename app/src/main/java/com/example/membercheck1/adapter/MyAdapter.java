package com.example.membercheck1.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.membercheck1.R;
import com.example.membercheck1.bean.Info;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by 区枫华 on 2017/5/18.
 */

public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<Info> list;

    public MyAdapter(Context context, List<Info> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Info bean = list.get(position);
        ViewHolder viewHolder = null;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.firStr_tv = (TextView) convertView.findViewById(R.id.fir_text_tv);
            viewHolder.secStr_tv = (TextView) convertView.findViewById(R.id.sec_text_tv);
            viewHolder.head_img = (ImageView) convertView.findViewById(R.id.head_img);
            viewHolder.likeNum_tv = (TextView) convertView.findViewById(R.id.like_number_tv);
            viewHolder.underNum_tv = (TextView) convertView.findViewById(R.id.under_number_tv);
            viewHolder.topNum_tv = (TextView) convertView.findViewById(R.id.top_num_tv);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.firStr_tv.setText(bean.getFristStr());
        viewHolder.secStr_tv.setText(bean.getSecStr());
        viewHolder.head_img.setImageResource(bean.getHeadRes());
        viewHolder.likeNum_tv.setText("" + bean.getLikeNum());
        viewHolder.underNum_tv.setText("" + bean.getUnderNum());
        viewHolder.topNum_tv.setText("" + bean.getTopNum());
        return convertView;
    }

    class ViewHolder {

        public TextView topNum_tv;
        public TextView likeNum_tv;
        public TextView underNum_tv;
        public TextView firStr_tv;
        public TextView secStr_tv;
        public ImageView head_img;

    }

}
