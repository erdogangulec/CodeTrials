package finall;
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class MyClass {
  public static void main(String[] args) {
    ArrayList<Integer> cars = new ArrayList<Integer>();
    cars.add(88);
    cars.add(77);
    cars.add(99);
    cars.add(34);
    Collections.sort(cars);  // Sort cars
    System.out.print(cars.get(3));
//    for (int i : cars) {
//      System.out.println(i);
    
}
    
  }
