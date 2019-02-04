package ExerciciLletresRepetides;

import java.util.*;

public class Fase_4 {

    public static void main(String[] args) {

        LinkedList<String> myName = new LinkedList<>();
        myName.add("M");
        myName.add("A");
        myName.add("R");
        myName.add("C");
        myName.add("X");
        myName.add("A");
        myName.add("V");
        myName.add("I");
        myName.add("E");
        myName.add("R");

        LinkedList<String> mySurname = new LinkedList<>();
        mySurname.add("C");
        mySurname.add("A");
        mySurname.add("D");
        mySurname.add("E");
        mySurname.add("V");
        mySurname.add("A");
        mySurname.add("L");
        mySurname.add("L");

        LinkedList<String> fullName = new LinkedList<>();
        fullName.addAll(myName);
        fullName.add(" ");
        fullName.addAll(mySurname);

    System.out.println("FULLNAME:" + fullName );

    }
}