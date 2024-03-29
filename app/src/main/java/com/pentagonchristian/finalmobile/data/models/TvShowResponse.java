package com.pentagonchristian.finalmobile.data.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TvShowResponse {
    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResluts;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private List<com.pentagonchristian.finalmobile.data.models.TvShow> results;

    public int getPage() {
        return page;
    }

    public int getTotalResluts() {
        return totalResluts;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public List<com.pentagonchristian.finalmobile.data.models.TvShow> getResults() {
        return results;
    }
}

