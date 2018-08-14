package com.guitar.db.repository;

import com.guitar.db.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationJpaRepository extends JpaRepository<Location, Long> {
    List<Location> findByStateIgnoreCaseStartingWith(String sateName);
    List<Location> findByStateNotLikeOrderByStateAsc(String sateName);
    List<Location> findByStateIsOrCountryEquals(String value, String value2);
    List<Location> findByStateNot(String state);
}
