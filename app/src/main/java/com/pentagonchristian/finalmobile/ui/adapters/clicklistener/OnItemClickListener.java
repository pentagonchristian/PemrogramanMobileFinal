package com.pentagonchristian.finalmobile.ui.adapters.clicklistener;

import com.pentagonchristian.finalmobile.data.models.Movie;
import com.pentagonchristian.finalmobile.data.models.TvShow;
import com.pentagonchristian.finalmobile.data.local.FavoriteMovie;
import com.pentagonchristian.finalmobile.data.local.FavoriteTv;

public interface OnItemClickListener {
    void onClick(TvShow tvShow);
    void onClick(Movie movie);
    void onClick(FavoriteMovie movie);
    void onClick(FavoriteTv tv);
}