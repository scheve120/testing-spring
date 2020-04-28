package com.testing.testing.spelenmet.database;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persoon {

    @Id
    private Long id;
    private String voornaam;
    private String tussenvoegsel;
    private String achternaam;
    private String bsn;
    private String telefoonnummer;

    public Persoon(Long id, String voornaam, String tussenvoegsel, String achternaam, String bsn, String telefoonnummer) {
        setId(id);
        setVoornaam(voornaam);
        setTussenvoegsel(tussenvoegsel);
        setAchternaam(achternaam);
        setBsn(bsn);
        setTelefoonnummer(telefoonnummer);

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getBsn() {
        return bsn;
    }

    public void setBsn(String bsn) {
        this.bsn = bsn;
    }


    public String getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(String telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

}
