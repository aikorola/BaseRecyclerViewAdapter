package com.cqw.base_adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BaseViewHolder extends RecyclerView.ViewHolder {
    private View convertView;

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
        this.convertView = itemView;
    }

    public void setText(int id, String text) {
        ((TextView) convertView.findViewById(id)).setText(text);
    }

    public void setImageResource(int id, int resId) {
        ((ImageView) convertView.findViewById(id)).setImageResource(resId);
    }
}
