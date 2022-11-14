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
    Car lada = new Car("Lada","Granta",2015,"Россия", "желтый", 1.7f);
    Car audi = new Car("Audi","A8 50 L TDI quattro",2020,"Германия", "черный", 3.0f);
    Car bmw = new Car("BMW","Z8",2021,"Германия", "черный", 3.0f);
    Car kia = new Car("Kia","Sportage 4-го",2018,"Южная Корея", "красный", 2.4f);
    Car hyundai= new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6f);
    System.out.println(lada);
    System.out.println(audi);
    System.out.println(bmw);
    System.out.println(kia);
    System.out.println(hyundai);
  }
}
