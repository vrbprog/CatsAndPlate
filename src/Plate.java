public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void setFood(int food) {
        if(food > 0) {
            this.food += food;
            System.out.println("Plate add " + food + " food.");
        }
        else{
            System.out.println("Food cannot be negative.");
        }
    }
    public boolean decreaseFood(int n) {
        if(n <= food) {
            food -= n;
            return true;
        }else{
            return false;
        }
    }
    public void info() {
        System.out.println("plate: " + food);
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
