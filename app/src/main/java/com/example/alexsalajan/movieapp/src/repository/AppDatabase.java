package com.example.alexsalajan.movieapp.src.repository;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.alexsalajan.movieapp.src.model.Movie;
import com.example.alexsalajan.movieapp.src.model.User;


    @Database(entities = {Movie.class,User.class}, version = 2)
    public abstract class AppDatabase extends RoomDatabase {
        public abstract MovieDAO MovieDAO();
        public abstract UserDAO UserDAO();




}
