package lesson_6.Sets;

public class User {

    String name;
    Integer id;

    public User(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString(){
        String result;
        result = name + ":  " + id;
        return result;
    }


}
