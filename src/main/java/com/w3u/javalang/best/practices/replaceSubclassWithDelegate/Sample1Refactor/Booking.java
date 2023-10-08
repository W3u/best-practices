package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.Sample1Refactor;

import java.util.Map;

/*
为了解决以下问题，使用 以委托取代子类
- 紧耦合：如果可以不关注子类的存在，在修改超类时，有可能破坏子类。（不过，如果这种偶尔发生的不太频繁，继承还是划算的。）
- 其他方向的变化：如果有别的原因想使用继承，且这个新理由比“高级预订”更有必要，这时就需要换一种方式来处理高级预订。

只看这个重构本身，我并不觉得代码质量得到了提升。继承原本更好的地应对了需求场景，换成委托后，我增加了分发逻辑，双向引用，
复杂度上升不少。不过这个重构可能还是值得的，因为现在“是否高级预订”这个状态时可以改变的了，并且我也可以用继承来表达成其他目的了。
如果的确存在这些需求的话，那么去除原有的继承可能还是划算的。

 */
class Booking {
    private PremiumBookingDelegate premiumBookingDelegate;

    private String show;
    private String date;

    public Booking(String show, String date) {
        this.show = show;
        this.date = date;
    }

    public void bePremium(Booking hostBooking, Map<String, String> extras) {
        this.premiumBookingDelegate = new PremiumBookingDelegate(hostBooking, extras);
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

    private boolean isPremium() {
        return premiumBookingDelegate != null;
    }

    public boolean hasTalkback() {
        return isPremium()
                ? premiumBookingDelegate.hasTalkback()
                : getShow().contains("talkback") && isPeakDay();
    }


    public double basePrice() {
        return isPremium()
                ? premiumBookingDelegate.basePrice()
                : privateBasePrice();
    }

    public double privateBasePrice() {
        double result = getShow().indexOf("price");
        if (isPeakDay()) {
            result += Math.round(result * 0.15);
        }
        return result;
    }

    public boolean hasDinner() {
        return isPremium() && premiumBookingDelegate.hasDinner();
    }

}
