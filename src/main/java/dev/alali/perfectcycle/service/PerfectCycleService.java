package dev.alali.perfectcycle.service;

import dev.alali.perfectcycle.dto.PerfectCycleRequest;
import dev.alali.perfectcycle.dto.PerfectCycleResponse;

public interface PerfectCycleService {

    PerfectCycleResponse checkPerfectCycles(PerfectCycleRequest request);

}
