public abstract class Conteudo {
    
    protected static final Double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public abstract Double calculaXp();

    @Override
    public String toString() {
        return  "Titulo:" + titulo
                + "\nDescricao: " + descricao; 
    }
}
