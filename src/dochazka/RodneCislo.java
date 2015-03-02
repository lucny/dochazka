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
public class RodneCislo {
    private String rc = "";
    
    public RodneCislo(String rodneCislo){
        if (checkoutRC(rodneCislo)) 
            this.setRC(rodneCislo);
        else
            this.setRC("neplatné");
    }
    
    public String getRC() {
        return this.rc;
    }
    
    public void setRC(String rodneCislo) {
        this.rc = rodneCislo;
    }
    
    public static boolean checkoutRC(String rodneCislo){
        if (rodneCislo.length()>11 || rodneCislo.length()<10) return false;
        if (rodneCislo.charAt(6)!='/') return false;
        return true;
    }
    
    @Override
    public String toString(){
        return this.getRC();
    }
}
