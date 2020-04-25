package com.pink.drawerlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.pink.drawerlayout.entity.Acg;

import java.util.List;

public class AcgAdapter extends RecyclerView.Adapter<AcgAdapter.ViewHoler>{


    private Context mContext;
    private List<Acg> mAcgList;

    public class ViewHoler extends  RecyclerView.ViewHolder{
        CardView cardView;
        ImageView acgImage;
        TextView acgName;

        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            cardView = (CardView) itemView;
            acgImage = itemView.findViewById(R.id.acg_image);
            acgName = itemView.findViewById(R.id.acg_name);
        }
    }





    public AcgAdapter(List<Acg> acgs){
        mAcgList =acgs;
    }


    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.frui_item,parent,false);
        return new ViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
        Acg acg = mAcgList.get(position);
        holder.acgName.setText(acg.getName());
        Glide.with(mContext).load(acg.getImagerId()).into(holder.acgImage);
    }

    @Override
    public int getItemCount() {
        return mAcgList.size();
    }



}
