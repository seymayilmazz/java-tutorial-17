package package1;

/**
 * Created by Şeyma Yılmaz on 30.5.2017.
 */
public class Dog implements Animal {

    @Override
    public void eat() {
        System.out.println("Dog : eating");
    }

    @Override
    public void walk() {
        System.out.println("Dog : walking");
    }

}
