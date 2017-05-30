package package2;

/**
 * Created by Şeyma Yılmaz on 30.5.2017.
 */
public class Cat extends Animal {


    @Override
    public void eat() {
        System.out.println("cat eating");
    }

    @Override
    public void walk() {
        System.out.println("cat walking");
    }
}
