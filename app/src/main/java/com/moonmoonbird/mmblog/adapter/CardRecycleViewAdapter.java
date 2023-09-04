package com.moonmoonbird.mmblog.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.moonmoonbird.mmblog.R;
import com.moonmoonbird.mmblog.activities.ArticleDetailActivity;
import com.moonmoonbird.mmblog.fragments.ArticleDetaiFragment;
import com.moonmoonbird.mmblog.model.ThreadList;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

public class CardRecycleViewAdapter extends RecyclerView.Adapter<CardRecycleViewAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<ThreadList.Article> goods;

    public CardRecycleViewAdapter(Context mContext, ArrayList<ThreadList.Article> goods) {
        this.mContext = mContext;
        this.goods = goods;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.home_card_item, parent, false);
        return new MyViewHolder(view);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.good_name.setText(goods.get(position).getTitle());
        holder.description.setText(goods.get(position).getDesc());
        holder.tag.setText(String.join(",", goods.get(position).getTags()));
        Picasso.get().load(Uri.parse(goods.get(position).getThumbnail())).into(holder.good_url);
    }

    @Override
    public int getItemCount() {
        return goods.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder{

        private final Context context;
        TextView good_name;
        ImageView good_url;
        TextView description;
        TextView tag;
        MaterialCardView carView;


        MyViewHolder(View itemView){
            super(itemView);
            good_name = (TextView)itemView.findViewById(R.id.name);
            good_url = (ImageView)itemView.findViewById(R.id.url);
            carView = (MaterialCardView) itemView.findViewById(R.id.home_card_container);
            description = (TextView)itemView.findViewById(R.id.description);
            tag = (TextView)itemView.findViewById(R.id.tag);

            context = itemView.getContext();
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "hh", Toast.LENGTH_SHORT).show();
                    Log.e("aaaaaaaaaaa", "hhhhhhh");
                    Intent intent = new Intent(context, ArticleDetailActivity.class);
                    context.startActivity(intent);

//                    AppCompatActivity activity = (AppCompatActivity)context;
//                    Fragment fm = new ArticleDetaiFragment();
//                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.layout, fm).addToBackStack(null).commit();
                }
            });
        }
    }

}
