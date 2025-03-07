package Service;

import java.util.ArrayList;
import java.util.List;

public class Print<T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    public T first() {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("List is Empty");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        if(!list.isEmpty()) {
            System.out.print(list.get(0));
        }
        for (int i = 1; i <list.size(); i++) {
            System.out.print("," + list.get(i));
        }
        System.out.println("]");
    }
}
