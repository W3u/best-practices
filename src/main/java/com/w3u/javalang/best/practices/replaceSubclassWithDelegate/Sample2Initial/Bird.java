package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.Sample2Initial;

import org.apache.commons.lang3.StringUtils;

class Bird {
    private String name;
    private String plumage;

    public Bird(BirdData birdData) {
        this.name = birdData.name;
        this.plumage = birdData.plumage;
    }

    public String getName() {
        return name;
    }

    public String getPlumage() {
        if (StringUtils.isEmpty(plumage))
            return "average";
        return plumage;
    }

    public int airSpeedVelocity() {
        return 0;
    }
}

class BirdData {

    public String name;
    public String plumage;
    public int numberOfCoconuts;

    public int voltage;
    public boolean isNailed;

}
