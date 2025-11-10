public class pesquisaBinaria {
    public static int pesquisaBinaria(int[] array, int valorProcurado) {
        int baixo = 0;
        int alto = array.length - 1;

        while (baixo <= alto) {
            int meio = baixo + (alto - baixo) / 2;

            if (array[meio] == valorProcurado) {
                return meio; // Valor encontrado
            }

            if (array[meio] < valorProcurado) {
                baixo = meio + 1; // Procurar na metade superior
            } else {
                alto = meio - 1; // Procurar na metade inferior
            }
        }
        return -1; // Valor não encontrado
    }

    public static void main(String[] args) {
        int[] minha_lista = new int[]{1, 2, 3, 4, 5};
        int resultado = pesquisaBinaria(minha_lista, 5);
        System.out.println("Resultado: " + resultado);
    }
}