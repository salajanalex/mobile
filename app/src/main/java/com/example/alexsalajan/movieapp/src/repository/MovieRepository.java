package com.example.alexsalajan.movieapp.src.repository;

import android.arch.persistence.room.Room;
import android.content.Context;

import com.example.alexsalajan.movieapp.src.model.Movie;


import java.util.ArrayList;
import java.util.List;

public class MovieRepository {
    private MovieDAO movieDAO;
    private AppDatabase db;

    public MovieRepository(Context context) {
        db = Room.databaseBuilder(context,
                AppDatabase.class, "database-name").allowMainThreadQueries()
                .build();

        movieDAO = db.MovieDAO();
    }

    public List<Movie> getAllMovies() {
        List<Movie> movies = new ArrayList<>();
        Movie[] moviesFromDB = movieDAO.getAllMovies();
        for (Movie movie : moviesFromDB)
            movies.add(movie);
        return movies;
    }

    public void deleteMovie(int idMovie){
        movieDAO.deleteMovie(idMovie);
    }

    public  void updateMovie(Movie movie){
        movieDAO.updateMovie(movie);
    }

    public void addMovie(Movie movie){
        movieDAO.insertMovie(movie);
    }


}
