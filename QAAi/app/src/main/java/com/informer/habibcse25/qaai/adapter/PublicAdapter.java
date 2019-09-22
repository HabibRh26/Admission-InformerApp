package com.informer.habibcse25.qaai.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.informer.habibcse25.qaai.Model_clss.PublicUnivCls;
import com.informer.habibcse25.qaai.R;

import java.util.List;

public class PublicAdapter extends RecyclerView.Adapter<PublicAdapter.ViewHolder> {

    Context mCtx;
    List<PublicUnivCls> publicUnivList;
    ItemListener mListener;

    public PublicAdapter(Context mCtx, List<PublicUnivCls> publicUnivList, PublicAdapter.ItemListener mListener) {
        this.mCtx = mCtx;
        this.publicUnivList = publicUnivList;
        this.mListener = mListener;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.recycler_vw_public_list,parent,false);
        ViewHolder holder = new ViewHolder(view,mListener);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PublicUnivCls publicUniv = publicUnivList.get(position);

       // holder.txtUnivAddress.setText(publicUniv.getUnivAddress());
        holder.txtUnivName.setText(publicUniv.getUnivName());
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            holder.imgUniv.setImageDrawable(mCtx.getDrawable(publicUniv.getImgId()));
        }

    }

    @Override
    public int getItemCount() {
        return publicUnivList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgUniv;
        TextView txtUnivName;
        TextView txtUnivAddress;
        ItemListener onItemListen;
        RelativeLayout layout;


        public ViewHolder(@NonNull View itemView, ItemListener onItemListen) {
            super(itemView);
            imgUniv = itemView.findViewById(R.id.imgVwUniv);
            txtUnivName = itemView.findViewById(R.id.txtVwUnivName);
//            txtUnivAddress = itemView.findViewById(R.id.txtVwUnivAddress);
            layout = itemView.findViewById(R.id.layoutRelative);

            this.onItemListen = onItemListen;

            layout.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            onItemListen.onClickITem(getAdapterPosition());
        }
    }

    public interface  ItemListener{
        void onClickITem(int position);
    }
}

