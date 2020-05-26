package git;

import java.util.*;


class Total{
    public double StringToDouble(String number){
        double num = Double.parseDouble(number.replace("$",""));

        return num;
    }

    public double getTotal(LinkedHashMap<String,String> dict){
        double total=0;
        for(String element:dict.keySet()){
            total+=StringToDouble(dict.get(element));
        }
        return total;
    }


}


class Cart{
    String userName;
    double total;
    LinkedHashMap<String , String> LMap=new LinkedHashMap<>();

    public void addItem(String str1, String str2){
        LMap.put(str1,str2);
    }

    public void getPrice(Total totalprice){
        total=totalprice.getTotal(LMap);
    }
    public String toString(){

        return "User name is : "+ userName+"\nAll elements are : " + LMap.toString()+"\nTotal price : "+total;
    }


}

class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String item1 = scan.nextLine();
        String item1Price = scan.nextLine();
        String item2 = scan.nextLine();
        String item2Price = scan.nextLine();
        String item3 = scan.nextLine();
        String item3Price = scan.nextLine();

        Cart cart=new Cart();

        cart.userName=username;
        cart.addItem(item1,item1Price);
        cart.addItem(item2,item2Price);
        cart.addItem(item3,item3Price);

        Total total=new Total();
        cart.getPrice(total);


        System.out.println(cart.toString());
    }
}
