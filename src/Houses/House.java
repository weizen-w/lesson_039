package Houses;

public abstract class House {
//  Создайте абстрактный класс "Дом". В качестве аргумента конструктора принимайте адрес.
//  Напишите для адреса сеттер и геттер.

//  ***
//  Добавьте классу "Дом" абстрактный метод "снести".

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

  public abstract String demolish();
}
