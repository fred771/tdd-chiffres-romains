package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {this.valeur = n;}

    public String en_romain() {
        String res = "";
    	
        
        if(valeur >= 1 && valeur <= 3){
            res = "I" ;
            for ( int i = 1 ; i < valeur ; i++ ) {
                res += "I" ;
            }
        }
        if(valeur == 4)
            return "IV";
        if(valeur == 5)
            return "V";

        if (valeur >= 5 && valeur <= 8) {
            res = "V" ;
            for ( int i = 5 ; i < valeur ; i++ ) {
                res += "I"; 
            }
        }

        if(valeur >= 10 && valeur < 40){
            res = "X";
            for ( int i = 10 ; i < valeur ; i = i + 10 )
                res += "X";
        }

        return res;
        
        // else 
//            return "";
    } 
}
