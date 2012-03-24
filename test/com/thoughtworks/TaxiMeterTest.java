package com.thoughtworks;

import org.joda.time.LocalTime;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class TaxiMeterTest {

    private StartupPriceProvider provider = mock(StartupPriceProvider.class);
    private TaxiMeter taxiMeter = new TaxiMeter(provider);

    @Test
    public void testRide3MilesAt10InMorning() {
        assertEquals(6, taxiMeter.totalPrice(3, new LocalTime(10, 0)));
    }

    @Test
    public void testRideLessThan3MilesAt10InMorning() {
        assertEquals(6, taxiMeter.totalPrice(1.5, new LocalTime(10, 0)));
    }

    @Test
    public void testRideMoreThan3MilesAt6InMorning() {
        assertEquals(10, taxiMeter.totalPrice(4.5, new LocalTime(6, 0)));
    }

    @Test
    public void testRide3MilesAt2AtNight() {
        assertEquals(7, taxiMeter.totalPrice(3, new LocalTime(2, 0)));
    }

    @Test
    public void testRideLessThan3MilesAt2AtNight() {
        assertEquals(7, taxiMeter.totalPrice(1.5, new LocalTime(2, 0)));
    }

    @Test
    public void testRideMoreThan3MilesAt2AtNight() {
        assertEquals(11, taxiMeter.totalPrice(4.5, new LocalTime(2, 0)));
    }
}
