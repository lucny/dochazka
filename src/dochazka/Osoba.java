/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dochazka;

/**
 *
 * @author ml
 */
public class Osoba {
    private String jmeno = "";
    private String prijmeni = "";
    private RodneCislo rodnecislo = new RodneCislo("");
    private Udalost[] udalost;

    // private RodneCislo rodnecislo = null;
    
    public Osoba(){
    }
    
    public Osoba(String jmeno, String prijmeni) {
        this.setJmeno(jmeno);
        this.setPrijmeni(prijmeni);
    }

    public Osoba(String jmeno, String prijmeni, String rc) {
        this(jmeno,prijmeni);
        this.rodnecislo = new RodneCislo(rc);
    }
    
    public String getJmeno() {
        return this.jmeno;
    }
    
    public void setJmeno(String jmeno){
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return this.prijmeni;
    }

    public void setPrijmeni(String prijmeni){
        this.prijmeni = prijmeni;
    }
    
    public void setUdalosti(Udalost[] udalosti){
        this.udalost = udalosti;
    }
    
    public Udalost[] getUdalosti(){
        return this.udalost;
    }
    
    @Override
    public String toString(){
        return new StringBuffer("Jméno : ").append(this.jmeno).append(" ").append(this.prijmeni).append(", RČ: ").append(this.rodnecislo.toString()).toString();
        // return new StringBuffer("Jméno : ").append(this.jmeno).append(" ").append(this.prijmeni).toString();
    }

}
