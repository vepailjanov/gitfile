package practice5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        ArrayList<Double> doubles = generatelist();
        Double secondelement = retriment(doubles, 3);
        Double set1 = set(doubles,3,12.43);
    }
    public static ArrayList<Double> generatelist(){
    ArrayList<Double> RandomNums = new ArrayList<Double>();
        for (int i = 0; i < 10; i++) {
            RandomNums.add(Math.random()*100);
        }
        System.out.println(RandomNums);
       return RandomNums;
    }
    public static Double retriment(ArrayList<Double> list, int posititon){
        return list.get(posititon);

    }
    public static Double set (ArrayList<Double> list, int posititon, Double value){
        return list.set(posititon,value);

    }
}
