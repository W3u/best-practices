package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.Sample1Initial;

import java.util.Map;

class PremiumBooking extends Booking {

    private Map<String, String> extras;

    public PremiumBooking(String show, String date, Map<String, String> extras) {
        super(show, date);
        this.extras = extras;
    }

    public boolean hasTalkback() {
        return getShow().contains("talkback");
    }

    public double basePrice() {
        return Math.round(super.basePrice() + Double.parseDouble(this.extras.get("premiumFee")));
    }

    public boolean hasDinner() {
        return Boolean.parseBoolean(this.extras.get("dinner")) && !super.isPeakDay();
    }

}
