
package com.mycompany.noexception;

/**
 *
 * @author nlakhal
 */
public class NoException {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int b=10;
        try {
            int num = 121 / 0;            
            System.out.println(num);            
        } catch (Exception e) {
        }
    }
}
