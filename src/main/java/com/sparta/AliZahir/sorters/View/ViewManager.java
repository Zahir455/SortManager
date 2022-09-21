package com.sparta.AliZahir.sorters.View;

import com.sparta.AliZahir.sorters.Controller.Factory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ViewManager {

    public static Logger logger = LogManager.getLogger(Factory.class);

    public void options(){
        Factory factory = new Factory();
        Random rand = new Random();
        boolean goAgain = true;
        Scanner scanner = new Scanner(System.in);

        while(goAgain==true) {
            int choice = 9999;
            int arrlength = 0;
            try {
                System.out.println("please choose one of the following options:" +
                        "\n 1)Bubble sort" +
                        "\n 2)Merge sort" +
                        "\n 3)Binary tree sort" +
                        "\n 4)Compare timings of different sort methods");
                choice = scanner.nextInt();
                logger.info("Choice: "+ choice);
                switch (choice){
                    case 1:

                        System.out.println("Please choose an array length");
                        arrlength = scanner.nextInt();
                        int[] arrayToSort = new int[arrlength];
                        for (int i = 0; i < arrayToSort.length; i++) {
                            arrayToSort[i] = rand.nextInt(0, 100000);
                        }

                        System.out.println(Arrays.toString(factory.bubbleSort(arrayToSort)));
                        break;
                    case 2:

                        System.out.println("Please choose an array length");
                        arrlength = scanner.nextInt();
                        arrayToSort = new int[arrlength];
                        for (int i = 0; i < arrayToSort.length; i++) {
                            arrayToSort[i] = rand.nextInt(0, 100000);
                        }

                        System.out.println(Arrays.toString(factory.mergeSort(arrayToSort)));
                        break;
                    case 3:

                        System.out.println("Please choose an array length");
                        arrlength = scanner.nextInt();
                        arrayToSort = new int[arrlength];
                        for (int i = 0; i < arrayToSort.length; i++) {
                            arrayToSort[i] = rand.nextInt(0, 100000);
                        }

                        System.out.println(Arrays.toString(factory.binarySort(arrayToSort)));
                        break;
                    case 4:
                        System.out.println("Please choose an array length");
                        arrlength = scanner.nextInt();
                        arrayToSort = new int[arrlength];
                        for (int i = 0; i < arrayToSort.length; i++) {
                            arrayToSort[i] = rand.nextInt(0, 100000);
                        }
                        System.out.println(factory.compare());

                        break;
                    default:
                        logger.warn("wrong choice");
                        System.out.println(choice+" is not a valid choice, please enter a number between 1 and 4.");
                }
            } catch (Exception e) {
                logger.warn("invalid input, choice: " + choice + " array length: " + arrlength);
                System.out.println("That was not a valid input, please try again.");
            }
            scanner.nextLine();
            System.out.println("Continue: Y/N");
            String repeat = scanner.nextLine();
            if(repeat.equalsIgnoreCase("N")){
                goAgain=false;
            } else if(repeat.equalsIgnoreCase("Y")) {
                goAgain = true;
            }
        }
    }
}
