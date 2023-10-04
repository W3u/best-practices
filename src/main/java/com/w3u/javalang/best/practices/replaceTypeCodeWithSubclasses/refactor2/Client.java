package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor2;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Client {

    public void entryMethod() {
        Employee employee = new Employee("Alice", "engineer");
        log.info(employee.toString());
    }

}
