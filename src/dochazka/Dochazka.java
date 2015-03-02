/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dochazka;

import java.util.Arrays;

/**
 *
 * @author ml
 */
public class Dochazka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OsobyJSON o = new OsobyJSON();
        System.out.println(o.getOsoba(2));
        System.out.println(Arrays.toString(o.getOsoba(2).getUdalosti()));
        System.out.println(o.seekPrijmeni("Viróza"));
    }
    
}
