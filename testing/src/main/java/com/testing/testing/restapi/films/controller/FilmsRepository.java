package com.testing.testing.restapi.films.controller;

import com.testing.testing.restapi.films.film.Films;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface FilmsRepository extends JpaRepository<Films, Long> {

}
