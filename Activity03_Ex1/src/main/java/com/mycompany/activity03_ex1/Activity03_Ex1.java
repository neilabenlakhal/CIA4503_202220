/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.activity03_ex1;

/**
 *
 * @author nlakhal
 */
public class Activity03_Ex1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {

            throw new Exception("An Exception is thrown");

        } catch (Exception e) {

            System.out.println("An exception is catched");

        } finally {

            System.out.println("You are in Try Catch Finally block");

        }

    }
}
