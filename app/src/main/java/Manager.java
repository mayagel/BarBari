/**
 * Created by Yagel on 23/01/2018.
 */

public class Manager {

    private static int _id;
    private String _name;
    private String _pass;
    private static Bar _my_bar;

    public Manager(int id, String name, String pass, Bar my_bar){
     _id=id;
     _name=name;
     _pass=pass;
     _my_bar=my_bar;
    }

    public String getName() {
        return _name;
    }

    public static Bar getMyBar() {
        return _my_bar;
    }

    public static int getId() {
        return _id;
    }

    public String getPass() {
        return _pass;
    }
}
