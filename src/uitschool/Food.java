package uitschool;

public class Food {
    public void prepear(Cookable c){
        c.cook();
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.prepear(new Cookable() {
            @Override
            public void cook() {
                System.out.println("cook");
            }
        });
    }
}
