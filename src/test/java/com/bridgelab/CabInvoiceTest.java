package com.bridgelab;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    CabInvoice cabInvoice=new CabInvoice();
    @Test
    public void ifExpectedTotalFareIsGreaterThanMinimumFare_shouldPass(){
        double totalFare= cabInvoice.calculateFare(5.0, 2);
        Assert.assertEquals(52.0,totalFare,0);

    }
    @Test
    public void ifExpectedTotalFareIsLesserThanMinimumFare_shouldPass(){
        double totalFare= cabInvoice.calculateFare(0, 2);
        Assert.assertEquals(5,totalFare,0);

    }
}
