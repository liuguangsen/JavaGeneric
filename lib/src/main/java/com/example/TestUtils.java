package com.example;

import com.example.bean.Container;

import java.util.List;

/**
 * Created by liugs on 2018/2/9.
 */

final class TestUtils {
    public static final String TAG = "TestUtils";

    /**
     * 泛型方法的规则定义如下：
     * 1.所有泛型方法声明都有一个类型参数声明部分（由尖括号分隔），该类型参数声明部分在方法返回类型之前（在下面例子中的<E>）。
     * 2.每一个类型参数声明部分包含一个或多个类型参数，参数间用逗号隔开。一个泛型参数，也被称为一个类型变量，是用于指定一个泛型类型名称的标识符。
     * 3.类型参数能被用来声明返回值类型，并且能作为泛型方法得到的实际参数类型的占位符。
     * 4.泛型方法体的声明和其他方法一样。注意类型参数只能代表引用型类型，不能是原始类型（像int,double,char的等）
     * </B>
     *
     * @param inputArray 参数
     * @param <E>        返回值
     */
    static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
    }

    /**
     * 有界的类型参数:
     * 1.可能有时候，你会想限制那些被允许传递到一个类型参数的类型种类范围。例如，一个操作数字的方法可能只希望接受Number或者Number子类的实例。这就是有界类型参数的目的。
     * 2.要声明一个有界的类型参数，首先列出类型参数的名称，后跟extends关键字，最后紧跟它的上界
     * </B>
     *
     * @param x   参数1
     * @param y   参数2
     * @param z   参数3
     * @param <T> 参数的类型
     * @return 返回值
     */
    static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    /**
     * 1、类型通配符一般是使用?代替具体的类型参数。例如 List<?> 在逻辑上是List<String>,List<Integer> 等所有List<具体类型实参>的父类
     * </B>
     *
     * @param data
     */
    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    /**
     * 2、类型通配符上限通过形如List来定义，如此定义就是通配符泛型值接受Number及其下层子类类型
     * </B>
     *
     * @param data
     */
    public static void getData1(List<? extends Container> data) {
        System.out.println("data :" + data.get(0));
    }

    /**
     * 3、类型通配符下限通过形如 List<? super Number>来定义，表示类型只能接受Number及其三层父类类型，如Objec类型的实例。
     * </B>
     *
     * @param data
     */
    public static void getData2(List<? super Container> data) {
        System.out.println("data :" + data.get(0));
    }
}
