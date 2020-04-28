package com.testing.testing.spelenmet.dbController;

import com.testing.testing.spelenmet.database.Persoon;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

@Service
@Transactional
public class PersoonService {

    private static Map<Long, Persoon> personen;

    static {
        personen = new HashMap<Long, Persoon>() {
            {
                put(1l, new Persoon(1l, "128849189", "idaho", "123818", "98423", "7128973"));
                put(2l, new Persoon(2l, "52781234", "feuodjqwo", "uhiuwh", "uihfwei", "5728210"));
                put(3l, new Persoon(3l, "8572983419", "ioqejojqw", "ijqojwdq", "hdiuqh", "5891271892"));

            }
        };
    }

    public Persoon findPersoonById(Long id) {
        return personen.get(id);
    }

}