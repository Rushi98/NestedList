package com.example.rushi.nestedlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by rushi on 10/22/17.
 */

public class ChildHolder extends RecyclerView.ViewHolder  {
    private TextView childTv;

    public ChildHolder(View itemView) {
        super(itemView);
        childTv = itemView.findViewById(R.id.tv_child);
    }

    public void setText(String s) {
        childTv.setText(s);
    }
}
