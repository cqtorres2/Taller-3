public class Coche {
    String marca;
    String modelo;
    static int contadorCoches;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    @Override
    public String toString() {
        return "El modelo del coche es " + modelo + " de la marca " + marca + " lo que da a la lista un total de "
                + contadorCoches + " coches";
    }
}
