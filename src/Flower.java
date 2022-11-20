
public class Flower {

  private String flowerColor;
  private String country;
  private double cost;
  private final int lifeSpan;

  public Flower(String flowerColor, String country, double cost, int lifeSpan) {
    this.flowerColor = (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) ? flowerColor : "белый";
    this.country = (country != null && !country.isEmpty() && !country.isBlank()) ? country : "Россия";
    this.cost = (cost <= 0) ? 1 : cost;
    this.lifeSpan = (lifeSpan <= 0) ? 3 : lifeSpan;
  }

  public String getFlowerColor() {
    return flowerColor;
  }

  public void setFlowerColor(String flowerColor) {
    this.flowerColor = (flowerColor != null && !flowerColor.isEmpty() && !flowerColor.isBlank()) ? flowerColor : "белый";
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = (country != null && !country.isEmpty() && !country.isBlank()) ? country : "Россия";
  }

  public double getCost() {
    return cost;
  }

  public void setCost(double cost) {
    this.cost = (cost <= 0) ? 1 : cost;
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
