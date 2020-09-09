package aula02;

public class Teste {
    public static void main(String[] args){
        Casa c1 = new Casa();
        Casa c2 = null;

        System.out.println(c1.qtdComodos);
        System.out.println(c1.endereco);
        c2 = c1;
        c1.endereco = "eqw";
        System.out.println(c2.qtdComodos);
        System.out.println(c2.endereco);

        

    }
}