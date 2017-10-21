package com.example.rushi.nestedlist;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/**
 * Created by rushi on 10/21/17.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    public void setRvs(int rvs) {
        this.rvs = rvs;
    }

    private int rvs;

    public MyAdapter(int n) {
        this.rvs = n;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.setMembers(position + 1);
        Log.e("TAG", "onBindViewHolder: " + position + 1);
    }

    @Override
    public int getItemCount() {
        return this.rvs;
    }
}
