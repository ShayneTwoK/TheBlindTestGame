package com.theblindtest.demo.repositories;

import com.theblindtest.demo.entities.Party;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartyRepository extends JpaRepository<Party, Long>  {

}
