import java.text.ParseException;

public class Aluno extends Pessoa{
    private String nivel;


public Aluno(String nome, String data_nascimento, String genero, double altura, double peso, String nivel) throws ParseException{
    super(nome, data_nascimento, genero, altura, peso);
    this.nivel = nivel;

}

public String getNivel(){
    return nivel;
}

public void setNivel (String nivel){
    this.nivel = nivel;
}

@Override
public String toString() {
    return super.toString() + ", nivel=" + nivel;
}




}