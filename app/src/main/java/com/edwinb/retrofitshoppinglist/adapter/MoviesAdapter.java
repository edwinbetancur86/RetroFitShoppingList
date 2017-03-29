package com.edwinb.retrofitshoppinglist.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


import com.edwinb.retrofitshoppinglist.R;
import com.edwinb.retrofitshoppinglist.activity.ButtonActivity;
import com.edwinb.retrofitshoppinglist.activity.MainActivity;
import com.edwinb.retrofitshoppinglist.model.Movie;

import java.util.List;


public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MovieViewHolder> {

    private List<Movie> movies;
    private int rowLayout;
    private Context context;
    Intent i;




    public static class MovieViewHolder extends RecyclerView.ViewHolder {
        LinearLayout moviesLayout;
        TextView movieTitle;
        TextView data;
        TextView movieDescription;
        TextView rating;
        Button buttonItem;


        public MovieViewHolder(View v) {
            super(v);
            moviesLayout = (LinearLayout) v.findViewById(R.id.movies_layout);
            //movieTitle = (TextView) v.findViewById(R.id.title);
            //data = (TextView) v.findViewById(R.id.subtitle);
            //movieDescription = (TextView) v.findViewById(R.id.description);
            //rating = (TextView) v.findViewById(R.id.rating);
            buttonItem = (Button) v.findViewById(R.id.buttonItem);

        }


    }

    public MoviesAdapter(List<Movie> movies, int rowLayout, Context context) {
        this.movies = movies;
        this.rowLayout = rowLayout;
        this.context = context;
    }

    @Override
    public MoviesAdapter.MovieViewHolder onCreateViewHolder(ViewGroup parent,
                                                            int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new MovieViewHolder(view);
    }


    @Override
    public void onBindViewHolder(MovieViewHolder holder, final int position) {
        //holder.movieTitle.setText(movies.get(position).getTitle());
        //holder.data.setText(movies.get(position).getReleaseDate());
        //holder.movieDescription.setText(movies.get(position).getOverview());
        //holder.rating.setText(movies.get(position).getVoteAverage().toString());
        holder.buttonItem.setText(movies.get(position).getTitle());;
        holder.buttonItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(context, ButtonActivity.class);
                i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                i.putExtra("movieTitle", movies.get(position).getTitle());
                i.putExtra("movieSum", movies.get(position).getOverview());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }


}
