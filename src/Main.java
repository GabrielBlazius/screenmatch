import java.util.Scanner;

public class Main{
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Filme meuFilme = new Filme();

        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.avalia(8);
        meuFilme.avalia(6.7);
        meuFilme.avalia(9);

        meuFilme.exibiFichaTecnica();

        int totalAvaliacoesFilme = meuFilme.getTotalDeAvaliacao();
        System.out.println(totalAvaliacoesFilme);
    }
}