package Lesson_11.Pets;

public class Crocodile extends Pet{
    @Override
    public String getName() {
        return super.getName();
    }

    public Crocodile(String name) {
        super(name);
    }

    @Override
    public void getWhoAmI() {
        super.getWhoAmI();
        System.out.println("i am crocodile.");
    }
}
