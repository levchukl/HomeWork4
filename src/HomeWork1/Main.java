package HomeWork1;



public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0]= new Eagle(true,true);
        birds[1]=new Swallow(true,true);
        birds[2]=new Kiwi(true,true);
        birds[3]=new Penguin(true,true);

        for (Bird b:birds){
            b.fly();
        }
      for (Bird b:birds){
          System.out.println(b);
      }

    }


}