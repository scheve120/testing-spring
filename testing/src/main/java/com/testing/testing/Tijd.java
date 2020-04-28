package com.testing.testing;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@RestController
public class Tijd {

    @RequestMapping("/tijd") // de ("/") is in dit geval niet persé nodig. => mapping vanaf het gedeelte achter 8080
    public String helloWorld() {
        return "Welkom op mijn super mooie website...";
    }


    public int tijden() {
        System.out.println(LocalTime.now().getSecond());
        return LocalTime.now().getSecond();
    }

    @RequestMapping("tijd/")
    public String test() {
        int seconden = 0;
        do {
            tijden();

            if (tijden() != seconden) {

                seconden = tijden();
                return  "<html>" +
                        "<head>" +
                            "<meta http-equiv= 'refresh' content= '0.50'>" +
                        "</head>" +
                        "<body>" +
                            "<h1>" + LocalTime.now() + "</h1>" +
                        LocalDate.now().getDayOfMonth() +
                        "</body>" +
                        "</html>";
            }
        } while (tijden() < 60);
        return "<html><head><meta http-equiv= 'refresh' content= '1'> </head><body> <h1>" + seconden + "</h1></body></html>";
    }


}
