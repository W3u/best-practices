package com.w3u.javalang.design.patterns.bridge.remoteAndDevice;

import org.junit.jupiter.api.Test;

class ClientTest {

    @Test
    void testTv() {
        Client client = new Client();
        client.testTv();
    }

    @Test
    void testRadio() {
        Client client = new Client();
        client.testRadio();
    }
}