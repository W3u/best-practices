package com.w3u.javalang.best.practices.aop.staticproxy;

import java.time.LocalTime;

public class VideoServiceProxy implements VideoService {

    private final VideoService videoService;

    public VideoServiceProxy(VideoService videoService) {
        this.videoService = videoService;
    }

    @Override
    public void downloadVideo(String name) {
        checkTime();

        videoService.downloadVideo(name);
    }

    private void checkTime() {
        LocalTime startTime = LocalTime.of(0, 0, 0);
        LocalTime endTime = LocalTime.of(5, 59, 59);
        LocalTime now = LocalTime.now();

        if (now.isAfter(startTime) && now.isBefore(endTime)) {
            throw new RuntimeException("Download is not allowed during the night");
        }
    }

}
