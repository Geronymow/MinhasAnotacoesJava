package entities;

import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String ClientName;
    private String ClientEmail;
    private Date ClientBirthDay;

    public Client() {
    }

    public Client(String ClientName, String ClientEmail, Date ClientBirthDay) {
        this.ClientName = ClientName;
        this.ClientEmail = ClientEmail;
        this.ClientBirthDay = ClientBirthDay;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        this.ClientName = clientName;
    }

    public String getClientEmail() {
        return ClientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.ClientEmail = clientEmail;
    }

    public Date getClientBirthDay() {
        return ClientBirthDay;
    }

    public String toString(String status, Date ClientBirthDay, Date moment)
            throws ParseException {
        String formattedDate1 = sdf2.format(moment);
        String formattedDate2 = sdf.format(ClientBirthDay);
        return "ORDER SUMMARY: " + "\n" +
                "Order moment: " +
                formattedDate1 + "\n" +
                "OrderStatus: " + OrderStatus.ignoreCase(status) + "\n" +
                "Client: " + ClientName + " (" + formattedDate2 + ")" + " - " + ClientEmail + "\n";

    }

}
