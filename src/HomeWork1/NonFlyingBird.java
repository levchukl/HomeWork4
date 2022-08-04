package HomeWork1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public void fly(){
        System.out.println("Can`t fly ");

    }
    @Override
    public String toString(){
        return "These birds can`t fly";
    }

}
