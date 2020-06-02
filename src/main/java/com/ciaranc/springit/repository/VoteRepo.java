package com.ciaranc.springit.repository;

import com.ciaranc.springit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepo extends JpaRepository<Vote, Long> {
}
