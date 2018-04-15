package com.example.alexsalajan.movieapp.src.repository;

import com.example.alexsalajan.movieapp.src.model.Movie;

import java.sql.SQLException;
import java.util.List;

public interface MovieRepositoryI {

//    public List<Movie> getAllMovies() throws SQLException;
    public void getAllMovies() throws SQLException;
}
