package com.example.alexsalajan.movieapp.src.repository;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.alexsalajan.movieapp.src.model.Movie;

import java.sql.SQLException;
import java.util.List;
@Dao
public  interface MovieDAO {

    @Insert
    public void insertMovie(Movie movie);

    @Update
    public void updateMovie(Movie... movies);

    @Query("DELETE FROM movies WHERE idMovie = :idMovie")
    public void deleteMovie(int idMovie);

    @Query("SELECT * FROM movies")
    public Movie[] getAllMovies();
}
