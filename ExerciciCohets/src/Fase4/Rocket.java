package Fase4;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

	
    public String code;
    public List<Propeller> propellers = new ArrayList<>(); 
    public int maxSpeed; 

    public Rocket(String code){    
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
    
    public void addPropeller(int power) throws Exception {  
    	
        Propeller p1 = new Propeller(power);
        propellers.add(p1);
    }
    
    public int getMaxSpeed() {  			
        for (Propeller p : propellers) { 	
            maxSpeed += p.getMaxPower();
        }
        return maxSpeed;
    }
    public int getSpeed() {					
        int Speed = 0;
        for (Propeller p : propellers) {
            Speed +=p.getPower();
        }
        return Speed;
    }

    public void accelerate (int n){				
        int acc = 10;
        int order =acc*n;
        for (Propeller p : propellers) {
            p.powerInput(order);
            
        }
    }
    public void brake (int n) {					
        int brake = -10;
        int order = brake * n;
        for (Propeller p : propellers) {
            p.powerInput(order);
        }
    }
}
