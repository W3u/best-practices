package com.w3u.javalang.design.patterns.bridge.remoteAndDevice;

import com.w3u.javalang.design.patterns.bridge.remoteAndDevice.abstraction.AdvancedRemote;
import com.w3u.javalang.design.patterns.bridge.remoteAndDevice.abstraction.BasicRemote;
import com.w3u.javalang.design.patterns.bridge.remoteAndDevice.implementor.Radio;
import com.w3u.javalang.design.patterns.bridge.remoteAndDevice.implementor.Television;

public class Client {

    public void testTv() {
        Television television = new Television();
        BasicRemote remote = new BasicRemote(television);

        television.printStatus();
        remote.power();
        remote.volumeUp();
        television.printStatus();
    }


    public void testRadio() {
        Radio radio = new Radio();
        AdvancedRemote remote = new AdvancedRemote(radio);

        radio.printStatus();
        remote.power();
        remote.channelDown();
        remote.mute();
        radio.printStatus();
    }

}
