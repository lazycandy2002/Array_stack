/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_stack;

import java.util.Scanner;

/**
 *
 * @author Jared Gamutin
 */
public class Array_stack {

    public static int a;
    static stack_room istack = new stack_room();
    static Scanner reply = new Scanner(System.in);
    static Scanner reply_1 = new Scanner(System.in);

    public static void main(String[] args) {

        start();

    }

    public static void start() {
        System.out.println("--------------------------------");
        istack.view_stack();
        System.out.println("--------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("Press 1 : add element");
        System.out.println("      2 : remove element");
        System.out.println("");
        filter_1();

    }

    static void filter_1() {
        int reply_a = reply.nextInt();
        a = reply_a;
        switch (a) {

            case 1:

                System.out.println("Enter the number :");
                int reply_b = reply.nextInt();
                istack.push(reply_b);
                start();
                break;
            case 2:

                System.out.println("");
                System.out.println("Y/N?:");
                String reply_c = reply_1.nextLine();

                switch (reply_c) {

                    case "Y":
                        istack.pull();
                    case "N":
                        start();
                    default:
                        System.out.println("INVALID, TRY AGAIN");
                        start();
                        break;

                }
            default:
                System.out.println("INVALID, TRY AGAIN");
                start();
                break;

        }
    }
}
