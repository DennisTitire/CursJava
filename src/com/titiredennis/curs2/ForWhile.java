package com.titiredennis.curs2;public class ForWhile {    public static void main(String[] args) {        int [] vector = { 12, 14, 23, 2, 5235};        int numarDeElementeDinLista = vector.length;        System.out.println("Numarul de elemente este egal cu: " + numarDeElementeDinLista);        System.out.println("AFISARE ELEMENTE:");        for (int i=0; i<numarDeElementeDinLista; i++) {            System.out.println(vector[i]);        }        System.out.println("WHILE");        int i = 0;        while( i  < vector.length) {            System.out.println(vector[i]);            i++;        }    }}