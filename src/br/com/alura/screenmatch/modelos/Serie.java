package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {
    private int temporadas;
    private boolean ativa;
    private int espisodioPorTemporada;
    private int minutosEspisodio;

    public void setMinutosEspisodio(int minutosEspisodio) {
        this.minutosEspisodio = minutosEspisodio;
    }

    public void setEspisodioPorTemporada(int espisodioPorTemporada) {
        this.espisodioPorTemporada = espisodioPorTemporada;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public int getEspisodioPorTemporada() {
        return espisodioPorTemporada;
    }

    public int getMinutosEspisodio() {
        return minutosEspisodio;
    }

    @Override
    public int getDuracaoEmMinutos(){
        return temporadas * espisodioPorTemporada * minutosEspisodio;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }
}
