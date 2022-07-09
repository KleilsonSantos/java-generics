package Services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> generics = new ArrayList<>();

    public void addValue(T varInteger){
        generics.add(varInteger);
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
