package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor2;

import org.apache.commons.lang3.StringUtils;

class EmployeeType {

    public String getTitleSuffix() {
        return StringUtils.EMPTY;
    }

    public String getLocation() {
        return StringUtils.EMPTY;
    }

}
