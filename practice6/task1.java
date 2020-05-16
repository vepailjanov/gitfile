package practice6;

import java.util.Arrays;
import java.util.HashSet;

public class task1 {
  public static String[] Studentnames(){
      String[] names = {
                        "maral", "jeren", "nury", "selbi",
                        "jeren", "suray", "maral", "mergen"
      };
      System.out.println(Arrays.toString(names));
      return names;
  }
  public static HashSet<String> hashSet(){
      HashSet<String> names = new HashSet<>();
      for (String result : names) {
          names.add(result);
      }
      System.out.println(names);
    return names;
  }
    public static void main(String[] args) {
        Studentnames();
        hashSet();
    }
}
