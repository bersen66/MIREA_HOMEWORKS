package lab8.pet;

public class Dog extends Pet {
    public Dog(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
