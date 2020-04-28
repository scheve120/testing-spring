package com.testing.testing.restapi.films.controller;

import com.testing.testing.restapi.films.film.Films;
import com.testing.testing.spelenmet.database.Persoon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class FilmLijst {

    @Autowired
    private FilmsRepository repository;


    public Optional<Films> vindEenFilm(Long id) {
        Optional<Films> filmById = repository.findById(id);
        return filmById;
    }

/*
    private static Map<Long, Films>films;

    static {
        films = new HashMap<Long, Films>() {
            {
                put(1L, new Films(1L,"The Willoughbys", "Drie broers en een zus met vreselijk egoïstische ouders bedenken een plan om voorgoed van ze af te komen en zelf een perfect onvolmaakt gezin te vormen.", "5/5"));
                put(2L, new Films(2L, "The Angry Birds 2", "Vijanden worden vrienden wanneer de biggen en de vogels een wapenstilstand sluiten om samen te vechten tegen een geduchte nieuwe vijand die al hun huizen bedreigt.", "4/5"));
                put(3L, new Films(3L, "Tiger King: Murder, Mayhem and Madness", "Een dierentuineigenaar draait door in dit waargebeurde verhaal vol excentrieke personages over een huurmoord in de schimmige wereld van het fokken van grote katachtigen.", "3/5"));
                put(4L, new Films(4L, "World War II in colour", "Een dierentuineigenaar draait door in dit waargebeurde verhaal vol excentrieke personages over een huurmoord in de schimmige wereld van het fokken van grote katachtigen.", "5/5"));
            }
        };
    }

*/
    public List<Films> findFilms() {
        return repository.findAll();
    }

}

