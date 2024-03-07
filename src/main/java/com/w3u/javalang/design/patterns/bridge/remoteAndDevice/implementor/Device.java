package com.w3u.javalang.design.patterns.bridge.remoteAndDevice.implementor;

public interface Device {

    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);

    void printStatus();

}
