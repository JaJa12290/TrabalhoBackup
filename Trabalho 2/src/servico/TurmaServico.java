package servico;

import java.util.ArrayList;

import Trabalho.dominio.Turma;
import Trabalho.repositorio.TurmaRepositorio;

public class TurmaServico extends BaseServico<TurmaRepositorio, Turma> {
    
    public TurmaServico(){
        this.repositorio = new TurmaRepositorio();
    }

    @Override
    public Turma Inserir(Turma inserir) {
        return this.repositorio.Create(inserir);
    }

    @Override
    public Turma Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<Turma> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Turma Atualizar(Turma inserir) {
        return this.repositorio.Update(inserir);
    }

    @Override
    public Turma Excluir(int codigo) {
        return this.repositorio.Delete(codigo); 
    }
}
