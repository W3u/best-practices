package com.w3u.javalang.best.practices.replaceTypeCodeWithSubclasses.refactor2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void entryMethod() {
        Client client = new Client();
        client.entryMethod();
    }
}