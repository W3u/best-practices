package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.Sample1Initial;

class Booking {
    private String show;
    private String date;

    public Booking(String show, String date) {
        this.show = show;
        this.date = date;
    }

    public String getShow() {
        return show;
    }

    public String getDate() {
        return date;
    }

    public boolean isPeakDay() {
        return date.contains("Saturday") || date.contains("Sunday");
    }

    public boolean hasTalkback() {
        return getShow().contains("talkback") && isPeakDay();
    }

    public double basePrice() {
        double result = getShow().indexOf("price");
        if (isPeakDay()) {
            result += Math.round(result * 0.15);
        }
        return result;
    }


}
