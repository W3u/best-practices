package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.initialVersion;

import java.util.Arrays;
import java.util.List;

class Employee {

    private String name;
    private String type;

    public Employee(String name, String type) {
        validateType(type);
        this.name = name;
        this.type = type;
    }

    private void validateType(String type) {
        List<String> employeeTypes = Arrays.asList("engineer", "manager", "salesman");
        if (!employeeTypes.contains(type)) {
            throw new RuntimeException("Employee cannot be type of " + type);
        }
    }

    @Override
    public String toString() {
        return name + " [" + getTitleSuffix() + "] (" + getLocation() + ")";
    }

    //  Method getTitleSuffix() and getLocation() have similar structure,
    //  they invoke different behavior depending on the value of type code.
    public String getTitleSuffix() {
        switch (type) {
            case "engineer":
                return "IT";
            case "manager":
                return "MNG";
            case "salesman":
                return "MKTS";
        }
        throw new RuntimeException("Employee cannot be type of " + type);
    }

    public String getLocation() {
        switch (type) {
            case "engineer":
                return "Shanghai";
            case "manager":
                return "New York";
            case "salesman":
                return "London";
        }
        throw new RuntimeException("Employee cannot be type of " + type);
    }

}
