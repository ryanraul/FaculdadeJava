public class Carro {
    int codigo;
    double velocidadeKm_h;
    double distanciaPercorrida_m;

    double mover(int segundos){
        double dist = ((velocidadeKm_h * 1000) / 3600) * segundos;
        distanciaPercorrida_m += dist;
        return dist;

    }

    @Override
    public String toString(){
        return "Carro [codigo=" + codigo + ", distancia percorrida=" + distanciaPercorrida_m + ", velocidade=" +velocidadeKm_h+"]";
    }

}
