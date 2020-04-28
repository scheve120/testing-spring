package com.testing.testing.spelenmet.database;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersoonRepository extends CrudRepository<Persoon, Long> {

}
