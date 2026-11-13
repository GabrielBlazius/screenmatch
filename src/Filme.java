public class Filme {
    String nome;
    int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;

    void exibiFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento do filme: " + anoDeLancamento);
        System.out.println("Avaliação do filme: " + somaDasAvaliacoes/totalDeAvaliacao);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    int getTotalDeAvaliacao(){
        return totalDeAvaliacao;
    }

    double pegaMedia(){
        return somaDasAvaliacoes/totalDeAvaliacao;
    }
}
