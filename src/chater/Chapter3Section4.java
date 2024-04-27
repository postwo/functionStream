package chater;

import java.util.function.BiFunction;

public class Chapter3Section4 {
    public static void main(String[] args) {
    TriFunction<Integer,Integer,Integer,Integer> addThreeNumbers = (x,y,z)-> x+y+z;

    int result= addThreeNumbers.apply(2,3,5);
        System.out.println(result);

    }
}