package servico;

import java.util.ArrayList;

import Trabalho.dominio.Disciplina;
import Trabalho.repositorio.DisciplinaRepositorio;

public class DisciplinaServico extends BaseServico<DisciplinaRepositorio, Disciplina> {
    
    public DisciplinaServico(){
        this.repositorio = new DisciplinaRepositorio();
    }

    @Override
    public Disciplina Inserir(Disciplina inserir) {
        return this.repositorio.Create(inserir);
    }

    @Override
    public Disciplina Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<Disciplina> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Disciplina Atualizar(Disciplina inserir) {
        return this.repositorio.Update(inserir);
    }

    @Override
    public Disciplina Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }
}
