import br.com.dio.desadio.dominio.Curso;
import br.com.dio.desadio.dominio.Mentoria;

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
        curso1.setTitulo("Curso PHP");
        curso1.setDescricao("Descrição do curso PHP");
        curso1.setCargahoraria(60);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso);
        System.out.println(mentoria);

    }
}