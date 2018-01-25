/**
 * Created by Yagel on 23/01/2018.
 */

public class Manager {

    protected static int no_of_manag=0;
    private int _id;
    private String _name;
    private String _pass;
    private Bar _my_bar;

    public Manager( String name, String pass, Bar my_bar){
        no_of_manag++;
     _id=no_of_manag;
     _name=name;
     _pass=pass;
     _my_bar=my_bar;
    }

    public String getName() {
        return _name;
    }

    public Bar getMyBar() {
        return _my_bar;
    }

    public int getId() {
        return _id;
    }

    public String getPass() {
        return _pass;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setMyBar(Bar _my_bar) {
        this._my_bar = _my_bar;
    }

    public void setPass(String _pass) {
        this._pass = _pass;
    }
}
