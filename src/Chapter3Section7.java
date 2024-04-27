import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Chapter3Section7 {


    public static void main(String[] args) {
        BiConsumer<Integer,Double> myDoubleProcessor = (index,input)-> System.out.println("Processing"+ input+"at index"+index);
        List<Double> inputs= Arrays.asList(1.1,1.2,4.3);
        process(inputs,myDoubleProcessor);
    }

    /*for 루프에서는 inputs 리스트의 각 요소와 해당하는 인덱스를 가져와서 processor.accept(i, inputs.get(i));를 호출합니다.
    이 호출은 BiConsumer의 accept 메서드를 실행하며, 첫 번째 매개변수로는 인덱스를, 두 번째 매개변수로는 입력 값을 전달합니다.
    따라서 BiConsumer<Integer, Double>를 선언할 때 정의한 람다 표현식
    (index, input) -> System.out.println("Processing"+ input+"at index"+index);이 호출되어 각 입력 값과 해당
    인덱스를 사용하여 "Processing" 메시지가 출력됩니다.
    */
    public static <T> void process(List<T> inputs, BiConsumer<Integer,T> processor){//첫번째는 인덱스여서 고정이다 그러므로 Integer를 넣어준다
        for (int i=0; i<inputs.size(); i++){
            processor.accept(i,inputs.get(i));
        }
    }
}