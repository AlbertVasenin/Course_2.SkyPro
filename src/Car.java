public class Car {

  private final String brand;
  private final String model;
  private final float engineVolume;
  private final String color;
  private final int year;
  private final String country;

  public Car(String brand, String model, int year, String country, String color,
      float engineVolume) {
    if (brand == "" || brand == null) {
      this.brand = "...default...";
    } else {
      this.brand = brand;
    }
    if (model == "" || model == null) {
      this.model = "...default...";
    } else {
      this.model = model;
    }
    if (engineVolume <= 0) {
      this.engineVolume = 1.5f;
    } else {
      this.engineVolume = engineVolume;
    }
    if (color == "" || color == null) {
      this.color = "...белый...";
    } else {
      this.color = color;
    }
    if (year <= 0) {
      this.year = 2000;
    } else {
      this.year = year;
    }
    if (country == "" || country == null) {
      this.country = "...default...";
    } else {
      this.country = country;
    }
  }

  @Override
  public String toString() {
    return brand + " " + model + ", " + year + " год выпуска" + ", сборка " + country + ", цвет "
        + color + ", объем двигателя " + engineVolume + " л.";
  }
}
