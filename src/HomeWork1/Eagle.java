package HomeWork1;

public class Eagle extends FlyingBird{

    public Eagle(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public boolean fly(){
        System.out.print("Eagle can fly");
        return false;
    }
    @Override
    public String toString(){
        return "Eagle has feathers and lay eggs";
    }
}
