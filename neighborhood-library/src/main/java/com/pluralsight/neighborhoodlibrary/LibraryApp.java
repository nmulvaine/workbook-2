package com.pluralsight.neighborhoodlibrary;
import java.util.Scanner;


public class LibraryApp {
    public static void main(String[] args) throws InterruptedException {
     String userInput;

     boolean isRunning = true;
     Book book = new Book("The Pragmatic Programmer", "978-0201616224", "1");
     Scanner scan = new Scanner (System.in);


     while (isRunning) {

         System.out.println("+----------------------------------------------------+\n" +
                            "|                                                    |\n" +
                            "|               Welcome to the                       |\n" +
                            "|          Neighborhood Library                      |\n" +
                            "|                                                    |\n" +
                            "|         Please Select an Option:                   |\n" +
                            "|                                                    |\n" +
                            "+----------------------------------------------------+\n" +
                            "\n" +
                            "1: Books\n" +
                            "\n" +
                            "2: Configuration\n" +
                            "\n" +
                            "3: Exit\n" +
                            "\n");
         userInput = scan.nextLine().toLowerCase();



         try {
             int intChoice = Integer.parseInt(userInput);
             switch (intChoice) {
                 case 1:
                     System.out.println("Opening Neighborhood Library");
                     for (Book b: Book.bookList){
                         System.out.println(b);
                     }
                     break;

                 case 2:
                     System.out.println("Opening Configuration");
                     //Thread.sleep(1500);
                     break;
                 case 3:
                     System.out.println("Exiting");
                     //Thread.sleep(1500);
                     isRunning = false;
                     break;

                 default:
                     System.out.println("Invalid option. Please select an option from the menu");
             }
         } catch (NumberFormatException e) {
             switch (userInput) {
                 case "books":
                     System.out.println("Opening Neighborhood Library");
                     //Thread.sleep(1500);
                     break;

                 case "configuration":
                     System.out.println("Opening system configuration");
                     //Thread.sleep(1500);
                     break;

                 case "exit":
                     System.out.println("Exiting");
                     //Thread.sleep(1500);
                     isRunning = false;
                     break;

                 default:
                     System.out.println("Invalid option. Please select an option from the menu");
             } break;
         }

         //catch (InterruptedException e) {
         // throw new RuntimeException(e);}

     }
        scan.close();


    }
    // Center displayed text
            public static class CenterText {
                public static void main(String[] args) {
                    String text = "";
                    int terminalWidth = 80; // You can adjust this to your terminal's width
                    centerText(text, terminalWidth);
                }

                public static void centerText(String text, int width) {
                    int padding = (width - text.length()) / 2;
                    String paddedText = " ".repeat(Math.max(0, padding)) + text;
                    System.out.println(paddedText);
                }
            }
        }



