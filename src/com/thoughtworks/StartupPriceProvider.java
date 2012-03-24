package com.thoughtworks;

import org.joda.time.LocalTime;

public interface StartupPriceProvider {
    int startupPrice(LocalTime localTime);
}
