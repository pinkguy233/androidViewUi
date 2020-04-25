package com.pink.drawerlayout;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.pink.drawerlayout.entity.Acg;

import java.util.List;

public class FruitAdapter extends RecyclerView.ViewHolder<FruitAdapter.ViewHoler>{


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

    


}
