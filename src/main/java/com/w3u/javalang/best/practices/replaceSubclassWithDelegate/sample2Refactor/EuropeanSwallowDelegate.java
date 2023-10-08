package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.sample2Refactor;

public class EuropeanSwallowDelegate extends SpeciesDelegate {
    public EuropeanSwallowDelegate(BirdData birdData) {
        super(birdData);
    }

    @Override
    public int airSpeedVelocity() {
        return 35;
    }
}
