/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Khalilullah Nuraini
 */
public class React2 {
    public static void main(String[] args){
            /* Fill method */
            React nilai1=new React(1,1,4,4); //membuat objek bernama nilai1
            React nilai2=new React(2,3,5,6); //membuat objek bernama nilai2
            React u = nilai2.union(nilai1);
            React i = nilai2.intersection(nilai1);

            /* Seleksi kondisi */
            if(u.isInside(nilai1.x1, nilai2.y1))
                System.out.println("<" + nilai2.x1 + "," + nilai2.y1 + "> " + "is inside the union");
            System.out.println(nilai1 + " union " + nilai2 + " = " + u);
            System.out.println(nilai1 + " intersect " + nilai2 + " = " + i);
        }
}
