package com.w3u.javalang.best.practices.replaceSubclassWithDelegate.Sample2Initial;

 class EuropeanSwallow extends Bird {
     public EuropeanSwallow(BirdData birdData) {
         super(birdData);
     }

     @Override
     public int airSpeedVelocity() {
         return 35;
     }
 }
