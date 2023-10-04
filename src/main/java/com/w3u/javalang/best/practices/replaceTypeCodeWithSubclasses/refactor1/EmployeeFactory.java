package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor1;

class EmployeeFactory {

    public Employee createEmployee(String name, String type) {
        switch (type) {
            case "engineer":
                return new Engineer(name);
            case "manager":
                return new Manager(name);
            case "salesman":
                return new Salesman(name);
        }
        throw new RuntimeException("Employee cannot be type of " + type);
    }

}
