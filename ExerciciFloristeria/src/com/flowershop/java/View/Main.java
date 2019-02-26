package com.flowershop.java.View;

import com.flowershop.java.Application.Controller;
import com.flowershop.java.Application.FlowerDTO;
import com.flowershop.java.Application.TreeDTO;
import com.flowershop.java.Application.DecorationDTO;
import com.flowershop.java.Utils.Utils;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Controller controller = new Controller();
    private static List<TreeDTO> treeList = new ArrayList<>();
    private static List<FlowerDTO> flowerList = new ArrayList<>();
    private static List<DecorationDTO> decorationList = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        controller.createFlowerShop("La Flor del demà");
        insertTree();
        insertFlower();
        insertDecoration();
        selectOption();
    }

    private static void insertTree() throws Exception {
        treeList.add(controller.addTree(1.55, 22.5));
        treeList.add(controller.addTree(1.65, 32.5));
        treeList.add(controller.addTree(1.75, 12.5));
        treeList.add(controller.addTree(1.85, 50));
    }

    private static void insertFlower() throws Exception {
        flowerList.add(controller.addFlower("Red", 8.5));
        flowerList.add(controller.addFlower("Blue", 6.5));
        flowerList.add(controller.addFlower("Green", 5));
        flowerList.add(controller.addFlower("Yellow", 2));
    }

    private static void insertDecoration() throws Exception {
        decorationList.add(controller.addDecoration(Utils.Material.PLASTIC, 2.5));
        decorationList.add(controller.addDecoration(Utils.Material.PLASTIC, 2.5));
        decorationList.add(controller.addDecoration(Utils.Material.WOOD, 7));
        decorationList.add(controller.addDecoration(Utils.Material.PLASTIC, 10.2));
    }

    private static void showTree() {
        int count = 1;
        for (TreeDTO tree : treeList) {
            System.out.println("Tree " + count + ":");
            System.out.println("Height: " + tree.getHeight());
            System.out.println("Price: " + tree.getPrice());
            System.out.print("\n");
            count++;
        }
    }

    private static void showFlower() {
        int count = 1;
        for (FlowerDTO flower : flowerList) {
            System.out.println("Flower " + count + ":");
            System.out.println("Color: " + flower.getColor());
            System.out.println("Price: " + flower.getPrice());
            System.out.print("\n");
            count++;
        }
    }

    private static void showDecoration() {
        int count = 1;
        for (DecorationDTO decoration : decorationList) {
            System.out.println("Decoration " + count + ":");
            System.out.println("Material: " + decoration.getMaterial());
            System.out.println("Price: " + decoration.getPrice());
            System.out.print("\n");
            count++;
        }
    }

    private static void showMenu() {
            System.out.println("[1]. Veure tot l'inventari");
            System.out.println("[2]. Veure l'inventari d'arbres");
            System.out.println("[3]. Veure l'inventari de flors");
            System.out.println("[4]. Veure l'inventari de decoracions");
            System.out.println("[5]. Vendre prodcute");
            System.out.println("[0]. Salir");
    }

    private static void selectOption() {
            int opc = 0;
            Scanner sc = new Scanner(System.in);
            do{
                showMenu();
                opc = Integer.parseInt(sc.nextLine());
                switch (opc) {
                    case 1:
                        showTree();
                        System.out.println("---------");
                        showFlower();
                        System.out.println("---------");
                        showDecoration();
                        break;
                    case 2:
                        showTree();
                        break;
                    case 3:
                        showFlower();
                        break;
                    case 4:
                        showDecoration();
                        break;
            }
            } while (opc != 0);

    }


}
