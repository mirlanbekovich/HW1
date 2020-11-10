public final class FihtingDog extends Dog{

    public FihtingDog(int age, String name, Color color) {
        super(age, name, color);
    }

    @Override
    public void voise(String voise, int raz ) {
        System.out.println(getName() + "Вой " + voise + "Кол-во " + raz);;
    }

}
