/**
 * Created by Yagel on 23/01/2018.
 */

class Costumer {
    private static  int _no_of_costumers=0;
    private int _id;
    private String _name;
    private String _place;
    private String _kod;

    public Costumer(String name, String place, String kod){
        _no_of_costumers++;
        _id=_no_of_costumers;
        _name=name;
        _place=place;
        _kod=kod;
    }


    //get and set methoud
    public void setKod(String _kod) {
        this._kod = _kod;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setPlace(String _place) {
        this._place = _place;
    }

    public String getKod() {
        return _kod;
    }

    public String getName() {
        return _name;
    }

    public String getPlace() {
        return _place;
    }

}
