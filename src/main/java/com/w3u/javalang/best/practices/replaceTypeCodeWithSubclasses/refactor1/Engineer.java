package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor1;

class Engineer extends Employee {
    public Engineer(String name) {
        super(name);
    }

    @Override
    public String getTitleSuffix() {
        return "IT";
    }

    @Override
    public String getLocation() {
        return "Shanghai";
    }
}
