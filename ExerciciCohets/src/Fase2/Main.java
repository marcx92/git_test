package Fase2;

public class Main {

    public static void main(String[] args)  throws Exception{

      Rocket rocket1 = new Rocket("32WESSDS");
      
      rocket1.addPropeller(10);
      rocket1.addPropeller(30);
      rocket1.addPropeller(80);
      
      Rocket rocket2 = new Rocket("LDSFJA32");
      
      rocket2.addPropeller(30);
      rocket2.addPropeller(40);
      rocket2.addPropeller(50);
      rocket2.addPropeller(50);
      rocket2.addPropeller(30);
      rocket2.addPropeller(10);

        System.out.println("El Coet amb el codi " + rocket1.getCode() +
        		" amb " + rocket1.getNprop() + " propulsors amb una poténcia màxima de:" + rocket1.getPropellers() + " cada un.");
        
        System.out.println("El Coet amb el codi " + rocket2.getCode() +
        		" amb " + rocket2.getNprop() + " propulsors amb una poténcia màxima de:" + rocket2.getPropellers() + " cada un.");
    }
  }