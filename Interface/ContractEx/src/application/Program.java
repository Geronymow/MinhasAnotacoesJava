package application;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.OnlinePaymentService;
import model.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.nextLine(),dtf);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();
        sc.nextLine();
        System.out.print("Entre com o numero de parcelas: ");
        int months = sc.nextInt();
        sc.nextLine();
        System.out.println("Parcelas: ");
        Installment it = new Installment(date,totalValue);
        Contract ct = new Contract(num,date,totalValue,it);
        OnlinePaymentService ps = new PaypalService();
        ContractService cs = new ContractService(ps);
        cs.processContract(ct,months);

        sc.close();
    }
}
