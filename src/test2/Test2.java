/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test2;

import java.util.Scanner;

/**
 *
 * @author LAB
 */
public class Test2 {

    String[] name = new String[10];
    String[] major = new String[10];
    String[] subject = new String[10];
    int[] score = new int[10];
    Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        new Test2().go();
    }
    
    public void go() {
        getInput();
    }
    
    public void getInput() {
        for(int x = 0; x < 10; x++) {
            System.out.print("ชื่อ:");
            name[x] = keyboard.nextLine();
            System.out.print("สาขา:");
            major[x] = keyboard.nextLine();
            System.out.print("วิชา:");
            subject[x] = keyboard.nextLine();
            System.out.print("คะแนน:");
            score[x] = keyboard.nextInt();
            keyboard.nextLine(); //fix the nextInt thing
        }
    }
    
}
