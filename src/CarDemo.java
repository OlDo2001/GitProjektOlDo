public class CarDemo {
    public static void main(String[] args) {
        // Skapa några objekt (instanser)

        // 1. Skapa en referensvariabel
        Car car1;
        // 2. Skapa objektet (minnesutrymme) med nyckelordet new
        car1 = new Car();

        // Skriv ut en referensvariabel
        System.out.println(car1); // Car@23fc625e

        // Steg 1 och 2 i samma sats
        Car car2 = new Car();
        System.out.println(car2); // Car@3f99bd52

        Car car3 = new Car();
        System.out.println(car3);

        Car car4 = new Car();
        System.out.println(car4);

        // Arbeta med instansvariabler (egenskaper)
        car1.model = "Volvo";
        car1.year = 2020;
        car1.price = 350_000;

        car2.model = "Saab";
        car2.price = 250_000;

        car3.model = "Mercedes";
        car3.year = 2010;
        car3.price = 250_000;

        car4.model = "BMW X7";
        car4.price = 950_000;

        System.out.println(car1.model + " kostar " + car1.price + "kr");
        System.out.printf("%s kostar %,d kr \n", car1.model , car1.price);
        System.out.println(car3.model + " kostar " + car3.price + "kr");
        System.out.printf("%s kostar %,d kr \n", car4.model , car4.price);
    }
}
