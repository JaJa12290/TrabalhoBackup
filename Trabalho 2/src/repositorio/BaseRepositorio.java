package repositorio;

import java.util.ArrayList;

public abstract class BaseRepositorio<TFakeDB, TDominio> {
    
    protected TFakeDB db;

    protected ArrayList<TDominio> dataset;

    public abstract TDominio Create(TDominio instancia);

    public abstract TDominio Read(int codigo);

    public ArrayList<TDominio> ReadAll(){
        return this.dataset;
    }

    public abstract TDominio Update(TDominio instancia);

    public abstract TDominio Delete(int codigo);
}
