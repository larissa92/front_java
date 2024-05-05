Map<Integer, Double> avaliacoesPorTemporada = episodios.stream()
        .filter(e -> e.getAvaliacao() > 0.0)
        .collect(Collectors.groupingBy(Episodio::getTemporada,
                Collectors.averagingDouble(Episodio::getAvaliacao)));
System.out.println(avaliacoesPorTemporada);

// System.out.println("Digite um trecho do título do episódio");
// var trechoTitulo = leitura.nextLine();
// Optional<Episodio> episodioBuscado = episodios.stream()
//         .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
//         .findFirst();
// if(episodioBuscado.isPresent()){
//     System.out.println("Episódio encontrado!");
//     System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
// } else {
//     System.out.println("Episódio não encontrado!");
// }

