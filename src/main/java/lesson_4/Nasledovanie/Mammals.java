package lesson_4.Nasledovanie;

public class Mammals extends Vertebrates{

    boolean hasMilkGlands = true;
    String furColor;

    public Mammals(String furColor){
        this.furColor= furColor;
    }

    public void walk(){
        System.out.println("Млекопитающее идет");
    }

}
