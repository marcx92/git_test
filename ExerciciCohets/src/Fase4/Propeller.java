package Fase4;

public class Propeller {
	
	 public int maxPower;
	 public int power;								
	
   public Propeller (int maxPower) throws Exception {
       if (maxPower<0) throw new Exception();
       this.maxPower = maxPower;
   }

   public int getMaxPower() {
       return maxPower;
   } 
   
	 public int getPower() {   					
		 return power;
	 }
	 
	 public void powerInput(int input) { 				
		 power += input;
		 if (power > maxPower) {
			 power = maxPower;
			 
		 }else if (power < 0) {
				 power = 0;
		 } 
	 }
}
