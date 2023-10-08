package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.Sample2Initial;

class AfricanSwallow extends Bird {
    private int numberOfCoconuts;

    public AfricanSwallow(BirdData birdData) {
        super(birdData);
        this.numberOfCoconuts = birdData.numberOfCoconuts;
    }

    @Override
    public int airSpeedVelocity() {
        return 40 - 2 * this.numberOfCoconuts;
    }
}
