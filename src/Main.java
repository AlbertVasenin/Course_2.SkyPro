import java.time.LocalDate;
import transport.Car;
import transport.Car.Insurance;
import transport.Car.Key;

public class Main {

  public static void main(String[] args) {
    Person maxim = new Person("Максим", "Минск", 1988, "бренд-менеджер");
    Person anna = new Person("Аня", "Москва", 1993, "методист образовательных программ");
    Person katy = new Person("Катя", "Калининград", 1992, "продакт-менеджер");
    Person artem = new Person("Артем", "Москва", 1995, "директор по развитию бизнеса");
    System.out.println(maxim);
    System.out.println(anna);
    System.out.println(katy);
    System.out.println(artem);
    System.out.println(
        "==========================================================================================");
    System.out.println(maxim.toStringJobTitle());
    System.out.println(anna.toStringJobTitle());
    System.out.println(katy.toStringJobTitle());
    System.out.println(artem.toStringJobTitle());
    System.out.println(
        "==========================================================================================");
    Car lada = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7f);
    Car audi = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0f);
    Car bmw = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0f);
    Car kia = new Car("Kia", "Sportage 4-го", 2018, "Южная Корея", "красный", 2.4f);
    Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6f);
    Car[] cars = new Car[]{lada, audi, bmw, kia, hyundai};
    for (Car car : cars) {
      System.out.println(car);
    }
    System.out.println(
        "==========================================================================================");
    Person vladimir = new Person("Владимир", "Казань", LocalDate.now().getYear() - 21, "");
    System.out.println(vladimir.toStringJobTitle());
    System.out.println(
        "==========================================================================================");
    Flower rosa = new Flower("Роза обыкновенная", "Голландия", 35.59, 4);
    Flower chrysanthemum = new Flower("Хризантема", null, 15, 5);
    Flower peony = new Flower("Пион", "Англия", 69.9, 1);
    Flower gypsophila = new Flower("Гипсофила", "Турция", 19.5, 10);
    Flower[] flowers = new Flower[]{rosa, chrysanthemum, peony, gypsophila};
    for (Flower flower : flowers) {
      System.out.println(flower);
    }
    getBouquet(chrysanthemum, gypsophila, peony);
    System.out.println(
        "=============================================================================");
    bmw.setTransmission("АКПП");
    bmw.setRegistrationNumber("A777AA163");
    System.out.println(bmw);
    System.out.println(bmw.checkRegistrationNumber());
    bmw.changeSummerTires();
    System.out.println(bmw);
    System.out.println(
        "=============================================================================");
    kia.setTransmission("АКПП");
    kia.setRegistrationNumber("В296ХР164");
    kia.setSummerTires(false);
    for (Car car : cars) {
      System.out.println(car);
    }
    System.out.println(
        "=============================================================================");
    bmw.setKey(new Key("Удаленный запуск", "Бесключевой запуск"));
    audi.setKey(new Key("Удаленный запуск", "Бесключевой запуск"));
    lada.setKey(new Key("", "Ключевой запуск"));
    kia.setKey(new Key("", "Бесключевой запуск"));
    hyundai.setKey(new Key("", "Ключевой запуск"));
    for (Car car : cars) {
      System.out.println(car);
    }
    bmw.setInsurance(new Insurance(LocalDate.now(),6524,"ВВВ4587964"));
    bmw.getInsurance().checkInsurancePeriod();
    bmw.getInsurance().checkInsuranceNumber();
  }

  public static void getBouquet(Flower... flower) {
    double cost = 0;
    int minSpan = Integer.MAX_VALUE;
    for (Flower flowers : flower) {
      cost += flowers.getCost();
      if (flowers.getLifeSpan() < minSpan) {
        minSpan = flowers.getLifeSpan();
      }
    }
    System.out.printf("Букет стоит %.2f рублей. ", cost);
    System.out.printf("Дней стояния %d\n", minSpan);
  }
}
