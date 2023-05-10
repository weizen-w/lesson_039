import Houses.ApartmentHouse;
import Houses.House;
import Houses.PrivateHouse;
import java.util.ArrayList;
import java.util.List;

public class Main {
//  В основном файле программы создайте список домов, в который поместите два частных дома и
//  один многоквартирный.
//  Выведите информацию о домах в списке с использованием цикла for-each.

  public static void main(String[] args) {
    List<House> houseList = new ArrayList<>();
    houseList.add(new PrivateHouse("51545 Waldbröl, Brölstr. 14"));
    houseList.add(new PrivateHouse("51545 Waldbröl, Kölnerstr. 26"));
    houseList.add(new ApartmentHouse("54788 Köln, Aspenweg Str. 89", 5));
    for (House houses : houseList) {
      System.out.println(houses);
    }
  }
}
