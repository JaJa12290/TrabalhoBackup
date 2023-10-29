package servico;

import java.util.ArrayList;

public abstract class BaseServico<TRepositorio, TDominio> {
      
    protected TRepositorio repositorio;

    public abstract TDominio Inserir(TDominio inserir);

    public abstract TDominio Obter(int codigo);

    public abstract ArrayList<TDominio> Listar();

    public abstract TDominio Atualizar(TDominio inserir);

    public abstract TDominio Excluir(int codigo);

    public BaseServico(){}
}
