package chapters.chapter_13.examples.Edible;

public class Chicken extends Animal implements Edible{
    @Override
    public String sound() {
        return "cock-a-doodle-doo";
    }

    @Override
    public String howToEat() {
        return "Fry it";
    }
}
