package model.service;

import model.entities.Contract;

import java.time.format.DateTimeFormatter;


public class ContractService {

    public static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private OnlinePaymentService onlinePaymentService;

    public ContractService() {
    }

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void setOnlinePaymentService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        contract.getInstallment().setAmount(contract.getTotalValue()/months);
        for (int i = 1; i <= months; i++) {
            System.out.print(dtf.format(contract.getInstallment()
                    .getDueDate().plusMonths(i)) + " - ");

            contract.setTotalValue(getOnlinePaymentService()
                    .interest(contract.getInstallment().getAmount(),i));

            contract.setTotalValue(contract.getTotalValue()
                        + getOnlinePaymentService().paymentFee(contract.getTotalValue()));
            System.out.println(contract.getTotalValue());
            contract.setTotalValue(contract.getInstallment().getAmount());
        }
    }
}
