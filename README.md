<h2>Задача 1.</h2>

<h5>1. Создайте абстрактный класс "Дом". В качестве аргумента конструктора принимайте адрес.</h5>

- Напишите для адреса сеттер и геттер.</br></br>

<h5>2. Создайте классы "Частный дом" и "Многоквартирный дом" - наследники класса "Дом".</h5>

- При создании многоквартирного дома дополнительно принимайте в конструкторе целое число -
  количество подъездов.</br>
- В методе toString() выводите в удобном виде всю известную информацию о доме.</br>

<h5>3. В основном файле программы: </h5>

- создайте список домов, в который поместите два частных дома и один
  многоквартирный.
- Выведите информацию о домах в списке с использованием цикла for-each.

<h2>Задача 2* (не обязательно)</h2>

<h5>1. Добавьте классу "Дом" абстрактный метод "снести".</h5>

<h5>2. Перезапишите этот метод в "Частном доме" и "Многоквартирном доме":</h5>

- для частного дома выводите на экран: "Вы снесли частный дом";
- для многоквартирного дома выведите на экран: "Вы снесли многоквартирный дом. %d подъездов!" Вместо
  %d должно быть число подъездов.