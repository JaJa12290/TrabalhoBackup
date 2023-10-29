package repositorio;

import trabalho.dominio.Aluno;
import trabalho.fakedb.AlunoFakeDB;

public class AlunoRepositorio extends BaseRepositorio <AlunoFakeDB, Aluno> {

    public AlunoRepositorio(){
        this.db = new AlunoFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Aluno Create(Aluno instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Aluno Read(int codigo) {
        for (Aluno aluno : this.dataset) {
            if (aluno.getCodigo() == codigo)
                return aluno;
        }
        return null;
    }

    @Override
    public Aluno Update(Aluno instancia) {
        Aluno alvo = this.Read(instancia.getCodigo());
       alvo.setNome(instancia.getNome());
       alvo.setDataNascimento(instancia.getNome());
       alvo.setNomeUsuario(instancia.getNome());
       alvo.setNomeSenha(instancia.getNome());
        return alvo;
    }

    @Override
    public Aluno Delete(int codigo) {
        Aluno alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}