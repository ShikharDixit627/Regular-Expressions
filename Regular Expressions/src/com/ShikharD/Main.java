package com.ShikharD;

import java.lang.reflect.Array;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String newSt = "I think, therefore I am ";
        String[] newSt1 = newSt.split(" ");
        for(String a:newSt1){
            System.out.println(a);
        }

//        String alphaNumeric = "abc1DD83eee1F7ghI2ed1gg83OokjJjk9";
//        System.out.println(alphaNumeric.replaceAll(".","*"));
//
//        System.out.println(alphaNumeric.replaceAll("^abcDD","####"));
//        System.out.println(alphaNumeric.replaceAll("jk9$","####"));
//        System.out.println(alphaNumeric.replaceAll("[defjk]","*"));
//        System.out.println(alphaNumeric.replaceAll("[coj][Dj]","*"));//[]followed by the other []
//        System.out.println(alphaNumeric.replaceAll("[^ej]","*"));// every character except ej will be replaced
//
//        System.out.println(alphaNumeric.replaceAll("[a-f1-4]","*"));// replaces [a-f and 1-4] characters
//        System.out.println(alphaNumeric.replaceAll("(?i)[a-f1-4]","*")); // with case sensitivity removed
//        System.out.println(alphaNumeric.replaceAll("\\d","!")); // shortcut to remove all digits from string
//
//        String whiteSpaces = "This sentence  has many\t spaces between\n the words";
//        System.out.println(whiteSpaces);
//        System.out.println(whiteSpaces.replaceAll("\\s",""));// to remove white spaces from string
//        System.out.println(whiteSpaces.replaceAll("\\S",""));// to remove everything except white spaces
//        System.out.println(whiteSpaces.replaceAll("\\w","!"));
//        System.out.println(whiteSpaces.replace("\\W"," "));
//        System.out.println(whiteSpaces.replaceAll("\\b","*"));

        String alphaNumeric1 = "abc1DDDD83eee1F7ghI2ed1gg83OokjJjk9";
        System.out.println(alphaNumeric1.replaceAll("^abc1D+","***")); // + is for 1 or more character occurrence
        System.out.println(alphaNumeric1.replaceAll("^abc1D*"," ** ")); // * is for 0 or more occurrence of preceding character
        System.out.println(alphaNumeric1.replaceAll("c+1D*8","~"));

        StringBuilder htmlText =new StringBuilder( "<h1> this is the largest heading</h1>");
        htmlText.append("<h2> this the second largest heading </h2>");
        htmlText.append("<p> this is the paragraph tag used to write paras in html...</p>");
        htmlText.append("<h2> The End of the htmlText file </h2>");

        String h2pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurrence "+ count +" : "+matcher.start()+ " to "+ matcher.end());
        }

        String h2GroupPattern = "(<h2>)(.*?)(</h2>)";
        Pattern grpPattern = Pattern.compile(h2GroupPattern);
        Matcher grpMatcher = grpPattern.matcher(htmlText);
        System.out.println(grpMatcher.matches());
        grpMatcher.reset();

        while(grpMatcher.find()){
            System.out.println("Occurrence :" + grpMatcher.group(2));
        }

        System.out.println("King and king".replaceAll("[K|k]ing","Fling"));

        String evTest = "ejevjqeae";
        String eNotvRegEx = "e(?!v)";
        // we can also use e[^v] but it will not consider the e at the end of the string.
        // the (?) is a look ahead symbol, and it does not consume any characters.
        Pattern eNotvPattern = Pattern.compile(eNotvRegEx);
        Matcher eNotvMatcher = eNotvPattern.matcher(evTest);

        count = 0;
        while(eNotvMatcher.find()){
            System.out.println("Occurrence : "+count+" : "+eNotvMatcher.start()+" to "+eNotvMatcher.end());
        }

    }
}
