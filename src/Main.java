import br.com.dio.desafio.dominio.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

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

        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria();

        List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTítulo("mentoria de java");
        mentoria.setdescrição("descrição mentoria java");
        Instant LocaData;
        mentoria.setData(LocaData.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcamp = new bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescrição("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(Bootcamp);
        System out.println("Conteudos Inscritos Camila" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System out.println("*");
        System out.println("Conteudos Inscritos Camila + devCamila.getConteudosInscritos()")
        System out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());
        System out.println("Xp:" + devCamila.calcularTotalXp());

        System out.println("*******");

        Dev devJoão = new Dev();
        devJoão.setNome("João");
        devJoão.inscreverBootcamp(Bootcamp);
        System out.println("Conteudos Inscritos João" + devJoão.getConteudosInscritos());
        devJoão.progredir();
        devJoão.progredir();
        devJoão.progredir();
        System out.println("*");
        System out.println("Conteudos Inscritos João" + devJoão.getConteudosInscritos());
        System out.println("Conteudos Concluidos João" + devJoão.getConteudosConcluidos());
        System out.println("Xp:" + devJoão.calcularTotalXp());
        }
        
    }
}
