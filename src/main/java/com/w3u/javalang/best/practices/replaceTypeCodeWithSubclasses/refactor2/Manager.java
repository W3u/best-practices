package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor2;

class Manager extends EmployeeType {
    @Override
    public String getTitleSuffix() {
        return "MNG";
    }

    @Override
    public String getLocation() {
        return "New York";
    }
}
