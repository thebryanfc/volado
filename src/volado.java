import java.util.Random;

class volado {
    private Random random;

    public volado() {
        random = new Random();
    }

    public ResultadoVolado lanzar() {
        int resultado = random.nextInt(2); // 0 representa cara, 1 representa cruz

        if (resultado == 0) {
            return ResultadoVolado.CARA;
        } else {
            return ResultadoVolado.CRUZ;
        }
    }
}

enum ResultadoVolado {
    CARA,
    CRUZ
}

