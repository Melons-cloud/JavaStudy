package com.hjl.JavaBasic;

public class Hmhc {

    public static void main(String[] args) {

        int cock,hen,chicken;
        for (cock=0;cock<=19;cock++){

            for (hen=0;hen<=33;hen++){

                chicken=100-cock-hen;
                int p;
                p=chicken%3;
                if (((5*cock+3*hen+chicken/3)==100)&&(p==0)){

                    System.out.println("   可以买的公鸡数: "+cock);
                    System.out.println("   可以买的母鸡数: "+hen);
                    System.out.println("   可以买的小鸡数: "+chicken);
                    System.out.println("\n");
                }
            }
        }
    }
}
