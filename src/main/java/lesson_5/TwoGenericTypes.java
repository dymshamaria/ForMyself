package lesson_5;

public class TwoGenericTypes<T, V> {

    T firstType;

    V secondType;

    public TwoGenericTypes(T firstType, V secondType){
        this.firstType=firstType;
        this.secondType=secondType;
    }

    public void setFirstType(T firstType){
        this.firstType= firstType;
    }

    public void setSecondType(V secondType){
        this.secondType=secondType;
    }

    public void  showTypes(){
        System.out.println(firstType.getClass().getName());
        System.out.println(secondType.getClass().getName());
    }


    public void print(){
        System.out.println(firstType);
        System.out.println(secondType);
    }
}
