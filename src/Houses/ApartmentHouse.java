package Houses;

public class ApartmentHouse extends House {
//  Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".
//  При создании многоквартирного дома дополнительно принимайте в конструкторе
//  целое число - количество подъездов.
//  В методе toString() выводите в удобном виде всю известную информацию о доме.

  private final int porch;

  public ApartmentHouse(String address, int porch) {
    super(address);
    this.porch = porch;
  }

  public int getPorch() {
    return porch;
  }

  @Override
  public String toString() {
    return String.format("Многоквартирный дом (%d подъездов) по адресу: %s", porch, getAddress());
  }
}
