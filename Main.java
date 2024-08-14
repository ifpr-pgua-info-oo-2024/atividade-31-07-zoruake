import java.text.ParseException;


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

        
        academia1.alunos.add(new Aluno("Renato Cariani", "04/07/1976", "Homem", 1.65, 72, "Noob"));
        academia1.alunos.add(new Aluno("Paulo Muzy", "16/07/1979", "Homem", 1.85, 93, "Aspirante a PRO"));
        academia1.alunos.add(new Aluno("Julio Balestrin", "10/10/1979", "Homem", 1.85, 95, "Rei do FARM"));

        academia2.alunos.add(new Aluno("Jorlan Vieira", "14/08/1983", "Homem", 1.69, 100,  "OLD SCHOOL"));
        academia2.alunos.add(new Aluno("Leo Stronda", "05/07/1992", "Homem", 1.78, 94, "Monstro"));
        academia2.alunos.add(new Aluno("Ramon Dino", "09/02/1995", "Homem", 1.81, 103,  "Se quiser sim"));

        for (Aluno aluno : academia1.getAlunos()) {
            System.out.println(aluno.toString());
        }

        for (Aluno aluno : academia2.getAlunos()) {
            System.out.println(aluno.toString());
        }
    }
}