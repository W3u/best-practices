package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.sample2Refactor;


public class AfricanSwallowDelegate extends SpeciesDelegate {

    public AfricanSwallowDelegate(BirdData birdData) {
        super(birdData);
    }

    @Override
    public int airSpeedVelocity() {
        return 40 - 2 * this.getBirdData().numberOfCoconuts;
    }
}
