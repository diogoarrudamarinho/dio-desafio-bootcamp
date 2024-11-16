public class Curso extends Conteudo{
    
    private Integer cargaHoraria;

    public Curso (){        
    }

    @Override
    public Double calculaXp() {
        return XP_PADRAO + 20d;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString() {
        return  super.toString() + 
                "\nCarga Horaria: " + cargaHoraria;
    }
}
