package ExerciciLletresRepetides;

import java.util.*;

public class Fase_3 {

    public static void main(String[] args) {


        ArrayList<Character> myName = new ArrayList<>(); 
        myName.add('M');
        myName.add('A');
        myName.add('R');
        myName.add('C');
        myName.add('X');
        myName.add('A');
        myName.add('V');
        myName.add('I');
        myName.add('E');
        myName.add('R');

        Map<Character, Integer> myNameMap = new HashMap<>(); 

        for (int i=0; i<myName.size(); i++){

            Character c = myName.get(i);

            if (myNameMap.get(c)!=null){

                int contador = myNameMap.get(c);

                myNameMap.put(c, ++contador);
            }
            else { myNameMap.put(c, 1);}

        }
        System.out.println(myNameMap);

    }
}
