package com.example.alexsalajan.movieapp.src.repository;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.alexsalajan.movieapp.src.model.Movie;
import com.example.alexsalajan.movieapp.src.model.User;

/**
 * Created by savac on 4/20/2018.
 */
@Dao
public interface UserDAO {
    @Insert
    public void insertUser(User user);

    @Update
    public void updateUser(User... users);

    @Query("DELETE FROM users WHERE idUser = :idUser")
    public void deleteMovie(int idMovie);


    @Query("SELECT * FROM users WHERE username = :username")
    public User[] getAllUSers();
}
