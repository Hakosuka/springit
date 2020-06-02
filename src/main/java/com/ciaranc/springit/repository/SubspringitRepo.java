package com.ciaranc.springit.repository;

import com.ciaranc.springit.model.Subspringit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubspringitRepo extends JpaRepository<Subspringit, Long> {
}
