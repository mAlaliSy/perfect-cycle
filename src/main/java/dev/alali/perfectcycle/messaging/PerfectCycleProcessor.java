package dev.alali.perfectcycle.messaging;

import dev.alali.perfectcycle.check.PerfectCycleChecker;
import dev.alali.perfectcycle.dto.PerfectCycleListResult;
import dev.alali.perfectcycle.dto.PerfectCycleRequest;
import dev.alali.perfectcycle.dto.PerfectCycleRequestList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class PerfectCycleProcessor {

    @Bean
    public Function<PerfectCycleRequestList, PerfectCycleListResult> checkPerfectCycle(PerfectCycleChecker checker) {
        return requestList -> new PerfectCycleListResult(requestList.id(), checker.isPerfectCycle(requestList.list()));
    }

}
