package com.testing.testing.restapi.films.film;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Films {
    @Id
    private Long id;
    private String filmnaam;
    private String filmtext;
    private String rating;

    private Films() { /* Empty stuf! */}

    public Films(Long id, String filmnaam, String filmtext, String rating) {
        setId(id);
        setFilmnaam(filmnaam);
        setFilmtext(filmtext);
        setRating(rating);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFilmnaam() {
        return filmnaam;
    }

    public void setFilmnaam(String filmnaam) {
        this.filmnaam = filmnaam;
    }

    public String getFilmtext() {
        return filmtext;
    }

    public void setFilmtext(String filmtext) {
        this.filmtext = filmtext;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
