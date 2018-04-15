package com.example.alexsalajan.movieapp.src.model;

import java.util.Map;

public class Movie {

    private Integer idMovie;
    private String name;
    private String description;
    private String genre;
    private Map<Integer, Double> idUser_rating;

    public Integer getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(Integer idMovie) {
        this.idMovie = idMovie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Map<Integer, Double> getIdUser_rating() {
        return idUser_rating;
    }

    public void setIdUser_rating(Map<Integer, Double> idUser_rating) {
        this.idUser_rating = idUser_rating;
    }
}
