import android.widget.Chronometer;

/**
 * Created by Yagel on 23/01/2018.
 */

class Bar {
    private static int _no_of_bar=0;
    private int _id;
    private String _name;
    private String _place;
    private String _descriotion;
    private String _open_time;
    private Chronometer[] _the_costumers ;

    public Bar(String name, String place, String descriotion, String open_time, Chronometer[] the_costumer){
        _no_of_bar++;
        _id=_no_of_bar;
        _name=name;
        _place=place;
        _descriotion=descriotion;
        _open_time=open_time;
        _the_costumers=the_costumer;
    }
    public Bar(String name, String place, String descriotion, String open_time){
        _no_of_bar++;
        _id=_no_of_bar;
        _name=name;
        _place=place;
        _descriotion=descriotion;
        _open_time=open_time;
    }
    public void setCostumersList(Chronometer[] the_costumer){
        _the_costumers=the_costumer;
    }

    public void setPlace(String _place) {
        this._place = _place;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public void setDescriotion(String _descriotion) {
        this._descriotion = _descriotion;
    }

    public void setOpenTime(String _open_time) {
        this._open_time = _open_time;
    }

    public static int getId() {
        return _id;
    }
}
