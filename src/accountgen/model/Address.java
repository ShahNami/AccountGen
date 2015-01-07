/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accountgen.model;

/**
 *
 * @author namishah
 */
public class Address {
    private String _streetname;
    private String _postcode;
    private String _streetnumber;
    private String _state;
    private String _country;
    
    public Address(String streetname, String postcode, String streetnumber, String state, String country){
        this._streetname = streetname;
        this._postcode = postcode;
        this._streetnumber = streetnumber;
        this._state = state;
        this._country = country;
    }
    
    public Address(){
        //
    }

    public String getCountry() {
        return _country;
    }
    
    public String getStreetname(){
        return this._streetname;
    }
    
    public String getPostcode(){
        return this._postcode;
    }
    
    public String getStreetnumber(){
        return this._streetnumber;
    }
    
    public String getState(){
        return this._state;
    }

    public void setCountry(String _country) {
        this._country = _country;
    }
    
    public void setStreetname(String _streetname) {
        this._streetname = _streetname;
    }

    public void setPostcode(String _postcode) {
        this._postcode = _postcode;
    }

    public void setStreetnumber(String _streetnumber) {
        this._streetnumber = _streetnumber;
    }

    public void setState(String _state) {
        this._state = _state;
    }
    
    
}
