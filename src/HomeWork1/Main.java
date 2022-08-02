package HomeWork1;

import java.lang.reflect.Array;
import java.security.spec.ECGenParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Eagle eagle = new Eagle(true, true);
        Swallow swallow= new Swallow(true,true);
        Kiwi kiwi= new Kiwi(true,true);
        Penguin penguin = new Penguin(true,true);
        List<Bird> birds = new ArrayList<>();
        birds.add(eagle);
        birds.add(swallow);
        birds.add(kiwi);
        birds.add(penguin);

        for (Bird b : birds) {
            String info = b.toString();
            System.out.println(info);
        }
        for(Bird b : birds) {
            System.out.println(b.fly());
        }

    }


}