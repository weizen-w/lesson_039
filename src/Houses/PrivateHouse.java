package Houses;

public class PrivateHouse extends House {
//  Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
//  При создании многоквартирного дома дополнительно принимайте в конструкторе
//  целое число - количество подъездов.
//  В методе toString() выводите в удобном виде всю известную информацию о доме.

//  ***
//  для частного дома выводите на экран: "Вы снесли частный дом";

  public PrivateHouse(String address) {
    super(address);
  }

  @Override
  public String toString() {
    return String.format("Частный дом по адресу: %s", getAddress());
  }

  @Override
  public String demolish() {
    return "Вы снесли частный дом";
  }
}
