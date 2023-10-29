package repositorio;

import trabalho.dominio.Turma;
import trabalho.fakedb.TurmaFakeDB;

public class TurmaRepositorio extends BaseRepositorio<TurmaFakeDB, Turma>{
    
    public TurmaRepositorio(){
        this.db = new TurmaFakeDB();
        this.dataset = this.db.getTabela();
    }

    @Override
    public Turma Create(Turma instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Turma Read(int codigo) {
        for (Turma turma : this.dataset) {
            if (turma.getCodigo() == codigo)
                return turma;
        }
        return null;
    }

    @Override
    public Turma Update(Turma instancia) {
        Turma alvo = this.Read(instancia.getCodigo());
        alvo.setDisciplina(instancia.getDisciplina());
        alvo.setProfessor(instancia.getProfessor());
        alvo.setCapacidadeTurma(instancia.getCapacidadeTurma());

        return alvo;
    }

    @Override
    public Turma Delete(int codigo) {
        Turma alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo;
    }
}
