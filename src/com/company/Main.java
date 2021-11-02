package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
        int number,counter=1,counter2=1;
        System.out.print("Lütfen bir sayı giriniz");
        number= input.nextInt();
        for (int i = 1;i<=number;i*=4){
            System.out.println("4'ün "+counter+". kuvveti şudur : "+i);
            counter++;
        }
        for (int j=1; j<=number;j*=5){
            System.out.println("5'in "+counter2+". kuvveti şudur : "+j);
            counter2++;
        }

    }
}
