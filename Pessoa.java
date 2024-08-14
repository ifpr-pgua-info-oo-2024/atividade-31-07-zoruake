import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Pessoa{

    protected String nome;
    protected String genero;
    protected Date data_nascimento;
    protected double altura;
    protected double peso;

    public Pessoa(String nome, String genero, String data_nascimento, double altura, double peso) throws ParseException{

        this.nome = nome;
        this.genero = genero;
        this.data_nascimento = convertStringToDate(data_nascimento);
        this.altura = altura;
        this.peso = peso;

    }

    public String getNome(){
        return nome;
    }

    public String getGenero(){
        return genero;
    }

    public Date data_nascimento(){
        return data_nascimento;
    }

    public double altura(){
        return altura;
    }

    public double peso(){
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setData_nascimento(Date data_nascimento){
        this.data_nascimento = data_nascimento;
    }

    public void setAltura( double altura){
        this.altura = altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public static Date convertStringToDate(String data_nascimento) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.parse(data_nascimento);
    }

    public static String convertDateToString(Date data_nascimento) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return simpleDateFormat.format(data_nascimento);
    }

    public int calcularIdade(Date nascimento){
        Date actualDate = new Date();

        long diffInMillies = Math.abs(actualDate.getTime() - data_nascimento.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return (int) diff / 365;
    } 










}
