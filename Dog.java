
public class Dog {
  private String dogName;
  private String dogOwnerName;
  private int dogAge;

  /* Default constructor. */
  public Dog() {
    dogName = "unknown";
    dogOwnerName = "unknown";
    dogAge = 0;
  }

  /* Constructor with parameters given. */
  public Dog(String name, String ownerName, int age) {
    dogName = name;
    dogOwnerName = ownerName;
    dogAge = age;
  }

  /* Getters and Setters for fields. */
  public String getName() {
    return dogName;
  }

  public void setName(String name) {
    dogName = name;
  }

  public String getOwnerName() {
    return dogOwnerName;
  }

  public void setOwnerName(String ownerName) {
    dogOwnerName = ownerName;
  }

  public int getAge() {
    return dogAge;
  }

  public void setAge(int age) {
    dogAge = age;
  }

  /* Method to make the dog bark. */
  public void bark() {
    System.out.printf("%s says: ruff ruff", dogName);
  }

  /* The main method. Instantiate two Dogs and interact with the objects. */
  public static void main(String[] args) {
    Dog firstDog = new Dog("Simon", "Steven", 4);
    Dog secondDog = new Dog();

    secondDog.setName("Rose");
    secondDog.setOwnerName("Anna");

    System.out.printf("First Dog's name: %s, owner's name: %s, age: %d\n",
      firstDog.getName(), firstDog.getOwnerName(), firstDog.getAge());

    System.out.printf("Second Dog's name: %s, owner's name: %s, age: %d\n",
      secondDog.getName(), secondDog.getOwnerName(), secondDog.getAge());

    firstDog.bark();
  }
}
