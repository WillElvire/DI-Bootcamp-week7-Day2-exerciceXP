package Exercice4;


/*
*@author Koua Wilfried
*/

class Exceptions {
    public static void main( String args[] ) {

        try{
            throw new ArithmeticException();
        }catch(Exception e){
            System.out.println("Catch");
            throw new NullPointerException();
        }finally{
            System.out.println("Finally");
            throw new NumberFormatException();
        }
    }
}


/*
*@author Koua Wilfried
*/
