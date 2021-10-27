package lab8.pet;

public class Owl extends Pet {
    public Owl(String name, String type) {
        super(name, type);
    }

    @Override
    public String toString() {
        return "Owl{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
