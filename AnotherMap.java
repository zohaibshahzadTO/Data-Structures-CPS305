import java.util.*;
public class CollectionsDemo {

   public static void main(String[] args) {
      Map m1 = new HashMap();
      m1.put("Zara", "8");
      m1.put("Mahnaz", "31");
      m1.put("Ayan", "12");
      m1.put("Daisy", "14");
      m1.put("Zohaib", "24");

      m1.size();
      m1.remove("Ayan");
      m1.containsKey("Zohaib");
      System.out.println();
      System.out.println(" Map Elements");
      System.out.print("\t" + m1);
      System.out.print(m1.size());
      System.out.print(m1.remove("Ayan"));
      System.out.print(m1.hashCode());
      System.out.print(m1.containsKey("Zara"));
   }
}
