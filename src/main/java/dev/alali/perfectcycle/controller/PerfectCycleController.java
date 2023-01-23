package dev.alali.perfectcycle.controller;

import dev.alali.perfectcycle.dto.PerfectCycleRequest;
import dev.alali.perfectcycle.dto.PerfectCycleResponse;
import dev.alali.perfectcycle.service.PerfectCycleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class PerfectCycleController {

    private final PerfectCycleService service;

    @PostMapping("perfect-cycle/check")
    public PerfectCycleResponse checkPerfectCycles(@RequestBody @Valid PerfectCycleRequest request) {
        return service.checkPerfectCycles(request);
    }

}
