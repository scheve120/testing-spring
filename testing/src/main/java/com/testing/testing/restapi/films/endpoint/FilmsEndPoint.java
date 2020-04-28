package com.testing.testing.restapi.films.endpoint;

import com.testing.testing.restapi.films.controller.FilmLijst;
import com.testing.testing.restapi.films.film.Films;
import com.testing.testing.spelenmet.persoonDTO.PersoonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.annotation.HttpConstraint;
import java.util.List;
import java.util.Optional;

//@Controller
@RestController
public class FilmsEndPoint {
    @Autowired
    FilmLijst filmlijst;

    @GetMapping("vindFIlm/{id}")
    @ResponseStatus(HttpStatus.I_AM_A_TEAPOT)
    public @ResponseBody ResponseEntity<Films> getFilms(@PathVariable Long id) {
        System.out.println("LOG- REST: getPersoonById/" + id + " - Aanroep van onze restserivce voor het opvragen van één persoon.");
        Optional<Films> optionalfilm = filmlijst.vindEenFilm(id);

        if (optionalfilm.isPresent()) {
            Films mijnfilm = optionalfilm.get();
            return new ResponseEntity<>(mijnfilm, HttpStatus.I_AM_A_TEAPOT);
        } else {
            return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/films")
    public @ResponseBody ResponseEntity<List<Films>> getFilms() {
        System.out.println("LOG- REST: getPersoonById/" + " - Aanroep van onze restserivce voor het opvragen van één persoon.");
        List<Films> film = filmlijst.findFilms();

        if (film != null) {
            return new ResponseEntity<>(film, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
