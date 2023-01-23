package dev.alali.perfectcycle.service;

import dev.alali.perfectcycle.check.DefaultPerfectCycleChecker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DefaultPerfectCycleCheckerTest {

    private DefaultPerfectCycleChecker perfectCycleChecker;

    @BeforeEach
    void setUp() {
        this.perfectCycleChecker = new DefaultPerfectCycleChecker();
    }

    @Test
    @DisplayName("Perfect cycle basic test cases")
    void isPerfectCycleBasicTestCases() {
        List<Integer> list1 = List.of(1, 2, 3);
        assertFalse(perfectCycleChecker.isPerfectCycle(list1));

        List<Integer> list2 = List.of(0, 2, 5);
        assertFalse(perfectCycleChecker.isPerfectCycle(list2));

        List<Integer> list3 = List.of(3, 0, 1, 2);
        assertTrue(perfectCycleChecker.isPerfectCycle(list3));
    }

    @Test
    @DisplayName("Given empty list then is perfect")
    void emptyListPerfectCycle() {
        List<Integer> empty = List.of();
        assertTrue(perfectCycleChecker.isPerfectCycle(empty));
    }

    @Test
    @DisplayName("Given a list with a partial cycle, then is not perfect")
    void partialCycleNotPerfect() {
        List<Integer> partialCycle = List.of(1, 2, 1);
        assertFalse(perfectCycleChecker.isPerfectCycle(partialCycle));
    }


    @Test
    @DisplayName("Given a list with all indexes are appeared without a perfect cycle, then is not perfect")
    void allIndexesOccurredNotPerfect() {
        List<Integer> listAllIndexesAppear = List.of(1, 2, 0, 3, 4, 5);
        assertFalse(perfectCycleChecker.isPerfectCycle(listAllIndexesAppear));
    }

    @Test
    @DisplayName("Given a list with a perfect cycle in reverse, then is perfect")
    void perfectReversed() {
        List<Integer> perfectReversed = List.of(5, 0, 1, 2, 3, 4);
        assertTrue(perfectCycleChecker.isPerfectCycle(perfectReversed));
    }

}