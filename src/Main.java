import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTítulo("curso java");
        curso1.setdescrição("descrição curso java");
        curso1.setCargaHorária(8);

        Curso curso2 = new Curso();
        curso2.setTítulo("curso js");
        curso2.setdescrição("descrição curso js");
        curso2.setCargaHorária(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTítulo("mentoria de java");
        mentoria.setdescrição("descrição mentoria java");
        mentoria.setData(LocaData.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
}
