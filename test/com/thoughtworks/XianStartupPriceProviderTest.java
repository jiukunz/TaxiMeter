package com.thoughtworks;

import org.joda.time.LocalTime;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class XianStartupPriceProviderTest {

    XianStartupPriceProvider provider = new XianStartupPriceProvider();

    @Test
    public void testStartupPriceAt10InMorning() {
        assertEquals(6, provider.startupPrice(new LocalTime(10, 0)));
    }

    @Test
    public void testStartupPriceAt2AtNight() {
        assertEquals(7, provider.startupPrice(new LocalTime(2,0)));
    }

    @Test
    public void testStartupPriceAt6InMorning(){
        assertEquals(6, provider.startupPrice(new LocalTime(6, 0)));
    }

    @Test
    public void testStartupPriceAt22AtNight() {
        assertEquals(6, provider.startupPrice(new LocalTime(22, 0)));
    }
}
