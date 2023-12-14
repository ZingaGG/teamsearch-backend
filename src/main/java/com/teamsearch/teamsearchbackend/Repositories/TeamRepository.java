package com.teamsearch.teamsearchbackend.Repositories;

import com.teamsearch.teamsearchbackend.Entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
