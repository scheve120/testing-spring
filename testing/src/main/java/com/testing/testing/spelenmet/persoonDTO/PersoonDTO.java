package com.testing.testing.spelenmet.persoonDTO;

import com.testing.testing.spelenmet.database.Persoon;

public class PersoonDTO {
    private String naam;
    private String telefoonnummer;

    public PersoonDTO(Persoon persoon) {
        setNaam(maakSamenGesteldeNaam(persoon));
        setTelefoonnummer(persoon.getTelefoonnummer());
    }

    private String maakSamenGesteldeNaam(Persoon persoon) {
        return (persoon.getVoornaam() + " " + persoon.getTussenvoegsel()).trim() + " " + persoon.getAchternaam();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

}
