package com.teamsearch.teamsearchbackend.Services;

import com.teamsearch.teamsearchbackend.Repositories.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepo;
}
