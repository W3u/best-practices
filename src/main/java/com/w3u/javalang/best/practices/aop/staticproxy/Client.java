package com.w3u.javalang.best.practices.aop.staticproxy;

public class Client {

    public static void main(String[] args) {
        ImageService imageService = new ImageServiceProxy(new RealImageService());
        VideoService videoService = new VideoServiceProxy(new RealVideoService());
    }

}
