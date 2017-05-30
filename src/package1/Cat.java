package package1;

/**
 * Created by Şeyma Yılmaz on 30.5.2017.
 */
public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat : eating");
    }

    @Override
    public void walk() {
        System.out.println("Cat : walking");
    }

}
