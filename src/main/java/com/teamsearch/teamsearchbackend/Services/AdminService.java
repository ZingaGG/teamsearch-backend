package com.teamsearch.teamsearchbackend.Services;

import com.teamsearch.teamsearchbackend.Repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {
    private final UserRepository userRepo;
    private final UserService userService;
    private final OrderService orderService;
    private final TeamService teamService;
}
