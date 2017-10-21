package com.example.rushi.nestedlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.zip.Inflater;

/**
 * Created by rushi on 10/22/17.
 */

public class ChildAdapter extends RecyclerView.Adapter<ChildHolder> {

    public ChildAdapter(int members) {
        this.members = members;
    }

    public void setMembers(int members) {
        this.members = members;
        notifyDataSetChanged();
    }

    private int members;

    @Override
    public ChildHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ChildHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.child_item, parent, false));
    }

    @Override
    public void onBindViewHolder(ChildHolder holder, int position) {
        holder.setText((position + 1) + "");
    }

    @Override
    public int getItemCount() {
        return this.members;
    }
}
