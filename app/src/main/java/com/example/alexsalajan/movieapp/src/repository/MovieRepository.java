package com.example.alexsalajan.movieapp.src.repository;

import com.example.alexsalajan.movieapp.src.model.Movie;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MovieRepository extends Repo implements MovieRepositoryI {
    @Override
    public void getAllMovies() throws SQLException {

        List<Movie> movies = new ArrayList<>();

        ResultSet rs = selectQuery("SELECT * FROM movie");
//        ResultSet rs = selectQuery("SELECT * FROM movie m, user_movie um WHERE m.idmovie = um.idmovie");

        while (rs.next()) {
            Movie movie = new Movie();
            movie.setIdMovie(rs.getInt("idmovie"));
            movie.setDescription(rs.getString("description"));
//            movie.setIdUser_rating(new HashMap<Integer, Double>(idUser, rating));
            movies.add(movie);
        }
        connection.close();

        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i).getDescription());
        }
//        return movies;

    }
}
