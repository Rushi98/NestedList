package com.example.rushi.nestedlist;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class MyHolder extends RecyclerView.ViewHolder {
    private TextView tv;
    private RecyclerView childRv;
    private ChildAdapter childAdapter;

    public MyHolder(View itemView) {
        super(itemView);
        childRv = itemView.findViewById(R.id.child_rv);
        tv = itemView.findViewById(R.id.tv);
        childAdapter = new ChildAdapter(0);
        tv.setText("Item ");
//        childRv.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayoutManager.VERTICAL, false));
        childRv.setLayoutManager(new GridLayoutManager(itemView.getContext(), 2));
        childRv.setAdapter(childAdapter);
    }

    public void setMembers(int n) {
        childAdapter.setMembers(n);
        tv.setText("Item " + n);
        childAdapter.notifyDataSetChanged();
    }
}
