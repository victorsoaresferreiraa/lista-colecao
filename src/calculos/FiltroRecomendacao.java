package calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Esta entre os preferidos do momento");

        } else if (classificavel.getClassificacao() >= 2){
            System.out.println("Muito bom avaliado no momento");

        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
