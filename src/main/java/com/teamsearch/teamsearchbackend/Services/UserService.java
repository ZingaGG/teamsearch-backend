package com.teamsearch.teamsearchbackend.Services;

import com.teamsearch.teamsearchbackend.Repositories.TeamRepository;
import com.teamsearch.teamsearchbackend.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final OrderService orderService;
    private final TeamService teamService;
}
