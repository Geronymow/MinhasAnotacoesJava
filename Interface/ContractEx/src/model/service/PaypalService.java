package model.service;

public class PaypalService implements OnlinePaymentService {

    public PaypalService() {
    }

    @Override
    public Double paymentFee(double amount) {
        return amount = amount * 0.02;
    }

    @Override
    public Double interest(double amount, int months) {
        return amount += amount * months/100;
    }
}
