package com.ShikharD;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge1 {
    public static void main(String[] args) {
        String ans1 = "^I{1}[ ][want]{1}[ ][a]{1}[ ][bike]{1}[\\.]$";
        String chl1 = "I want a bike.";
        String chl2 = "I want a bus.";

        String regEx1 = "I want a \\w+.";

//        System.out.println(chl1.matches(regEx1));
//        //System.out.println(chl1.replaceAll(ans1,"yes that's correct"));
//
//        Pattern pattern = Pattern.compile(regEx1);
//        Matcher matcher = pattern.matcher(chl1);
//        System.out.println(matcher.matches());
//
//        matcher = pattern.matcher(chl2);
//        System.out.println(matcher.matches());
//
//        String chl4 = "Replace all blanks with underscores.";
//        System.out.println(chl4.replaceAll("\\s","_"));
//
//        String regEx5 = "[a-g]+";
//        Pattern pattern5 = Pattern.compile(regEx5);
//        Matcher matcher5 = pattern5.matcher("aaabccccccccdddefffg");
//        System.out.println("For challenge 5: "+ matcher5.matches());
//
//        String chl6 = "acse.1";
//        System.out.println("For challenge 6: "+chl6.matches("^[A-Za-z]+\\.\\d+$"));
//
//        String chl8 = "abcd.135\twasd.7\tescv.11\n";
//        Pattern pattern8 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
//        Matcher matcher8 = pattern8.matcher(chl8);
//
//        int count = 0;
//        while(matcher8.find()){
//            System.out.println("Occurrence : "+count +matcher8.group(1));
//        }
//        String chl10 = "abcd.135\twasd.7\tescv.11\n";
//        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)");
//        Matcher matcher10 = pattern10.matcher(chl10);
//
//        while(matcher10.find()){
//            System.out.println("Occurrence : start "+matcher10.start(1)+" till "+(matcher10.end(1)-1));
//        }

        String challenge11 = "{0,2}, {1,5}, {q,ws}, {2,4}, {SA,Lew}";
        Pattern pattern11 = Pattern.compile("\\{(\\d+,\\d+)\\}");
        // here ? is a lazy quantifier and will end the match at first "}" rather than the last "}"
        Matcher matcher11 = pattern11.matcher(challenge11);

        while(matcher11.find()){
            System.out.println("Matches : "+matcher11.group(1));
        }

        String challenge13 = "11111-2234";
        System.out.println(challenge13.matches("^\\d{5}-\\d{4}$"));

        String challenge14 = "12345-2136";
        System.out.println(challenge14.matches("^\\d{5}(-\\d{4})?$"));
        // here the ? is a quantifier that signifies either 1 or 0 number of matchers

    }

}
