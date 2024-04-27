import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Chapter3Section6 {
    public static void main(String[] args) {
        //Consumer<T> 아무것도 리턴하지 않고 끝나는 함수이다
        Consumer<String> myStrinConsumer =(str)-> System.out.println(str);
//        myStrinConsumer.accept("hello");

        List<Integer> integerInputs = Arrays.asList(1,2,3,4,5); //Arrays.asList이걸로 만들면 변형이 불가능하다
        Consumer<Integer> myIntegerProcessor = x -> System.out.println("processing integer"+x);
        process(integerInputs,myIntegerProcessor);

        Consumer<Integer> myDifferentintegerProcessor = x->
                System.out.println("processing integer in different way" +x);
        process(integerInputs,myDifferentintegerProcessor);

        List<Double> doubleInpputs = Arrays.asList(1.1,2.45,52.2,123.21);
        Consumer<Double> myDoubleProcessor = x-> System.out.println("Processing double "+x);
        process(doubleInpputs,myDoubleProcessor);
    }

    public static <T> void process(List<T> inputs,Consumer<T> processor){
        for (T input : inputs){
            processor.accept(input);
        }
    }


//    public static void process(List<Integer> inputs,Consumer<Integer> processor){
//        for (Integer input : inputs){
//            processor.accept(input);
//        }
//    }
}