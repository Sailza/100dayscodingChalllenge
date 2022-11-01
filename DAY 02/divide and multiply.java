# 100dayscodingChalllenge
//Program to calculate product and divide 

class Compute 

{

    static int product (int x, int y)

    {

        return x*y;

    }

    static int divide(int x, int y)

    {

        return x/y;

    }

}

public class Computemath

{

    public static void main(String args[])

    {

        int a = Compute.product(4,5);

        int b = Compute.divide (8,2);

        System.out.println("product is ="+a);

        System.out.println("quotient is ="+b);

    }

}
