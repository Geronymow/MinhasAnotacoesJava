package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String [] args) {

        //Covariância

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        // list.add(20);

        System.out.println("------------------------------");

        //Contravariância

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);

    }
}
