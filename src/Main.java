public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Barsik", 20);
        cats[1] = new Cat("Pushok", 25);
        cats[2] = new Cat("Tigr", 35);
        cats[3] = new Cat("Tyoma", 25);
        cats[4] = new Cat("Seriy", 15);
        Plate plate = new Plate(100);
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("\n\rInfo:");
        System.out.println(plate);
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println();
        plate.setFood(40);
        for (Cat cat : cats) {
            cat.eat(plate);
        }

        System.out.println("\n\rInfo:");
        System.out.println(plate);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

}
