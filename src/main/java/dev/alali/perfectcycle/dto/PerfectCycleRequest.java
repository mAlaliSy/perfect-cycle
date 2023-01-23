package dev.alali.perfectcycle.dto;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record PerfectCycleRequest(@NotNull List<PerfectCycleRequestList> lists) {

}
