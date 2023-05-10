package Houses;

public abstract class House {
//  Создайте абстрактный класс "Дом". В качестве аргумента конструктора принимайте адрес.
//  Напишите для адреса сеттер и геттер.

  private String address;

  public House(String address) {
    this.address = address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getAddress() {
    return address;
  }

  public abstract String toString();
}
