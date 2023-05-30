public class m {
    public static void main(String[] args) {
        dado dad = new dado(6); // Crear un dado de 6 caras
        int numLanzamientos = 5;

        for (int i = 1; i <= numLanzamientos; i++) {
            int resultado = dad.lanzar();
            System.out.println("Lanzamiento " + i + ": " + resultado);
        }
    }

}
