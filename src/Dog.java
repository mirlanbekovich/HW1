public class Dog  extends Animal{

    public Dog(int age, String name, Color color) {
        super(age, name, color);
    }


    public void voise(String voise, int raz){
        System.out.println(getName() + "ГОлос " + voise + "Кол-во " + raz );
    }

    public final void voise(String voise){
        System.out.println(getName() + "ГОлос " + voise);
    }

}
