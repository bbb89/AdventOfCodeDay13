package com.lukasz;


import java.util.List;


public class Solution {

    private List<Layer> listOfLayers;
    private int delay;
    private int caughtNumber;
    private int severityOfTrip;

    public Solution(List<Layer> listOfLayers, int delay) {
        this.listOfLayers = listOfLayers;
        this.delay = delay;
        this.caughtNumber = 0;
        this.severityOfTrip = 0;

        for(int i = 0; i < listOfLayers.size(); i++) {
            Layer currentLayer = listOfLayers.get(i);
            if(currentLayer.isCaught(delay)) {
                caughtNumber++;
                severityOfTrip += currentLayer.getRange() * currentLayer.getId();
            }
        }
    }

    public int getSeverityOfTrip() {
        return severityOfTrip;
    }

    public int getCaughtNumber() {
        return caughtNumber;
    }

}
