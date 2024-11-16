import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    public void inscreveBootcamp(Bootcamp bootcamp){
        conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevs().add(this);
    }

    public void progredir(){

        var conteudo = conteudosInscritos.stream().findFirst();

        if (conteudo.isPresent())
        {
            conteudosConcluidos.add(conteudo.get());
            conteudosInscritos.remove(conteudo.get());
        }else 
            System.out.println("Matricule-se");
    }

    public Double calculaXp(){
        return  conteudosConcluidos.stream()
                .mapToDouble(Conteudo::calculaXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public int hashCode() {
       return Objects.hash(nome, conteudosConcluidos, conteudosInscritos);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (obj == null)
            return false;

        if (getClass() != obj.getClass())
            return false;

        Dev other = (Dev) obj;

        return  Objects.equals(nome, other.nome) &&
                Objects.equals(conteudosConcluidos, other.conteudosConcluidos) &&
                Objects.equals(conteudosConcluidos, other.conteudosConcluidos);

    }

    
}
