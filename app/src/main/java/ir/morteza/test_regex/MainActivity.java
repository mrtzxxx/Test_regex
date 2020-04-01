package ir.morteza.test_regex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {
    //String[] word = {"balika","[noun],(obal,obalca,balik),bary", "[adverb],(abc1,obal,abc3)","balika,borok","[noun],(cda1,cda2,cda3)"};
    //String[] sample = {"[noun],(trio,trojice),terzetto","[noun],(trojice,trojhra)"};
    String word = "a";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println("Found value: " + addTildeOptions("arezona"));


    }

    public static String addTildeOptions(String searchText) {
        return searchText.toLowerCase()
                .replaceAll("[aáàäâã]", "\\[aáàäâã\\]")
                .replaceAll("[eéèëê]", "\\[eéèëê\\]")
                .replaceAll("[iíìî]", "\\[iíìî\\]")
                .replaceAll("[oóòöôõ]", "\\[oóòöôõ\\]")
                .replaceAll("[uúùüû]", "\\[uúùüû\\]")
                //.replaceAll("[aeæ]", "\\[aeæ\\]")
                .replaceAll("[cç]", "\\[cç\\]")
                .replaceAll("[nñ]", "\\[nñ\\]")
                //.replaceAll("[oeœ]", "\\[oeœ\\]")
                .replaceAll("[yýÿ]", "\\[ýÿ\\]")
                .replace("*", "[*]")
                .replace("?", "[?]");
    }

}
