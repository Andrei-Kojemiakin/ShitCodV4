package Start;

public class Cat {

    private static Cat CatBarsik;
    String name;
    int age;

    //для первого кота
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //для второго кота
    public Cat(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Cat Barsik = new Cat("Barsik", 5);
        Cat streetCatNamedBob = new Cat("Bob");

        System.out.println(CatBarsik);
    }

}