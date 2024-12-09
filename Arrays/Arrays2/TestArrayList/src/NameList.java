import java.util.ArrayList;
import java.util.Scanner;

public class NameList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> listName = new ArrayList<>();

        System.out.print("Do you want to add a name to the list? ");
        String decision = sc.nextLine();

        while (decision.equalsIgnoreCase("yes")) {
            listName.add(sc.nextLine());
            System.out.print("Do you want to add a name to the list? ");
            decision = sc.nextLine();
            if (decision.equalsIgnoreCase("no")) {
                System.out.println("no more names");
            }
        }
        System.out.println();

        for (String summaryList: listName) {
            System.out.println(summaryList);
        }

        System.out.println(listName.size());
    }
}
