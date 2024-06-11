package chapter6;

import chapter6.model.Order;
import chapter6.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Chapter6Section3 {

    //map 데이터를 변형하거나 추출하는데 사용
    //데이터를 해당함수가 적용된 결과물을 제공하는 stream이다
    //예) integer list에 있는값을 다2배로 하고 싶다던가

    public static void main(String[] args) {
        List<Integer> so = Arrays.asList(1,2,3,4,5,6);
        List<Integer> sow  =  so.stream()
                .map(s -> s*2)
                .collect(Collectors.toList());

//        System.out.println(sow);

        List<String> sp = so.stream()
                        .map(x -> "결과값" +x)
                        .toList();
        System.out.println(sp);

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

      List<User> users =  Arrays.asList(user2,user3,user1);
         List<String> email   =  users.stream()
              .map(User::getEmailAddress)//getEmailAddress를 하나씩 가지고 온다 String타입이다
              .collect(Collectors.toList());

//        System.out.println(email);



        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED)
                .setCreatedByUserId(101);
        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(103);
        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.PROCESSED)
                .setCreatedByUserId(102);
        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(104);
        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS)
                .setCreatedByUserId(101);



       List<Order> orders = Arrays.asList(order1,order2,order5,order4,order3);
       List<Long> sa =  orders.stream()
                .map(Order::getCreatedByUserId)
                .collect(Collectors.toList());
        System.out.println(sa);
    }

}
