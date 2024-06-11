package chapter6;

import java.util.stream.Collector;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Chapter6Section1 {

    public static void main(String[] args) {
        Stream<String> list = Stream.of("Alice", "Bob", "Charlie");
        List<String> names = list.collect(Collectors.toList());//java16부터는 바로 tolist를 사용해도 된다 //스트림을 리스트로 변형
//        System.out.println(names);


        String [] city = new String[] {"seoul", "gams","sow"};
        Stream<String> citys = Arrays.stream(city);
        List<String> list1 = citys.toList();
//        System.out.println(list1);


        Set<Integer> so = new HashSet<>(Arrays.asList(1,2,3));
        Stream<Integer> sos = so.stream(); //set은 바로 스트림으로 변경가능
        List<Integer> sow = sos.collect(Collectors.toList());
//        System.out.println(sow);

    }



}
