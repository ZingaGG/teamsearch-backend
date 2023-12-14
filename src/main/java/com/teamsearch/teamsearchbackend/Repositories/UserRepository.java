package com.teamsearch.teamsearchbackend.Repositories;

import com.teamsearch.teamsearchbackend.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
