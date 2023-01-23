package dev.alali.perfectcycle.dto;

import jakarta.validation.constraints.NotNull;

import java.util.List;

public record PerfectCycleRequestList(@NotNull String id, @NotNull List<Integer> list) {
}
