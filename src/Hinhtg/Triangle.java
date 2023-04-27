package Hinhtg;

import java.util.Scanner;

public class Triangle {
    public void ex(int x,int y, int z){
        try {
            if (x<0||y<0||z<0||x+y<z||x+z<y||y+z<x){
                throw new  IllegalArgumentException("sai");
            }
            System.out.println("ok");
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
