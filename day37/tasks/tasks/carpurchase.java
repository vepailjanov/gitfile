package day37.tasks.tasks;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.hamcrest.Condition;

import java.util.Collections;

enum condition{
    OLD,NEW,USED
}
public class carpurchase {
        /*create application that helps you to buy a car & drive it:
        :one: create method 'buy' with enum parameter as conditions of car(NEW, MEDIUM, OLD, WASTE),
        and throws checked/expected exception if its too old
        :two:  create method 'drive' with String parameter as weather,
                and throws unchecked/runtime exception if weather is not normal
         */

    public void buy(condition condition1) throws Exception {
        if (condition1 == condition.OLD || condition1 == condition.USED) {
            throw new Exception("it's not worth to buy it!");
        }
        System.out.println("go ahead and buy it!");
    }
    public void drive(String weather)  {
        if (!weather.equalsIgnoreCase("normal")){
            throw new RuntimeException("try not to drive!");
        }
        System.out.println("good to drive!");
    }

}
