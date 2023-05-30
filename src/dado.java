import java.util.Random;
public class dado {
    private Random random;
    private int caras;

    public dado(int numCaras) {
        random = new Random();
        caras = numCaras;
    }

    public int lanzar() {
        return random.nextInt(caras) + 1;
    }
}

