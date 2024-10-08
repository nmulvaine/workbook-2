package com.pluralsight.neighborhoodlibrary;


public class LibraryApp {
    public static void main(String[] args) throws InterruptedException {
     String userInput = "";
     boolean isRunning;
    StringBuilder textCentered = new StringBuilder();


     while (true) {
         Object CenterText = new Object();
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
         String choice = userInput.toLowerCase();

         try {
             int intChoice = Integer.parseInt(choice);
             switch (intChoice) {
                 case 1:
                     System.out.println("Opening Neighborhood Library");
                     //Thread.sleep(1500);
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
             switch (choice) {
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



