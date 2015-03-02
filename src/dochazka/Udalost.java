/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dochazka;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author ml
 */
public class Udalost {
    private Calendar cas;
    private String typ = "příchod";
    
    public Udalost(){
        this.cas = Calendar.getInstance();
    }
    
    public void setCas(String cas) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
	Date date = sdf.parse(cas);
        this.cas.setTime(date);
    }
    
    public int getMinuta(){
        return this.cas.get(Calendar.MINUTE);
    }
    
    public int getHodina(){
        return this.cas.get(Calendar.HOUR);
    }
    
    public int getDen(){
        return this.cas.get(Calendar.DATE);
    }
    
    public int getMesic(){
        return this.cas.get(Calendar.MONTH)+1;
    }
    
    public int getRok(){
        return this.cas.get(Calendar.YEAR);
    }
    
    public String getTyp(){
        return this.typ;
    }
    
    public void setTyp(String typ){
        this.typ = typ;
    }
    
    public String getCas(){
        return this.getHodina() + ":" + this.getMinuta();
    }
    
    public String getDatum(){
        return this.getDen() + "." + this.getMesic() + "." + this.getRok();
    }

    @Override
    public String toString(){
       return new StringBuffer(" Čas: ").append(this.getCas()).append(" ")
                  .append(this.getDatum()).toString(); 
    }
}
