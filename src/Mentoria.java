import java.time.LocalDate;

public class Mentoria extends Conteudo{
    
    private LocalDate data;

    @Override
    public Double calculaXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return  super.toString() + 
                "\nData: " + data;
    }

}
