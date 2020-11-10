public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog(3, "Afcharka", Color.Red);
        System.out.println(dog.toString());
        dog.voise("gav", 3);



        FihtingDog fihtingDog = new FihtingDog(1, "DAsha", Color.Black);
        System.out.println(fihtingDog.toString());
        dog.voise("af");
        FihtingDog fihtingDog1= new FihtingDog(2, "Shasha", Color.White);
        System.out.println(fihtingDog1.toString());
        dog.voise("rrr", 4);



    }
}
