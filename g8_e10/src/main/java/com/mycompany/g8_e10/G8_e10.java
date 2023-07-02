/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e10;

import java.util.Arrays;

/**
 *
 * @author jpc
 */
public class G8_e10 {

    public static void main(String[] args) {
        double[] arr50 = new double[50];
        double[] arr20 = new double[20];
        
        llenar50(arr50);
        imprimir(arr50);
        Arrays.sort(arr50);
        imprimir(arr50);
        llenar20(arr50, arr20);
        imprimir(arr20);
    }
    
    public static void llenar50(double[] arr50){
        //random.nextDouble() * 98 + 1;
        for (int i = 0; i < arr50.length; i++) {
            arr50[i] = Math.random() * 98 + 1;
        }
    }
     
    public static void llenar20(double[] arr50, double[] arr20){
        //random.nextDouble() * 98 + 1;
        for (int i = 0; i < 10; i++) {
            arr20[i] = arr50[i];
        }
        Arrays.fill(arr20, 10, 20, 0.5);
    }
    
    public static void imprimir(double[] arr){
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
