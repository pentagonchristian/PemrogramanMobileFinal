package com.pentagonchristian.finalmobile.data.api;

import com.pentagonchristian.finalmobile.data.models.Movie;
import com.pentagonchristian.finalmobile.data.models.MovieResponse;
import com.pentagonchristian.finalmobile.data.models.TvShow;
import com.pentagonchristian.finalmobile.data.models.TvShowResponse;
import com.pentagonchristian.finalmobile.data.models.CastResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Service {
    @GET("tv/popular")
    Call<TvShowResponse> getTvResults(
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET("tv/{id}")
    Call<TvShow> getTvDetail(
            @Path("id") int id,
            @Query("api_key") String apiKey,
            @Query("language") String language
    );

    @GET("search/tv")
    Call<TvShowResponse> searchTV(
            @Query("api_key") String apiKey,
            @Query("query") String query,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET("movie/popular")
    Call<MovieResponse> getMovieResults(
            @Query("api_key") String apiKey,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET("search/movie")
    Call<MovieResponse> searchMovie(
            @Query("api_key") String apiKey,
            @Query("query") String query,
            @Query("language") String language,
            @Query("page") int page
    );

    @GET("movie/{id}")
    Call<Movie> getMovieDetail(
            @Path("id") int id,
            @Query("api_key") String apiKey,
            @Query("language") String language
    );

    @GET("movie/{id}/credits")
    Call<CastResponse> getCasts(
            @Path("id") int id,
            @Query("api_key") String apiKey,
            @Query("language") String language
    );
}
