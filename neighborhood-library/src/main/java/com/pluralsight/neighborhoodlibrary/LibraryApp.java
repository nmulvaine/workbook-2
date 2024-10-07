package com.pluralsight.neighborhoodlibrary;

public class LibraryApp {
    public static void main(String[] args)
    {
     String userInput;
     boolean isRunning, inStock;
    // StringBuilder textCentered = new StringBuilder();


     while (isRunning = true)
     {
         Object CenterText = new Object();
         Object centerText = CenterText;
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
     }

    }
            public class CenterText {
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


/*  System.out.println("""
                    Welcome. Please select and option from below.
                    1: Mortgage Calculator
                    2: CD Value
                    3: Annuity Value
                    4: Exit
                    """);
            String choice = userAnswer.nextLine().toLowerCase();

            //Checks for numeric answer and converts string to int
            try {
                int intChoice = Integer.parseInt(choice);
                switch (intChoice) {
                    case 1:
                        System.out.println("Opening Mortgage Calculator");
                        //consoleClear();
                        mortgage.mortgageCalc();
                        break;
                    case 2:
                        System.out.println("Opening CD Value Calculator");
                        cdValue.cdCalc();
                        break;
                    case 3:
                        System.out.println("Opening Annuity Value Calculator");
                        System.out.println("Well this is embarrassing. There's nothing" +
                                "here");

                        break;
                    case 4:
                        System.out.println("Exiting Application");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please select another");
                }
            } catch (NumberFormatException e) {
                switch (choice) {
                    case "mortgage calculator":
                        System.out.println("Opening Mortgage Calculator");
                        break;
                    case "cd value":
                        System.out.println("Opening CD Value Calculator");
                        break;
                    case "annuity value":
                        System.out.println("Opening Annuity Value Calculator");
                        System.out.println("Well this is embarrassing. There's nothing" +
                                "here");
                        break;
                    case "exit":
                        System.out.println("Exiting Application");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid option. Please select another");
                }
            }*/

