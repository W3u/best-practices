package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.sample2Refactor;

/*
新变化：
有些鸟是野生的，有些是家养的，两者之间行为会有很大差异。
这种差异可以建模为Bird类的两个子类：WildBird 和 CaptiveBird。
当时继承只能使用一次，所以想用子类来表现野生和家养的差异，就得先去掉关于“不同品种”的继承关系。
*/
class Bird {

    private SpeciesDelegate speciesDelegate;

    public Bird(BirdData birdData) {
        this.speciesDelegate = selectSpeciesDelegate(birdData);
    }

    private SpeciesDelegate selectSpeciesDelegate(BirdData birdData) {
        switch (birdData.type) {
            case "EuropeanSwallow":
                return new EuropeanSwallowDelegate(birdData);
            case "AfricanSwallow":
                return new AfricanSwallowDelegate(birdData);
            case "NorwegianBlueParrot":
                return new NorwegianBlueParrotDelegate(birdData);
            default:
                return new SpeciesDelegate(birdData);
        }
    }

    public String getName() {
        return speciesDelegate.getBirdData().name;
    }

    public int airSpeedVelocity() {
        return speciesDelegate.airSpeedVelocity();
    }

    public String getPlumage() {
        return speciesDelegate.getPlumage();
    }

}


class BirdData {
    public String type;

    public String name;
    public String plumage;
    public int numberOfCoconuts;

    public int voltage;
    public boolean isNailed;

}