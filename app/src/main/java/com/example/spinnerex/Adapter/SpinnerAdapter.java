package com.example.spinnerex.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.spinnerex.R;
import com.example.spinnerex.model.SingleRow;

import java.util.List;

public class SpinnerAdapter extends BaseAdapter {

    List<SingleRow> list;
    Context context;
    public SpinnerAdapter(Context context1 , List<SingleRow> list) {

        context =context1;
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
    public View getView(int position, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.single_row,viewGroup,false);
        TextView name = (TextView) row.findViewById(R.id.name);
        ImageView image =(ImageView) row.findViewById(R.id.image);

        SingleRow temp = (SingleRow) list.get(position);

            name.setText(temp.name);
            image.setImageResource(temp.image);

        return row;
    }
}
