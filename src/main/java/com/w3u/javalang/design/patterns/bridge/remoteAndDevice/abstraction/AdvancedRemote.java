package com.w3u.javalang.design.patterns.bridge.remoteAndDevice.abstraction;

import com.w3u.javalang.design.patterns.bridge.remoteAndDevice.implementor.Device;

public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
