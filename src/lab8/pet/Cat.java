package lab8.pet;

public class Cat extends Pet {
    public Cat(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
