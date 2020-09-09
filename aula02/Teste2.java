package aula02;

public class Teste2 {
    public static void main(String[] args){
        Casa c1,c2,c3;

        c1 = new Casa();
        c1.endereco = "A";
        c2 = c1;
        c1 = new Casa();
        c1.endereco = "B";
        c3 = c1;
        c1 = new Casa();
        c1.endereco = "C";

        System.out.println(c1.endereco);
        System.out.println(c2.endereco);
        System.out.println(c3.endereco);



        

    }
}