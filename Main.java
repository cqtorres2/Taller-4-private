public class Main {
    public static void main(String[] args) {
        class Coche {
            private String marca;
            private String modelo;
            private int velocidadMaxima;
            private int velocidadMinima = 1;

            public Coche(String marca, String modelo) {
                this.marca = marca;
                this.modelo = modelo;
                this.velocidadMaxima = 0;
            }

            public int acelerar() {
                if (velocidadMinima > 0) {
                    velocidadMaxima++;
                }
                if (velocidadMaxima >= 10) {
                    System.out.println("Suficiente velocidad");
                }
                return velocidadMaxima;
            }
        }
        Coche CocheMedido = new Coche("Renault", "Toyota");
        int velocidadGeneral = CocheMedido.acelerar();
        System.out.println("La velocidad es: " + velocidadGeneral);

    }
}
