package repositorio;

import trabalho.dominio.Diciplina;
import trabalho.fakedb.DiciplinaFakeDB;

public class DiciplinaRepositorio extends BaseRepositorio <DiciplinaFackDB, Diciplina> {
    
    public DiciplinaRepositorio(){
        this.db = new DiciplinaFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Diciplina Create(Diciplina instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Diciplina Read(int codigo) {
        for (Diciplina diciplina : this.dataset) {
            if (diciplina.getCodigo() == codigo)
                return diciplina;
        }
        return null;
    }

    @Override
    public Diciplina Update(Diciplina instancia) {
        Diciplina alvo = this.Read(instancia.getCodigo());
        alvo.setCodigo(instancia.getNome());
        alvo.setEmenta(instancia.getEmenta());
        return alvo;
    }

    @Override
    public Diciplina Delete(int codigo) {
        Diciplina alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
