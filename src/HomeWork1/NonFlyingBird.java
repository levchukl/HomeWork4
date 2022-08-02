package HomeWork1;

public class NonFlyingBird extends Bird{
    public NonFlyingBird(boolean feathers, boolean layEggs) {
        super(feathers, layEggs);
    }
    @Override
    public boolean fly(){
        System.out.print("Can`t fly");
        return false;
    }
    @Override
    public String toString(){
        return "Non flying bird has feathers and lay eggs";
    }

}
