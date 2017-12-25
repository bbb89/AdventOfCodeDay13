package com.lukasz;

import java.util.List;

public class Solution2 {
    private int delayToPassWithoutGettingCought;

    public Solution2(List<Layer> listOfLayers) {
        searchForDelay(listOfLayers);
    }

    private void searchForDelay(List<Layer> listOfLayers) {
        for(int i = 1; i < 100000000; i++) {
            Solution solution = new Solution(listOfLayers, i);
            if (solution.getCaughtNumber() == 0) {
                delayToPassWithoutGettingCought = i;
                return;
            }
        }
    }

    public int getDelayToPassWithoutGettingCaught() {
        return delayToPassWithoutGettingCought;
    }

}
