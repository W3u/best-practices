package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.sample2Refactor;

import org.apache.commons.lang3.StringUtils;

public class SpeciesDelegate {

    private BirdData birdData;

    public SpeciesDelegate(BirdData birdData) {
        this.birdData = birdData;
    }

    public BirdData getBirdData() {
        return birdData;
    }

    public int airSpeedVelocity() {
        return 0;
    }

    public String getPlumage() {
        if (StringUtils.isEmpty(birdData.plumage))
            return "average";
        return birdData.plumage;
    }

}
