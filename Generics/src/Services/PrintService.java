package Services;

import java.util.*;

public class PrintService<T>{

    private final List<T> generics = new ArrayList<>();

    public void addValue(T value){
        generics.add(value);
    }

    public T first(){
        if(generics.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return generics.get(0);
    }

    public void print() {
        if(generics.isEmpty()){
            throw new IllegalStateException("List is empty");
        }else {
            var one = generics.get(0);
            System.out.print("[ " + one);
            for (int i = 1; i < generics.size(); i++) {
                System.out.print(", " + generics.get(i));
            }
            System.out.println(" ]");
        }
    }
}
