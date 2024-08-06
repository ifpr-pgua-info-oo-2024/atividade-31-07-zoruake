public class Main {

    public static void main(String[] args) {

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

    }

}