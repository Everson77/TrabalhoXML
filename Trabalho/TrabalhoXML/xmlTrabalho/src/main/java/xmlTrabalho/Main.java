package xmlTrabalho;

import java.io.File;

import xmlTrabalho.conversor.ConverterXML;
import xmlTrabalho.model.Aluno;
import xmlTrabalho.model.Disciplina;
import xmlTrabalho.model.Turma;

public class Main {

	public static void main(String[] args) {
		
		ConverterXML<Turma> conversor = new ConverterXML<>(Turma.class);
		Turma turmaConv = conversor.gerarObj(new File("exercicio.xml"));
		
		
}