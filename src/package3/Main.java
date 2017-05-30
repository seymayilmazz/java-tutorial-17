package package3;

/**
 * Created by Şeyma Yılmaz on 30.5.2017.
 */
public class Main {

    public static void main(String[] args) {

        Button button1 = new Button();
        button1.setClick(new Click() {
            @Override
            public void click() {
                System.out.println("button1 tek tiklanildi");
            }

            @Override
            public void doubleClick() {
                System.out.println("button1 cift tiklanildi");
            }
        });

        Button button2 = new Button();
        Click click = new Click() {
            @Override
            public void click() {
                System.out.println("button2 tek tiklanildi");
            }

            @Override
            public void doubleClick() {
                System.out.println("button2 cift tiklanildi");
            }
        };
        button2.setClick(click);


        Click click1 = new Click() {
            @Override
            public void click() {
                System.out.println("ortak tek tik");
            }

            @Override
            public void doubleClick() {
                System.out.println("ortak cift tik");
            }
        };

        Button button3 = new Button();
        button3.setClick(click1);
        button1.setClick(click1);
        button2.setClick(click1);

    }
}
