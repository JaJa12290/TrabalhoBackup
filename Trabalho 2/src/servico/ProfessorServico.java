package servico;

import java.util.ArrayList;

import Trabalho.dominio.Professor;
import Trabalho.repositorio.ProfessorRepositorio; 

public class ProfessorServico extends BaseServico<ProfessorRepositorio, Professor> {
    
    public ProfessorServico(){
        this.repositorio = new ProfessorRepositorio();
    }

    @Override
    public Professor Inserir(Professor inserir) {
        return this.repositorio.Create(inserir);
    }

    @Override
    public Professor Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<Professor> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Professor Atualizar(Professor inserir) {
        return this.repositorio.Update(inserir);
    }

    @Override
    public Professor Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }
}
