import java.util.function.BiFunction;

public class Chapter3Section3 {
    public static void main(String[] args) { //BiFunction 받아오는 값2개 return1개
        //input 타입이 유추가 되기 때문에 (Integer x,Integer y) 여기에서 integer를 지워도 동작된다
        BiFunction<Integer,Integer,Integer> add = ( x,y) ->  x+y;//(Integer x,Integer y)이거는 받는값을 말한다

        int result = add.apply(3,5);
        System.out.println(result);
    }
}