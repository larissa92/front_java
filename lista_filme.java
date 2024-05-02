public class Filme {
    private String titulo;
    private Integer totalVisualizacao;
    private Double avaliacao;
    private Integer anoLancamento;
    
    //getter, setters e toString() omitidos

    filmes.stream()
                .filter(filme -> filme.getAnoLancamento()  == 2022)
                .filter(filme -> filme.getTotalVisualizacao() >= 10000 && filme.getAvaliacao() >= 9.4)
                .sorted(Comparator.comparingDouble(Filme::getAvaliacao).reversed())
                .limit(10)
                .forEach(System.out::println);
}
