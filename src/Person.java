public class Person {

  private int yearOfBirth;
  private final String name;
  private String town;
  private String jobTitle;

  public Person(String name, String town, int yearOfBirth) {
    if (name != null && !name.isEmpty() && !name.isBlank()) {
      this.name = name;
    } else {
      this.name = "...информация не указана...";
    }
    if (town != null && !town.isEmpty() && !town.isBlank()) {
      this.town = town;
    } else {
      this.town = "...информация не указана...";
    }
    if (yearOfBirth <= 0) {
      this.yearOfBirth = 0;
    } else {
      this.yearOfBirth = yearOfBirth;
    }
  }

  public Person(String name, String town, int yearOfBirth, String jobTitle) {
    this(name, town, yearOfBirth);
    if (jobTitle != null && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
      this.jobTitle = jobTitle;
    } else {
      this.jobTitle = "...информация не указана...";
    }
  }

  public int getYearOfBirth() {
    return yearOfBirth;
  }

  public void setYearOfBirth(int yearOfBirth) {
    if (yearOfBirth <= 0) {
      this.yearOfBirth = 0;
    } else {
      this.yearOfBirth = yearOfBirth;
    }
  }

  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    if (town != null && !town.isEmpty() && !town.isBlank()) {
      this.town = town;
    } else {
      this.town = "...информация не указана...";
    }
  }

  @Override
  public String toString() {
    return "Привет! Меня зовут " + name + ". " + "Я из города " + town + ". "
        + "Я родился/родилась в " + yearOfBirth + " году. Будем знакомы!";
  }

  public String toStringJobTitle() {
    return "Привет! Меня зовут " + name + ". " + "Я из города " + town + ". "
        + "Я родился/родилась в " + yearOfBirth + " году. Я работаю на должности " + jobTitle
        + ". Будем знакомы!";
  }
}
