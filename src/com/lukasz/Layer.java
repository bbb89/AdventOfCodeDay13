package com.lukasz;

public class Layer {
    private int id;
    private int range;
    private int loopTime;

    public Layer(int id, int range) {
        this.id = id;
        this.range = range;
        this.loopTime = range * 2 - 2;
    }

    public boolean isCaught(int delay) {
        if((id + delay) % loopTime == 0) {
            return true;
        }

        return false;
    }

    public int getId() {
        return id;
    }

    public int getRange() {
        return range;
    }
}
