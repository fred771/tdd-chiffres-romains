package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreRomain {
    @Required
    public String valeur;
    public NombreRomain() {}
    public NombreRomain(String r) {
	this.valeur = r;
    }

    public int en_decimal() {
		if( valeur.equals("I"))
			return 1 ;
		else
			return 0;
    }
}
