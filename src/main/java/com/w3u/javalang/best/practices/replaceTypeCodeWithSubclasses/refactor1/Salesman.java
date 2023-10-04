package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor1;

class Salesman extends Employee {

    public Salesman(String name) {
        super(name);
    }

    @Override
    public String getTitleSuffix() {
        return "MKTS";
    }

    @Override
    public String getLocation() {
        return "London";
    }

}
