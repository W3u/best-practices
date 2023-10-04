package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor2;

class Salesman extends EmployeeType {
    @Override
    public String getTitleSuffix() {
        return "MKTS";
    }

    @Override
    public String getLocation() {
        return "London";
    }
}
