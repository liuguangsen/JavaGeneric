package com.example;

import com.example.bean.Container;
import com.example.bean.ColorType;
import com.example.bean.Person;

import static com.example.TestUtils.maximum;
import static com.example.TestUtils.printArray;

public class MyClass {

    public static void main(String args[]) {
        // 创建不同类型数组： Integer, Double 和 Character 实体类 枚举类
        //test1();
        //test2();
        test3();
    }

    private static void test3() {
        Container<Integer> integerBox = new Container<>();
        Container<String> stringBox = new Container<>();
        integerBox.setT(1);
        stringBox.setT(String.valueOf(1));
        System.out.printf("int :%d\n\n", integerBox.getT());
        System.out.printf("string :%s\n", stringBox.getT());
    }

    private static void test2() {
        System.out.printf( "%d, %d and %d Larger %d\n\n",
                3, 4, 5, maximum( 3, 4, 5 ) );

        System.out.printf( "%.1f, %.1f and %.1f Larger %.1f\n\n",
                6.6, 8.8, 7.7, maximum( 6.6, 8.8, 7.7 ) );

        System.out.printf( "%s, %s and %s Larger %s\n","pear",
                "apple", "orange", maximum( "pear", "apple", "orange" ) );

        System.out.printf( "Smaller %s\n", maximum( new Person("name1", 1), new Person("name2", 2) ,new Person("name3", 3)) );
        System.out.printf( "Larger %s\n", maximum( new Person("name3", 3), new Person("name2", 2) ,new Person("name1", 1)) );
    }

    private static void test1() {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
        Person[] personArray = {new Person("name1", 1), new Person("name2", 2)};
        ColorType[] colorTypeArray = ColorType.values();
        ;

        System.out.printf("\n int element:\n");
        printArray(intArray); // 传递一个整型数组

        System.out.println("\n double element:");
        printArray(doubleArray); // 传递一个双精度型数组

        System.out.println("\n char element:");
        printArray(charArray); // 传递一个字符型数组

        System.out.println("\n Person element:");
        printArray(personArray); // 传递一个实体类数组

        System.out.println("\n enum element:");
        printArray(colorTypeArray); // 传递一个枚举类数组
    }
}
