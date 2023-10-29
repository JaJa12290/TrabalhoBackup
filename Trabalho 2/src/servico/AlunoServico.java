package servico;

import java.util.ArrayList;

import Trabalho.dominio.Aluno;
import Trabalho.repositorio.AlunoRepositorio;

public class AlunoServico extends BaseServico<AlunoRepositorio, Aluno> {
    
    public AlunoServico(){
        this.repositorio = new AlunoRepositorio();
    }

    @Override
    public Aluno Inserir(Aluno inserir) {
        return this.repositorio.Create(inserir);
    }

    @Override
    public Aluno Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<Aluno> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public Aluno Atualizar(Aluno inserir) {
        return this.repositorio.Update(inserir);
    }

    @Override
    public Aluno Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }
}
