package dev.alali.perfectcycle.service;

import dev.alali.perfectcycle.check.PerfectCycleChecker;
import dev.alali.perfectcycle.dto.PerfectCycleListResult;
import dev.alali.perfectcycle.dto.PerfectCycleRequest;
import dev.alali.perfectcycle.dto.PerfectCycleRequestList;
import dev.alali.perfectcycle.dto.PerfectCycleResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PerfectCycleServiceImpl implements PerfectCycleService {

    private final PerfectCycleChecker perfectCycleChecker;

    @Override
    public PerfectCycleResponse checkPerfectCycles(PerfectCycleRequest request) {
        List<PerfectCycleListResult> results = request.lists()
                .stream()
                .map(this::checkListIsPerfect).toList();
        return new PerfectCycleResponse(results);
    }

    private PerfectCycleListResult checkListIsPerfect(PerfectCycleRequestList requestList) {
        boolean isPerfect = perfectCycleChecker.isPerfectCycle(requestList.list());
        return new PerfectCycleListResult(requestList.id(), isPerfect);
    }

}
