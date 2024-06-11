package chapter6;

import chapter6.model.Order;
import chapter6.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Chapter6Section2 {
    //filter
    //만족하는 데이터만 걸러내는 용도
    //true를 반환하는 데이터만 존재

    public static void main(String[] args) {
        //1번방식
        Stream<Integer> listw = Stream.of(1,-2,3,-5,15);
        Stream<Integer> number = listw.filter(x -> x >0);
        List<Integer> list = number.collect(Collectors.toList());
        System.out.println(list);


        //2번방식
       List<Integer> numbow =  Stream.of(1,-2,3,-5,15)
                .filter(x -> x>0)
                .toList();//tolist는 자바16부터 가능 코테 사용 x
        System.out.println(numbow);


        User user1 = new User()
                .setId(101)
                .setName("Alice")
                .setVerified(true)
                .setEmailAddress("alice@fastcampus.co.kr");
        User user2 = new User()
                .setId(102)
                .setName("Bob")
                .setVerified(false)
                .setEmailAddress("bob@fastcampus.co.kr");
        User user3 = new User()
                .setId(103)
                .setName("Charlie")
                .setVerified(true)
                .setEmailAddress("charlie@fastcampus.co.kr");

        List<User> users = Arrays.asList(user1,user2,user3);

//         List<User> soa= users.stream()
//                .filter(user -> user.isVerified())
//                .collect(Collectors.toList());

//        List<User> soa= users.stream()
//                .filter(User::isVerified) //이방식은 true갑만 받아온다
//                .collect(Collectors.toList());


                 List<User> soa= users.stream()
                .filter(user -> !user.isVerified()) //false값
                .collect(Collectors.toList());

                System.out.println(soa);


        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED);
        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR);
        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.PROCESSED);
        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.ERROR);
        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS);

        List<Order> orders = Arrays.asList(order1,order2,order3,order4,order5);
         List<Order> ord = orders.stream()
                  .filter(or -> or.getStatus() == Order.OrderStatus.ERROR)
                  .collect(Collectors.toList());

        System.out.println(ord);
    }
}
