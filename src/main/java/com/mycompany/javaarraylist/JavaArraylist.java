/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nhat Anh
 */
public class JavaArraylist {
    
    public static String find(ArrayList <int[]> allList, int x, int y){
        if(x <= allList.size() && y <= allList.get(x-1).length){
            return "" + allList.get(x-1)[y-1];
        }
    return "ERROR!";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <int[]> allList = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int d = sc.nextInt();
            int[] rowList = new int[d];
            for(int j = 0; i<d; j++){
                rowList[j] = sc.nextInt();
            }
            allList.add(rowList);
        }
        int q = sc.nextInt();
        int[] x = new int[q];
        int[] y = new int[q];
        for(int i = 0; i <q; i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        for(int i = 0; i <q; i++){
            System.out.println(find(allList, x[i], y[i]));
        }
    }
}
