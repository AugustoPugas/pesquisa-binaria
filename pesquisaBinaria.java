public class pesquisaBinaria {
    public static int pesquisaBinaria(int[] array, int valorProcurado) {
        int baixo = 0;
        int alto = array.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = array[meio];

            if (chute == valorProcurado) {
                return meio; // Valor encontrado
            }

            if (chute > valorProcurado) {
                alto = meio - 1; // Procurar na metade inferior
            } else {
                baixo = meio + 1; // Procurar na metade superior
            }
        }
        return -1; // Valor não encontrado
    }

    public static void main(String[] args) {
        int[] minha_lista = new int[]{1, 3, 5, 7, 9};
        int resultado = pesquisaBinaria(minha_lista, 3);
        System.out.println("Resultado: " + resultado);
    }
}