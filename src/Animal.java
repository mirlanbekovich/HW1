public class Animal {

    private int age;
    private String name;
    private Color color;


    public Animal(int age, String name, Color color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color=" + color +
                '}';
    }
}
