package servico;

import java.util.ArrayList;

import Trabalho.dominio.RendEscolar;
import Trabalho.repositorio.RendEscolarRepositorio;

public class RendEscolarServico extends BaseServico<RendEscolarRepositorio, RendEscolar> {
    
    public RendEscolarServico(){
        this.repositorio = new RendEscolarRepositorio();
    }

    @Override
    public RendEscolar Inserir(RendEscolar inserir) {
        return this.repositorio.Create(inserir);
    }

    @Override
    public RendEscolar Obter(int codigo) {
        return this.repositorio.Read(codigo);
    }

    @Override
    public ArrayList<RendEscolar> Listar() {
        return this.repositorio.ReadAll();
    }

    @Override
    public RendEscolar Atualizar(RendEscolar inserir) {
        return this.repositorio.Update(inserir);
    }

    @Override
    public RendEscolar Excluir(int codigo) {
        return this.repositorio.Delete(codigo);
    }
}
