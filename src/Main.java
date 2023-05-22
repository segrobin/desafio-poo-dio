import br.com.dio.desadio.dominio.*;

import java.lang.module.Configuration;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("Curso java");
        curso.setDescricao("Descrição do curso java");
        curso.setCargahoraria(40);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso PHP ");
        curso1.setDescricao("Descrição do curso PHP ");
        curso1.setCargahoraria(60);

        Curso curso2 = new Curso();
        curso1.setTitulo("Curso MSQL ");
        curso1.setDescricao("Descrição do curso MSQL ");
        curso1.setCargahoraria(50);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java ");
        mentoria.setDescricao("descrição mentoria java ");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso);
        System.out.println(mentoria);
        */


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Venha aprender java e sua propriedade no nosso Bootcamp");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devgabriel = new Dev();
        devgabriel.setNome("Gabriel");
        devgabriel.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos gabriel"+ devgabriel.getConteudosIncritos());
        devgabriel.progedir();
        System.out.println("Conteudos incritos gabriel"+ devgabriel.getConteudosIncritos());
        System.out.println("Conteudos Concluidos  gabriel"+ devgabriel.getConteudosConcluidos());
        System.out.println("XP"+ devgabriel.calcularTotalxp());

        System.out.println(" ");

        Dev devcamila =new Dev();
        devcamila.setNome("Camila");
        devcamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos camila"+ devcamila.getConteudosIncritos());
        devcamila.progedir();
        System.out.println("Conteudos incritos Camila"+ devcamila.getConteudosIncritos());
        System.out.println("Conteudos Concluidos  Camila"+ devcamila.getConteudosConcluidos());
        System.out.println("XP"+ devcamila.calcularTotalxp());




    }
}