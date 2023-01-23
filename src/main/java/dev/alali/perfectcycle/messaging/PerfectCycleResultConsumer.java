package dev.alali.perfectcycle.messaging;

import dev.alali.perfectcycle.dto.PerfectCycleListResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
@Slf4j
public class PerfectCycleResultConsumer {

    // for demo purposes, this consumer will consume the result queue and log the result
    @Bean
    public Consumer<PerfectCycleListResult> logPerfectCycleResult() {
        return result -> {
            log.info("Perfect cycle result for: {} isPerfect: {}", result.listId(), result.isPerfectCycle());
        };
    }

}
