package MetodsAndArrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EnumEnumExercises {
    public static void main(String[] args) {

        List<EnumGrade> list = new ArrayList<>();
        list.add(EnumGrade.EXCELLENT);
        list.add(EnumGrade.BASIC);
        list.add(EnumGrade.GOOD);
        list.add(EnumGrade.GOOD);
        list.add(EnumGrade.EXCELLENT);
        list.add(EnumGrade.GOOD);
        list.add(EnumGrade.POOR);
        list.add(EnumGrade.BASIC);
        list.add(EnumGrade.VERY_GOOD);
        list.add(EnumGrade.POOR);
        list.sort(null);
        System.out.println(list);
       // System.out.println(list.stream().sorted().collect(Collectors.toList()));

        for (EnumGrade l: list) {
//         System.out.println(l.getDigitGrade()+"-"+"("+l.name()+")"+"-"+(l.pass()?"pass":"Fail"));
            System.out.println(l.getDigitGrade()+"-"+"("+l.name()+")"+"-"+l.pass());
        }


    }
}
