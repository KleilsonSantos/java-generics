package Services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {

    List<Integer> integerList = new ArrayList<>();

    public void addValue(Integer varInteger){
        integerList.add(varInteger);
    }

    public Integer first(){
        if(integerList.isEmpty()){
            System.out.println(new IllegalAccessError("List is empty"));
        }
        return integerList.get(0);
    }

    public void print(){
        if(integerList.isEmpty()){
            System.out.println("List is empty");
        }
        var one = integerList.get(0);
        System.out.print("[ " + one);
        for (int i = 1; i < integerList.size(); i++) {
            System.out.print(", " + integerList.get(i));
        }
        System.out.println(" ]");
    }
}
