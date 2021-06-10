package com.pentagonchristian.finalmobile.data.local;

//import com.aahmdar.finalmobile.data.local.models.FavoriteTv;

import io.realm.Realm;
        import io.realm.RealmQuery;

public class FavoriteHelper {
    private static Realm backgroundThreadRealm;
    private static FavoriteHelper favHelper;

    private FavoriteHelper(Realm realm) {
        backgroundThreadRealm = realm;
    }

    public static FavoriteHelper getInstance(Realm realm) {
//        Realm.init(context);
//
//        String realmName = "My Project";
//        RealmConfiguration config = new RealmConfiguration.Builder().allowWritesOnUiThread(true).
//                name(realmName).
//                build();
//
//        backgroundThreadRealm = Realm.getInstance(config);

        if (favHelper == null) {
            favHelper = new FavoriteHelper(realm);
        }

        return favHelper;
    }

    public FavoriteMovie findMovieById(int id) {
        RealmQuery<FavoriteMovie> query = backgroundThreadRealm.where(FavoriteMovie.class);
        query.equalTo("id", id);
        FavoriteMovie result = query.findFirst();

        return result;
    }

    public void insertMovie(String title, String posterPath, int id) {
        FavoriteMovie movie = new FavoriteMovie();
        movie.setPosterPath(posterPath);
        movie.setTitle(title);
        movie.setId(id);
        backgroundThreadRealm.executeTransaction (transactionRealm -> {
            transactionRealm.insert(movie);
        });
    }

//    public FavoriteTv findTvById(int id) {
//        RealmQuery<FavoriteTv> query = backgroundThreadRealm.where(FavoriteTv.class);
//        query.equalTo("id", id);
//        FavoriteTv result = query.findFirst();
//
//        return result;
//    }
//
//    public void insertTv(String title, String posterPath, int id) {
//        FavoriteTv movie = new FavoriteTv();
//        movie.setPosterPath(posterPath);
//        movie.setTitle(title);
//        movie.setId(id);
//        backgroundThreadRealm.executeTransaction (transactionRealm -> {
//            transactionRealm.insert(movie);
//        });
//    }

}