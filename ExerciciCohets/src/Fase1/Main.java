package Fase1;

public class Main {
	
	public static void main(String[] args) throws Exception
{

	Rocket rocket1 = new Rocket("32WESSDS", 3);
	
	Rocket rocket2 = new Rocket("LDSFJA32", 6);
	
	System.out.println("El codi de Coet 1 és " + rocket1.getCode() + " i té  " + rocket1.getnProp() + " propulsors");

	System.out.println("El codi de Coet 2 és " + rocket2.getCode() + " i té  " + rocket2.getnProp() + " propulsors");

}

}
