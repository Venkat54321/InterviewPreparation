package lld.parkinglot;

import java.util.Date;

// Payment is an abstract class
public abstract class Payment {
    private double amount;
    private PaymentStatus status;
    private Date timestamp;

    public abstract boolean initiateTransaction();
}

