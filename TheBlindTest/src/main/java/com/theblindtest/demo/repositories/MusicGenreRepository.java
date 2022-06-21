package com.theblindtest.demo.repositories;

import com.theblindtest.demo.entities.MusicGenre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicGenreRepository extends JpaRepository<MusicGenre, Long> {

    MusicGenre findByName(String name);

}
