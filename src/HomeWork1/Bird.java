package HomeWork1;

public abstract class Bird {
    private boolean feathers;
    private boolean layEggs;


    public Bird(boolean feathers, boolean layEggs) {
        this.feathers = feathers;
        this.layEggs = layEggs;
    }

    public boolean isFeathers() {
        return feathers;
    }

    public boolean isLayEggs() {
        return layEggs;
    }

    public void setFeathers(boolean feathers) {
        this.feathers = feathers;
    }

    public void setLayEggs(boolean layEggs) {
        this.layEggs = layEggs;
    }

    public abstract void fly();

    @Override
    public String toString() {
        return "Info about bird";
    }

}
