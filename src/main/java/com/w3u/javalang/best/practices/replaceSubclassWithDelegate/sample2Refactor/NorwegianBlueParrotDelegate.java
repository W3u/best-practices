package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.sample2Refactor;

import org.apache.commons.lang3.StringUtils;

public class NorwegianBlueParrotDelegate extends SpeciesDelegate {
    public NorwegianBlueParrotDelegate(BirdData birdData) {
        super(birdData);
    }

    public String getPlumage() {
        if (this.getBirdData().voltage > 100)
            return "scorched";

        return StringUtils.isEmpty(getPlumage())
                ? "beautiful"
                : getPlumage();
    }

    @Override
    public int airSpeedVelocity() {
        return getBirdData().isNailed
                ? 0
                : 10 + getBirdData().voltage / 10;
    }
}
