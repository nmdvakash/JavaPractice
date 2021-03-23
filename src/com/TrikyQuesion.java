package com;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;


//
@FunctionalInterface
interface  A{
    public Integer add(Integer b, Integer a);
}
//
//@FunctionalInterface // Compile time error
//interface  B extends A{
//    public void add(Double b, Double a);
//}

abstract interface Test{

}

enum Direction{
    North,
    Test;
}

class AA{
    static Integer i = 1111;

    static {
        i = i-- - --i;
        System.out.println("i AA  :: "+i);
    }
    {
        i = i++ + ++i;

        System.out.println("i AA i :: "+i);
    }
}

class BB extends AA {
    static {
        i = --i - i--;
        System.out.println("i BB  :: "+i);
    }
    {
        i = ++i + i++;
        System.out.println("i BB i :: "+i);
    }
}



class ThreadTest extends Thread{

    @Override
    public void run() {
        System.out.println("Thread Run");
    }
}

public class TrikyQuesion {

    public static void string(int i){
        System.out.println("vale");
    }

    public static void main(String[] args) throws FileNotFoundException {


        // incremental
        BB bb = new BB();
        System.out.println(" i  ::  "+bb.i);

        ThreadTest test = new ThreadTest();
        test.run();
        test.start();


        TreeSet<String> tree = new TreeSet<>();
        tree.add("Greeks");
        tree.add("for");
        tree.add("Greeks");
        tree.add("GreeksForGreeks");

        System.out.println("value tree :: "+tree);

        Stream.of(Direction.values()).forEach(System.out::println);

        PriorityQueue<Integer> q = new PriorityQueue<>();
        q.add(11);
        q.add(10);
        q.add(22);
        q.add(5);
        q.add(12);
        q.add(2);

        while (!q.isEmpty()){
            System.out.println("value ----------- :: "+q.remove());
        }


         // Will not require to have catch block with try
        try(PrintWriter writer = new PrintWriter(new File("test.txt"))){

        }


        String s22 = null;

//        string(null);// Compile time error
        double d1 = 1.0;
        double d2 = 0.0;
        byte b = 1;
        d1 = d1/d2;
        b = (byte)d1;
        System.out.println("value ----  :: "+b+"  "+d1);
        // -1 and infinity

//        A aobj = ( b, a) -> {return 1;};

        List<String> list1 = Arrays.asList("A");
        List<Object> lsit = new ArrayList<>();
        //lsit = list1; Compile time error not possible

        String  str = " A";
        Object s = str; //possible
//        str = s; Compile time error

        List<? > list = Arrays.asList("aks");
        // list.add("a"); Compiletime error

        int arr[] = {1, 2, 3, 4};
        IntStream stream = Arrays.stream(arr);
//        System.out.println(stream.reduce(40, (a, b) -> a + b));
        //50 output
        System.out.println(stream.reduce(40, Integer::sum));

        // methodOfA();

        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        //True
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
        //output false
        //From all the above findings, in case 1, i1 and i2 are pointing to same cached object. That’s why i1 == i2 has returned true. But,
        // in case 2, i3 and i4 are pointing to two different newly created objects. That’s why i3 == i4 has returned false.


//        Integer i = new Integer(null);
        //Compile time error while creating string obj
//        String s = new String(null);

        int i = 10 + + +11 - -12 + +13 - -14 + +15;
        System.out.println(i);
        // out put 75
    }

    /**
     * trow the NullPointerException At run time
     *
     * @return
     */
    static int methodOfA() {
        return (true ? null : 0);
    }

}
