package com.pentagonchristian.finalmobile.data.api.repository.callback;

import com.pentagonchristian.finalmobile.data.models.Cast;

import java.util.List;

public interface OnCastCallBack {
    void onSuccess(List<Cast> castList, String message);
    void onFailure(String message);
}
