public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }
    public void eat(Plate p) {
        if(!satiety) {
            if(p.decreaseFood(appetite)) {
                System.out.println("The сat " + name + " ate.");
                satiety = true;
            }else{
                System.out.println("The сat " + name + " did not eat.");
            }
        }else {
            System.out.println("The сat " + name + " is already full.");
        }
    }

    @Override
    public String toString() {
        return "Cat {" +
                "name='" + name + '\'' +
                ", appetite=" + appetite +
                ", satiety=" + satiety +
                '}';
    }
}
