package com.example.minifransizcasozluk;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class LanguageAdapter extends BaseAdapter {

    private Context context;
    private List<language> languages;
    private int resimId;

    public LanguageAdapter(Context context, List<language> languages,int resimId)
    {
        this.context=context;
        this.languages=languages;
        this.resimId=resimId;
    }

    @Override
    public int getCount() {
        return languages.size();
    }

    @Override
    public Object getItem(int position) {
        return languages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v= View.inflate(context,R.layout.row,null);
        ImageView iv=(ImageView)v.findViewById(R.id.imageView);
        TextView tvIngilizce=(TextView)v.findViewById(R.id.fransızca_tv);
        TextView tvTurkce=(TextView)v.findViewById(R.id.textView);
        LinearLayout layout=(LinearLayout)v.findViewById(R.id.text_container);
        layout.setBackgroundColor(resimId);
        iv.setImageResource(languages.get(position).getResimId());
        tvIngilizce.setText(languages.get(position).getEng());
        tvTurkce.setText(languages.get(position).getTr());
        return v;
    }
}
