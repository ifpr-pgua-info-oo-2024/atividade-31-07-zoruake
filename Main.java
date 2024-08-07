import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        Academia academia1 = new Academia("Academia World Atletic", "Rua Trembolona, 11", "935834578");
        Academia academia2 = new Academia("Academia Bio Aventura", "Rua Gabigordo, 99", "9846573486");

        System.out.println(academia1.getNome() + "-" + academia1.getEndereco() + "-" + academia1.getTelefone());

        System.out.println(academia2.getNome() + "-" + academia2.getEndereco() + "-" + academia2.getTelefone());

        academia1.setNome("Barraco das Lendas");
        academia1.setEndereco("Rua dos CLTs, 13");
        academia1.setTelefone("41 984573654");

        academia2.setNome("Bonde do Stronda");
        academia2.setEndereco("Rua da Maromba, 33");
        academia2.setTelefone("41 983498254");

        System.out.println(academia1.getNome() + "-" + academia1.getEndereco() + "-" + academia1.getTelefone());

        System.out.println(academia2.getNome() + "-" + academia2.getEndereco() + "-" + academia2.getTelefone());

        // CADASTRE 3 ALUNOS EM CADA ACADEMIA
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date data1 = formato.parse("04/07/1976");
        Date data2 = formato.parse("16/07/1979");
        Date data3 = formato.parse("10/10/1979");

        Date data4 = formato.parse("14/08/1983");
        Date data5 = formato.parse("05/07/1992");
        Date data6 = formato.parse("109/02/1995");

        academia1.alunos.add(new Aluno("Renato Cariani", "Noob", data1, "Homem", 1.65, 72));
        academia1.alunos.add(new Aluno("Paulo Muzy", "Aspirante a PRO", data2, "Homem", 1.85, 93));
        academia1.alunos.add(new Aluno("Julio Balestrin", "Rei do FARM", data3, "Homem", 1.85, 95));

        academia2.alunos.add(new Aluno("Jorlan Vieira", "OLD SCHOOL", data4, "Homem", 1.69, 100));
        academia2.alunos.add(new Aluno("Leo Stronda", "Monstro", data5, "Homem", 1.78, 94));
        academia2.alunos.add(new Aluno("Ramon Dino", "Se quiser sim", data6, "Homem", 1.81, 103));

        for (Aluno aluno : academia1.getAlunos()) {
            System.out.println(aluno.toString());
        }

        for (Aluno aluno : academia2.getAlunos()) {
            System.out.println(aluno.toString());
        }
    }
}