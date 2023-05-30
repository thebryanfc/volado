public class Main {
    public static void main(String[] args) {
        volado volado = new volado();
        int numLanzamientos = 10;

        for (int i = 1; i <= numLanzamientos; i++) {
            ResultadoVolado resultado = volado.lanzar();
            System.out.println("Lanzamiento " + i + ": " + resultado);
        }
    }
}
