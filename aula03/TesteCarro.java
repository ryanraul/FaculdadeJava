public class TesteCarro {
    public static void main(String[] args){
        Carro c1 = new Carro();

        c1.codigo = 0;
        c1.velocidadeKm_h = 100;
        System.out.println("O carro moveu "+ c1.mover(10)+ "metros em 10 segundos");
        c1.velocidadeKm_h = 50;
        System.out.println("O carro moveu "+ c1.mover(5)+ "metros em 5 segundos");
        c1.velocidadeKm_h = 80;
        System.out.println("O carro moveu "+ c1.mover(4)+ "metros em 4 segundos");
        
        System.out.println("O total percorrido = "+c1.distanciaPercorrida_m+" metros");

        //System.out.println(c1);
        //System.out.println(c1.toString());
        //System.out.println(c1.codigo);
        //System.out.println(c1.velocidadeKm_h);
        //System.out.println(c1.distanciaPercorrida);


    }
}
