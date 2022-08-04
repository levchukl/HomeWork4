package HomeWork1;

public class Swallow extends FlyingBird{

    public Swallow(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public String toString(){
        return "Swallow can fly";
    }
}