package calculos;

public class CalculaddoraDeTempo {
    private int tempoTotal;


    public int getTempoTotal(){
        return this.tempoTotal;
    }




    public void inclui(Titulo tiulo){
        System.out.println("Adiciona duração em minutos de" + titulo);
        this.tempoTotal += tiulo.getDuracaoEmMinutos();

    }
}





