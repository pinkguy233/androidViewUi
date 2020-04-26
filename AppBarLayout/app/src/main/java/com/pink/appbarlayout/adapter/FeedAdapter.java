package com.pink.appbarlayout.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pink.appbarlayout.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class FeedAdapter extends RecyclerView.Adapter<FeedAdapter.FeedHolder> {


    public static class FeedHolder extends RecyclerView.ViewHolder{

        CircleImageView mCircleView;
        ImageView mContent;
        TextView mName;

        public FeedHolder(@NonNull View itemView) {
            super(itemView);
            mCircleView = itemView.findViewById(R.id.c_img_avatar);
            mContent = itemView.findViewById(R.id.iv_content);
            mName = itemView.findViewById(R.id.tv_name);
        }
    }

    Context context;

    public FeedAdapter(Context context){
        this.context = context;
    }


    //加载布局
    @NonNull
    @Override
    public FeedHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, parent,false);

        return new FeedHolder(view);
    }


    //填充数据
    @Override
    public void onBindViewHolder(@NonNull FeedHolder holder, int position) {
        Glide.with(context).load(R.drawable.hm).into(holder.mCircleView);
        Glide.with(context).load(R.drawable.qy).into(holder.mContent);
        holder.mName.setText("pinkguy233");
    }

    @Override
    public int getItemCount() {
        return 30;
    }



}
