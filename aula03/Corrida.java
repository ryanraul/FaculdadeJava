public class Corrida {
    public static void main(String[] args){
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        

        double distanciaPistaMetros = 10000;

        while(c1.distanciaPercorrida_m <= distanciaPistaMetros || c2.distanciaPercorrida_m <= distanciaPistaMetros){
            c1.velocidadeKm_h = Math.random() * 200;
            //System.out.println("VEL C1 = " + c1.velocidadeKm_h);
            c2.velocidadeKm_h = Math.random() * 200;
            //System.out.println("VEL C2 = " + c2.velocidadeKm_h);
            c1.mover(1);
            c2.mover(1);
        }

        if(c1.distanciaPercorrida_m > c2.distanciaPercorrida_m){
            System.out.println("C1 VENCEU!");
        }else{
            System.out.println("C2 VENCEU!");
        }


    }
}
