package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor1;

import org.apache.commons.lang3.StringUtils;

// Direct inheritance
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getTitleSuffix() {
        return StringUtils.EMPTY;
    }

    public String getLocation() {
        return StringUtils.EMPTY;
    }

    @Override
    public String toString() {
        return name + " [" + getTitleSuffix() + "] (" + getLocation() + ")";
    }

}
