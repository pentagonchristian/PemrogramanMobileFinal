package com.pentagonchristian.finalmobile;

import java.util.Locale;

public class Consts {
    public static final String API_KEY = "a9fb66b9a6cc01e5d8d310073df09473";
    public static final String BASE_URL = "http://api.themoviedb.org/3/";
    public static final String IMG_URL = "https://image.tmdb.org/t/p/";

    public static String getLang() {
        switch (Locale.getDefault().toString()) {
            case "in_ID":
                return "id-ID";
            default:
                return "en-US";
        }
    }
}
