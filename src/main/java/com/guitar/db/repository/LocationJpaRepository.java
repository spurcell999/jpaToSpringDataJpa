package com.guitar.db.repository;


import com.guitar.db.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {

    List<Location> findByStateLike(String stateName); // jpa query method creates JPQL

    List<Location> findByStateOrCountry(String value, String value2);

    List<Location> findByStateAndCountry(String state, String country);

}
