package dev.alali.perfectcycle.controller;

import dev.alali.perfectcycle.dto.PerfectCycleRequestList;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessagePublishingController {

    private final StreamBridge streamBridge;

    @PostMapping("/perfect-cycle/publish-request")
    public void publishRequest(@RequestBody PerfectCycleRequestList requestList) {
        streamBridge.send("perfectCycleRequestProducer-out-0", requestList);
    }
}
