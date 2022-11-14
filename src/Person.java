public class Person {

  private final int yearOfBirth;
  private final String name;
  private String town;
  private String jobTitle;

  public Person(String name, String town, int yearOfBirth) {
    if (yearOfBirth <= 0) {
      this.yearOfBirth = 0;
    } else {
      this.yearOfBirth = yearOfBirth;
    }
    if (name == "" || name == null) {
      this.name = "...информация не указана...";
    } else {
      this.name = name;
    }
    if (town == "" || town == null) {
      this.town = "...информация не указана...";
    } else {
      this.town = town;
    }
  }

  public Person(String name, String town, int yearOfBirth, String jobTitle) {
    this(name, town, yearOfBirth);
    if (jobTitle == "" || jobTitle == null) {
      this.jobTitle = "...информация не указана...";
    }else{
      this.jobTitle = jobTitle;
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
