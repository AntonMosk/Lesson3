package ExceptionsTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Random;
import java.util.zip.DataFormatException;

/**
 * Created by anton on 3/4/17.
 */
public class Test {

    private int age;

    public Test() throws Exception {
        System.out.println("From construction Test()");
//        throw new Exception();
    }

    public static void main(String[] args) throws Exception {
        Test t = new Test();
//        t.method3();
        t.method3();

    }

    public void method1() {
        System.out.println("From method1()");

    }

    public void method2() {
        List list = new ArrayList();
        while (true) {
            list.add(new Object());
        }
    }

    public void method3() {
        Random r = new Random();

        try {
            method4(r.nextInt());
        } catch (DataFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            try {
                method4(4);
            } catch (DataFormatException e1) {
                e1.printStackTrace();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void method4(int a) throws DataFormatException, IOException {
        throw new IOException();

//        switch (a) {
//            case 1: throw new IOException();
//            case 2: throw new DataFormatException();
//        }


    }

    public void method6() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int someInteger = 0;
//        throw new Exception();

        while (someInteger != -1) {

            try {
                System.out.println("Please enter some integer value ");
//                System.out.println("From try before readLine() execution");
                someInteger = Integer.parseInt(reader.readLine());
//                System.out.println("From method3() after readLine() execution");
                System.out.println("Your value is: " + someInteger);

            } catch (IOException | NumberFormatException e) {
                System.out.println("Your value is wrong. Please enter integer value ");
//                e.printStackTrace();
            }
        }
    }

    public void method7() {

    }

}
