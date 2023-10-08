package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.Sample1Refactor;

import java.util.Map;

class PremiumBookingDelegate {

    private Map<String, String> extras;
    private Booking hostBooking;

    public PremiumBookingDelegate(Booking hostBooking, Map<String, String> extras) {
        this.hostBooking = hostBooking;
        this.extras = extras;
    }

    public boolean hasTalkback() {
        return hostBooking.getShow().contains("talkback");
    }

    public double basePrice() {
        return Math.round(hostBooking.privateBasePrice() + Double.parseDouble(this.extras.get("premiumFee")));
    }

    public boolean hasDinner() {
        return Boolean.parseBoolean(this.extras.get("dinner")) && !hostBooking.isPeakDay();
    }

}
