import java.util.Scanner;

public class SwearFilter {

    public static void main(String[] args) {

        String text = "A duck was sailing on a ship shipping whole wheat bread. Duck that SHIP!!!";
        String[] swear = {"duck", "ship", "whole"};
        System.out.println(swearFilter(text, swear));


        //read through the text to


        // A d**k was sailing on a s**p s**pping w***e wheat bread. D**k that S**P!!!

    }

    /*
     * three main for loops represent three possible capitalization cases for the swear word in text
     * 1) all lower case 	2) first letter capitalized 	3) all upper case
     *
     * the for loop within creates the censored word with stars based on its length
     * swear words within text are replaced with censored words using replace() feature
     *
     */


    public static String swearFilter(String text, String[] swear) {

        text = text.toLowerCase();

        String result = text;

        for (int i = 0; i < swear.length; i++) {
            String newSwear = "";
            for (int j = 0; j < swear[i].length() - 2; j++) {
                newSwear += "*";
            }
            newSwear = swear[i].substring(0, 1) + newSwear + swear[i].substring(swear[i].length() - 1);
            text = text.replaceAll(swear[i], newSwear);
            result = text;
        }

        for(int i = 0; i < swear.length; i++) {
            String capital = swear[i].substring(0,1).toUpperCase() + swear[i].substring(1, swear[i].length());

            String newSwear = "";
            for (int j = 0; j < swear[i].length() - 2; j++) {
                newSwear += "*";
            }
            newSwear = swear[i].substring(0,1).toUpperCase() + newSwear + swear[i].substring(swear[i].length() - 1);
            text = text.replaceAll(capital, newSwear);
            result = text;
        }

        for (int i = 0; i < swear.length; i++) {
            String capital = swear[i].toUpperCase();

            String newSwear = "";
            for (int j = 0; j < swear[i].length() - 2; j++) {
                newSwear += "*";
            }
            newSwear = swear[i].substring(0,1).toUpperCase() + newSwear + swear[i].substring(swear[i].length() - 1).toUpperCase();
            text = text.replaceAll(capital, newSwear);
            result = text;
        }
        return result;
    }
}










