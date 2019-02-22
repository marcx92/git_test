package Fase4;

public class Main {

    public static void main(String[] args)  throws Exception {

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
      
          System.out.println("1.- VELOCITAT ACTUAL DELS COETS: ");
          System.out.println("La velocitat actual del coet 1 és de: " + rocket1.getSpeed());
          System.out.println("La velocitat actual del coet 2 és de: " + rocket2.getSpeed());
          
          System.out.println("2.- ACELERAR 3 VEGADES: ");
          rocket1.accelerate(3);
          rocket2.accelerate(3);
          
          System.out.println("La velocitat actual del coet 1 és de: " + rocket1.getSpeed());
          System.out.println("La velocitat actual del coet 2 és de: " + rocket2.getSpeed());
          
          System.out.println("3.-: FRENAR 5 VEGADES AMB EL COET 1; ACELERAR 7 VEGADES AMB EL COET 2: ");
          rocket1.brake(5);
          rocket2.accelerate(7);

          System.out.println("La velocitat actual del coet 1 és de: " + rocket1.getSpeed());
          System.out.println("La velocitat actual del coet 2 és de: " + rocket2.getSpeed());

          System.out.println("4.-: ACELERAR 15 VEGADES: ");
          rocket1.accelerate(15);
          rocket2.accelerate(15);

          System.out.println("La velocitat actual del coet 1 és de: " + rocket1.getSpeed());
          System.out.println("La velocitat actual del coet 2 és de: " + rocket2.getSpeed());
          
    	}
    }