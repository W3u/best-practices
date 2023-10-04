package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor2;

// Indirect inheritance = composition + inheritance on its property
class Employee {

    private String name;
    private EmployeeType type;

    public Employee(String name, String type) {
        this.name = name;
        this.type = createEmployeeType(type);
    }

    static EmployeeType createEmployeeType(String type) {
        switch (type) {
            case "engineer":
                return new Engineer();
            case "manager":
                return new Manager();
            case "salesman":
                return new Salesman();
        }
        throw new RuntimeException("Employee cannot be type of " + type);
    }


    public String getTitleSuffix() {
        return type.getTitleSuffix();
    }

    public String getLocation() {
        return type.getLocation();
    }

    @Override
    public String toString() {
        return name + " [" + getTitleSuffix() + "] (" + getLocation() + ")";
    }

}
