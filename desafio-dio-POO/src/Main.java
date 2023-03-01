import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        
                    // CURSOS

        //Criando os cursos
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        //Utilizando o método Set
        curso1.setTitulo("Java");
        curso1.setDescricao("Introdução ao Java");
        curso1.setCargaHoraria(8);
        
        curso2.setTitulo("Python");
        curso2.setDescricao("Introdução ao Python");
        curso2.setCargaHoraria(6);

                    // MENTORIAS
                    
        //Criando a mentoria
        Mentoria mentoria = new Mentoria();

        //Utilizando o método Set
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());
        
                    // BOOTCAMP
        
        //Criando o bootcamp
        Bootcamp bootcamp = new Bootcamp();
        
        //Utilizando o método Set
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aprenda a desenvolver em Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

                    // DEVS
        
        //Dev Marcelo
        Dev devMarcelo = new Dev();
        devMarcelo.setNome("Marcelo");
        devMarcelo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Marcelo:" + devMarcelo.getConteudosInscritos());
        devMarcelo.progredir();
        devMarcelo.progredir();
        devMarcelo.progredir();
        System.out.println("Conteúdos Inscritos de Marcelo:" + devMarcelo.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Marcelo:" + devMarcelo.getConteudosConcluidos());
        System.out.println("XP:" + devMarcelo.calcularXp());

        System.out.println("-----------------------"); 
        //Dev Vanessa
        Dev devVanessa = new Dev();
        devVanessa.setNome("Vanessa");
        devVanessa.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Vanessa:" + devVanessa.getConteudosInscritos());
        devVanessa.progredir();
        devVanessa.progredir();
        System.out.println("Conteúdos Inscritos de Vanessa:" + devVanessa.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Vanessa:" + devVanessa.getConteudosConcluidos());
        System.out.println("XP:" + devVanessa.calcularXp());
        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);
    }
}
