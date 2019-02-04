package ExerciciLletresRepetides;

public class Fase_2 {

    public static void main(String[] args) {

        String [] myName= {"M","A","R","R","C","X","A","V","1","E","R"}; 

        for (int i=0; i<10; i++) {
            if(myName[i].equals("A") || myName[i].equals("E") || myName[i].equals("I") || myName[i].equals("O") ||
                    myName[i].equals("U")) {
                System.out.println(myName[i]+ " VOCAL");
            }
            else if
            (myName[i].equals("0") || myName[i].equals("1") || myName[i].equals("2") || myName[i].equals("3") ||
                            myName[i].equals("4") || myName[i].equals("5") || myName[i].equals("6") || myName[i].equals("7") ||
                            myName[i].equals("8") || myName[i].equals("9"))   {

                System.out.println(myName[i]+ " Els noms de persones no contenen números!");
            }
            else {
                System.out.println(myName[i]+ " CONSONANT ");
            }
        }
    }
}
