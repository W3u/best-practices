package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.Sample2Initial;

import org.apache.commons.lang3.StringUtils;

public class NorwegianBlueParrot extends Bird {

    private int voltage;
    private boolean isNailed;

    public NorwegianBlueParrot(BirdData birdData) {
        super(birdData);
        this.voltage = birdData.voltage;
        this.isNailed = birdData.isNailed;
    }

    public String getPlumage() {
        if (this.voltage > 100)
            return "scorched";

        return StringUtils.isEmpty(getPlumage())
                ? "beautiful"
                : getPlumage();
    }

    @Override
    public int airSpeedVelocity() {
        return isNailed
                ? 0
                : 10 + this.voltage / 10;
    }
}
