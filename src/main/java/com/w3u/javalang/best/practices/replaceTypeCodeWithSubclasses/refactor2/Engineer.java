package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor2;

class Engineer extends EmployeeType {
    @Override
    public String getTitleSuffix() {
        return "IT";
    }

    @Override
    public String getLocation() {
        return "Shanghai";
    }
}
