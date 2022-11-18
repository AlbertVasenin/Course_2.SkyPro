
public class Flower {

  private String flowerColor;
  private String country;
  private double cost;
  private int lifeSpan;

  public Flower(String flowerColor, String country, double cost, int lifeSpan) {
    if (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) {
      this.flowerColor = flowerColor;
    } else {
      this.flowerColor = "белый";
    }
    if (country != null && !country.isEmpty() && !country.isBlank()) {
      this.country = country;
    } else {
      this.country = "Россия";
    }
    if (cost <= 0) {
      this.cost = 1;
    } else {
      this.cost = cost;
    }
    if (lifeSpan <= 0) {
      this.lifeSpan = 3;
    } else {
      this.lifeSpan = lifeSpan;
    }
  }

  public String getFlowerColor() {
    return flowerColor;
  }

  public void setFlowerColor(String flowerColor) {
    if (flowerColor != null && flowerColor.isEmpty() && flowerColor.isBlank()) {
      this.flowerColor = flowerColor;
    } else {
      this.flowerColor = "белый";
    }
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    if (country != null && !country.isEmpty() && !country.isBlank()) {
      this.country = country;
    } else {
      this.country = "Россия";
    }
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    if (cost <= 0) {
      this.cost = 1;
    } else {
      this.cost = cost;
    }
  }

  public int getLifeSpan() {
    return lifeSpan;
  }

  @Override
  public String toString() {
    return String.format("%s, страна %s, цена %.2f рублей, %d дня/дней стояния.", flowerColor,
        country, cost, lifeSpan);
  }
}
