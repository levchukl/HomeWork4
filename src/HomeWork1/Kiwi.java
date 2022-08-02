package HomeWork1;

public class Kiwi extends NonFlyingBird{

    public Kiwi(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public boolean fly(){
        System.out.print("Kiwi can`t fly");
        return false;
    }
    @Override
    public String toString(){
        return "Kiwi has feathers and lay eggs";
    }
}
