package com.teamsearch.teamsearchbackend.Services;

import com.teamsearch.teamsearchbackend.Repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TeamService {
    private final TeamRepository teamRepo;
}
