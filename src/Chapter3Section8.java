import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Chapter3Section8 {
    public static void main(String[] args) {
        Predicate<Integer> isPositive = x-> x>0;
        //System.out.println(isPositive.test(20));

        List<Integer> inputs= Arrays.asList(0,10,-4,2,5,15,-42);
//        System.out.println("Positive Number"+filter(inputs,isPositive));
//        System.out.println("Non-positive number:"+ filter(inputs,isPositive.negate())); //.negate() 반대의 행동을 한다
//        System.out.println("Nom-negative number:"+filter(inputs,isPositive.or(x->x==0)));//0과 같거나 0보다 큰숫자만
//        System.out.println("positive even numbers: "+filter(inputs,isPositive.and(x->x%2==0)));//약수중에 짝수만
    }

    public static <T> List<T> filter (List<T> inputs,Predicate<T> condition){
        List<T> output = new ArrayList<>();
        for (T input:inputs){
           if(condition.test(input)){ //값이 참이면 리스트 저장 아니면 저장x
               output.add(input);
           }
        }
        return output;
    }
}