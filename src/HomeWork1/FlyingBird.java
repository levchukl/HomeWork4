package HomeWork1;

public class FlyingBird extends Bird{


    public FlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly(){
        System.out.println("Can fly ");

    }
    @Override
    public String toString(){
        return "These birds can fly";
    }
}