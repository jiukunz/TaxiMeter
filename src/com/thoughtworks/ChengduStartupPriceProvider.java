package com.thoughtworks;

import org.joda.time.LocalTime;

public class ChengduStartupPriceProvider implements StartupPriceProvider {
    private static final LocalTime TWENTY_TWO = new LocalTime(22, 0);
    private static final LocalTime SIX = new LocalTime(6, 0);
    private static final int DAY_STARTUP_PRICE = 7;
    private static final int MIDNIGHT_STARTUP_PRICE = 8;

    @Override
    public int startupPrice(LocalTime localTime) {
        return localTime.isAfter(TWENTY_TWO) || localTime.isBefore(SIX)
                ? MIDNIGHT_STARTUP_PRICE : DAY_STARTUP_PRICE;
    }
}
