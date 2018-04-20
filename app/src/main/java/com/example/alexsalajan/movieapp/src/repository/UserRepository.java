package com.example.alexsalajan.movieapp.src.repository;

import android.arch.persistence.room.Room;
import android.content.Context;
import com.example.alexsalajan.movieapp.src.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by savac on 4/20/2018.
 */

public class UserRepository {

    private UserDAO userDAO;
    private AppDatabase db;

    public UserRepository(Context context) {
        db = Room.databaseBuilder(context,
                AppDatabase.class, "database-name").allowMainThreadQueries()
                .build();

        userDAO = db.UserDAO();
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        User[] usersFromDB = userDAO.getAllUSers();
        for (User user : usersFromDB)
            users.add(user);
        return users;
    }



    public void addUser(User user){
        userDAO.insertUser(user);
    }

}
