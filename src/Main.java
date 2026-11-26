import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.Scanner;

public class Main{
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(1990);
        serie.avalia(9);
        serie.setEspisodioPorTemporada(10);
        serie.setTemporadas(9);
        serie.setMinutosEspisodio(50);
        System.out.println("Duração em minutos de lost " + serie.getDuracaoEmMinutos());
        serie.exibiFichaTecnicaSerie();

        Filme filme = new Filme();

        filme.setDiretor("Blazius");
        filme.setDuracaoEmMinutos(50);
        filme.setNome("Poderoso chefão");
        filme.avalia(6);

        Filme outroFilme = new Filme();
        outroFilme.setDuracaoEmMinutos(180);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(outroFilme);
        System.out.println(calculadora.getTempoTotal());

        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(serie);
        filtro.filtra(filme);
    }
}