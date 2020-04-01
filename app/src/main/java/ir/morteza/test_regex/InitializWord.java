package ir.morteza.test_regex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InitializWord {
    public String init(String[] input){

        return get_noun(input)+
                get_verb(input)+
                get_adverb(input)+
                get_adjective(input)+
                get_pronoun(input)+
                get_conjunction(input)+
                get_interjection(input)+
                get_conjunction(input)+
                get_phrase(input)+
                get_preposition(input)+
                get_particle(input)+
                get_witouhbrackets(input);


    }

    private String get_noun(String[] input) {
        String noun = "";
        Pattern r = Pattern.compile("\\[noun\\],\\((.*?)\\)");
        for (int i = 0; i < input.length; i++) {
            Matcher n1 = r.matcher(input[i]);
            if (n1.find()) {
                noun += n1.group(1) + ",";
            } else {
                System.out.println("Found value: NO MATCH ");
            }
        }
        noun = removeLastChar(noun);
        String[] temp = noun.split(",");
        String result = removeDuplicate(temp);
        if(result.length()!=0)
            return "[noun],(" + result + ")";
        else
            return "";
    }
    private String get_verb(String[] input) {
        String noun = "";
        Pattern r = Pattern.compile("\\[verb\\],\\((.*?)\\)");
        for (int i = 0; i < input.length; i++) {
            Matcher n1 = r.matcher(input[i]);
            if (n1.find()) {
                noun += n1.group(1) + ",";
            } else {
                System.out.println("Found value: NO MATCH 0");
            }
        }
        noun = removeLastChar(noun);
        String[] temp = noun.split(",");
        String result = removeDuplicate(temp);
        if(result.length()!=0)
            return "[verb],(" + result + "),";
        else
            return "";
    }
    private String get_adverb(String[] input) {
        String noun = "";
        Pattern r = Pattern.compile("\\[adverb\\],\\((.*?)\\)");
        for (int i = 0; i < input.length; i++) {
            Matcher n1 = r.matcher(input[i]);
            if (n1.find()) {
                noun += n1.group(1) + ",";
            } else {
                System.out.println("Found value: NO MATCH ");
            }
        }
        noun = removeLastChar(noun);
        String[] temp = noun.split(",");
        String result = removeDuplicate(temp);

        if(result.length()!=0)
            return "[adverb],(" + result + "),";
        else
            return "";
    }
    private String get_adjective(String[] input) {
        String noun = "";
        Pattern r = Pattern.compile("\\[adjective\\],\\((.*?)\\)");
        for (int i = 0; i < input.length; i++) {
            Matcher n1 = r.matcher(input[i]);
            if (n1.find()) {
                noun += n1.group(1) + ",";
            } else {
                System.out.println("Found value: NO MATCH ");
            }
        }
        noun = removeLastChar(noun);
        String[] temp = noun.split(",");
        String result = removeDuplicate(temp);

        if(result.length()!=0)
            return "[adjective],(" + result + "),";
        else
            return "";
    }
    private String get_pronoun(String[] input) {
        String noun = "";
        Pattern r = Pattern.compile("\\[pronoun\\],\\((.*?)\\)");
        for (int i = 0; i < input.length; i++) {
            Matcher n1 = r.matcher(input[i]);
            if (n1.find()) {
                noun += n1.group(1) + ",";
            } else {
                System.out.println("Found value: NO MATCH ");
            }
        }
        noun = removeLastChar(noun);
        String[] temp = noun.split(",");
        String result = removeDuplicate(temp);

        if(result.length()!=0)
            return "[pronoun],(" + result + "),";
        else
            return "";
    }
    private String get_conjunction(String[] input) {
        String noun = "";
        Pattern r = Pattern.compile("\\[conjunction\\],\\((.*?)\\)");
        for (int i = 0; i < input.length; i++) {
            Matcher n1 = r.matcher(input[i]);
            if (n1.find()) {
                noun += n1.group(1) + ",";
            } else {
                System.out.println("Found value: NO MATCH ");
            }
        }
        noun = removeLastChar(noun);
        String[] temp = noun.split(",");
        String result = removeDuplicate(temp);

        if(result.length()!=0)
            return "[conjunction],(" + result + "),";
        else
            return "";
    }
    private String get_interjection(String[] input) {
        String noun = "";
        Pattern r = Pattern.compile("\\[interjection\\],\\((.*?)\\)");
        for (int i = 0; i < input.length; i++) {
            Matcher n1 = r.matcher(input[i]);
            if (n1.find()) {
                noun += n1.group(1) + ",";
            } else {
                System.out.println("Found value: NO MATCH ");
            }
        }
        noun = removeLastChar(noun);
        String[] temp = noun.split(",");
        String result = removeDuplicate(temp);

        if(result.length()!=0)
            return "[interjection],(" + result + "),";
        else
            return "";

    }
    private String get_phrase(String[] input) {
        String noun = "";
        Pattern r = Pattern.compile("\\[phrase\\],\\((.*?)\\)");
        for (int i = 0; i < input.length; i++) {
            Matcher n1 = r.matcher(input[i]);
            if (n1.find()) {
                noun += n1.group(1) + ",";
            } else {
                System.out.println("Found value: NO MATCH ");
            }
        }
        noun = removeLastChar(noun);
        String[] temp = noun.split(",");
        String result = removeDuplicate(temp);

        if(result.length()!=0)
            return "[phrase],(" + result + "),";
        else
            return "";
    }
    private String get_preposition(String[] input) {
        String noun = "";
        Pattern r = Pattern.compile("\\[preposition\\],\\((.*?)\\)");
        for (int i = 0; i < input.length; i++) {
            Matcher n1 = r.matcher(input[i]);
            if (n1.find()) {
                noun += n1.group(1) + ",";
            } else {
                System.out.println("Found value: NO MATCH ");
            }
        }
        noun = removeLastChar(noun);
        String[] temp = noun.split(",");
        String result = removeDuplicate(temp);

        if(result.length()!=0)
            return "[preposition],(" + result + "),";
        else
            return "";
    }
    private String get_particle(String[] input) {
        String noun = "";
        Pattern r = Pattern.compile("\\[particle\\],\\((.*?)\\)");
        for (int i = 0; i < input.length; i++) {
            Matcher n1 = r.matcher(input[i]);
            if (n1.find()) {
                noun += n1.group(1) + ",";
            } else {
                System.out.println("Found value: NO MATCH ");
            }
        }
        noun = removeLastChar(noun);
        String[] temp = noun.split(",");
        String result = removeDuplicate(temp);

        if(result.length()!=0)
            return "[particle],(" + result + "),";
        else
            return "";
    }

    private String removeDuplicate(String[] strsplitwithkama) {
        String result = "";
        ArrayList<String> al1 = new ArrayList<>();
        for (int i = 0; i < strsplitwithkama.length; i++) al1.add(strsplitwithkama[i]);
        Set<String> set = new HashSet<String>();
        set.addAll(al1);
        ArrayList<String> list = new ArrayList<>(set);

        for (int i = 0; i < list.size(); i++) {
            result += list.get(i) + ",";
        }

        if(result.length()!=0)
            return removeLastChar(result);
        else
            return "";
    }

    private String get_witouhbrackets(String[] strsplitwithkama){
        String sample="";
        for (int i = 0; i < strsplitwithkama.length; i++) {
            sample += strsplitwithkama[i].replaceAll("\\(.*?\\)", "")+","; // remove (??)
        }

        sample = sample.replaceAll("\\[.*?\\]", ""); // remove [??]
        String[] temp = sample.split(",");
        //sample = sample.replaceAll(",", "");
        String result="";
        for(int i=0;i<temp.length;i++){
            //    System.out.println("Found value: result sample=> "+ temp[i].length());
            if(temp[i].length()!=0)
                result +=temp[i]+",";
        }
        //System.out.println("Found value: result sample=> "+ removeLastChar(result));
        String temp1[] = removeLastChar(result).split(",");
        String temp2=removeDuplicate(temp1);
        //System.out.println("Found value: result sample=> "+ temp2);

        if(result.length()!=0)
            return temp2;
        else
            return "";
    }

    private String removeLastChar(String str) {
        if(str.length()!=0)
            return str.substring(0, str.length() - 1);
        else
            return str;
    }



}
