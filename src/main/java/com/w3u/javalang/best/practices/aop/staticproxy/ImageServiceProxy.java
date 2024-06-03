package com.w3u.javalang.best.practices.aop.staticproxy;

import java.time.LocalTime;

public class ImageServiceProxy implements ImageService {

    private final ImageService imageService;

    public ImageServiceProxy(ImageService imageService) {
        this.imageService = imageService;
    }

    @Override
    public void downloadImage(String name) {
        checkTime();

        imageService.downloadImage(name);
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
