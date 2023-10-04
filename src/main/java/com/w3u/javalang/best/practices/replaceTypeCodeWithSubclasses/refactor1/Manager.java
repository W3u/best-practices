package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor1;

class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public String getTitleSuffix() {
        return "MNG";
    }

    @Override
    public String getLocation() {
        return "New York";
    }

}
