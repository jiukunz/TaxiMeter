package com.thoughtworks;

import org.joda.time.LocalTime;

public class TaxiMeter {

    private static final int PRICE_PER_MILE = 2;
    private static final int STARTUP_MILES = 3;
    private StartupPriceProvider provider;


    public TaxiMeter(StartupPriceProvider provider) {
        this.provider = provider;
    }

    public int totalPrice(double miles, LocalTime getOnTime)  {
        int startupPrice = provider.startupPrice(getOnTime);

        return startupPrice + priceBeyondStartupMiles(miles);
    }

    private int priceBeyondStartupMiles(double miles) {
        return miles < STARTUP_MILES
                ? 0 : (int)(PRICE_PER_MILE * Math.ceil(miles - STARTUP_MILES));
    }
}
