package repositorio;

import Trabalho.dominio.RendEscolar;
import Trabalho.fakedb.RendEscolarFakeDB;

public class RendEscolarRepositorio extends BaseRepositorio<RendEscolarFakeDB, RendEscolar> {

    public RendEscolarRepositorio(){
        this.db = new RendEscolarFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public RendEscolar Create(RendEscolar instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public RendEscolar Read(int codigo) {
        for (RendEscolar rendescolar : this.dataset) {
            if (rendescolar.getCodigo() == codigo)
                return rendescolar;
        }
        return null;
    }

    @Override
    public RendEscolar Update(RendEscolar instancia) {
        RendEscolar alvo = this.Read(instancia.getCodigo());
        alvo.setAluno(instancia.getAluno());
        alvo.setTurma(instancia.getTurma());
        alvo.setNotaProva1(instancia.getNotaProva1());
        alvo.setNotaProva2(instancia.getNotaProva2());
        alvo.setTrabalhos(instancia.getTrabalhos());
        alvo.setMediaTrabalhos(instancia.getMediaTrabalhos());
        alvo.setMediaGeralAluno(instancia.getMediaGeralAluno());
        return alvo;
    }

    @Override
    public RendEscolar Delete(int codigo) {
        RendEscolar alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
