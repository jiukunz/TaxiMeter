package com.thoughtworks;

import org.joda.time.LocalTime;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ChengduStartupPriceProviderTest {

    ChengduStartupPriceProvider provider = new ChengduStartupPriceProvider();

    @Test
    public void testStartupPriceAt10InMorning() {
        assertEquals(7, provider.startupPrice(new LocalTime(10, 0)));
    }

    @Test
    public void testStartupPriceAt2AtNight() {
        assertEquals(8, provider.startupPrice(new LocalTime(2,0)));
    }

    @Test
    public void testStartupPriceAt6InMorning(){
        assertEquals(7, provider.startupPrice(new LocalTime(6, 0)));
    }

    @Test
    public void testStartupPriceAt22AtNight() {
        assertEquals(7, provider.startupPrice(new LocalTime(22, 0)));
    }
}
