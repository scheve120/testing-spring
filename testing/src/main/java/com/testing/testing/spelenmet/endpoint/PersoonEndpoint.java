package com.testing.testing.spelenmet.endpoint;


import com.testing.testing.spelenmet.database.Persoon;
import com.testing.testing.spelenmet.dbController.PersoonService;
import com.testing.testing.spelenmet.persoonDTO.PersoonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersoonEndpoint {
    @Autowired
    PersoonService service;

    @GetMapping("getPersoo/{id}")
    public @ResponseBody ResponseEntity<PersoonDTO> getPersoonById(@PathVariable Long id) {
        System.out.println("LOG- REST: getPersoonById/" + id + " - Aanroep van onze restserivce voor het opvragen van één persoon.");
        Persoon persoon = service.findPersoonById(id);
        if (persoon != null) {
            PersoonDTO dto = new PersoonDTO(persoon);
            return new ResponseEntity<>(dto, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
