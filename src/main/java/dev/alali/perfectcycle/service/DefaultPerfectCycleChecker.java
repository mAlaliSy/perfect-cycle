package dev.alali.perfectcycle.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DefaultPerfectCycleChecker implements PerfectCycleChecker {

    @Override
    public boolean isPerfectCycle(List<Integer> list) {
        if (list.size() == 0) {
            return true;
        }
        Set<Integer> visitedIndexes = new HashSet<>(list.size());
        int indexToVisit = list.get(0);
        while(indexToVisit < list.size() && !visitedIndexes.contains(indexToVisit)) {
            visitedIndexes.add(indexToVisit);
            indexToVisit = list.get(indexToVisit);
        }
        return visitedIndexes.size() == list.size();
    }

}
