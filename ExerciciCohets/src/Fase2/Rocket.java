package Fase2;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

	
    public String code;
    public List<Propeller> propellers = new ArrayList<>();

    public Rocket(String code) throws Exception {
    	if (code.length() < 8) throw new Exception("Code must have at least 8 characters");
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public int getNprop() {
        return propellers.size();
    }

    public String getPropellers() {
        String res = " ";
        for (Propeller p : propellers) {
            res += p.getMaxPower() + ", ";
        }
        return res;
    }
    
    public void addPropeller(int maxPower)  throws Exception {
        Propeller p1 = new Propeller(maxPower);
        propellers.add(p1);
    }
}
