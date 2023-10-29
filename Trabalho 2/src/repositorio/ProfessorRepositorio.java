package repositorio;

import trabalho.dominio.Professor;
import trabalho.fakedb.ProfessorFakeDB;

public class ProfessorRepositorio extends BaseRepositorio<ProfessorFakeDB, Professor> {
    
    public ProfessorRepositorio(){ 
        this.db = new ProfessorFakeDB();
        this.dataset = this.db.getTabela(); 
    }

    @Override
    public Professor Create(Professor instancia) {
        int tam = this.dataset.size() - 1;
        int proxCodigo = this.dataset.get(tam).getCodigo();
        proxCodigo++;
        instancia.setCodigo(proxCodigo);
        this.dataset.add(instancia);
        return instancia;
    }

    @Override
    public Professor Read(int codigo) {
        for (Professor professor : this.dataset) {
            if (professor.getCodigo() == codigo)
                return professor;
        }
        return null;
    }

    @Override
    public Professor Update(Professor instancia) {
        Professor alvo = this.Read(instancia.getCodigo());
        alvo.setNome(instancia.getNome());
        alvo.setDataNascimento(instancia.getDataNascimento());
        alvo.setNomeUsuario(instancia.getNomeUsuario());
        alvo.setSenha(instancia.getSenha());
        alvo.setCargo(instancia.getCargo());
        return alvo;
    }

    @Override
    public Professor Delete(int codigo) {
        Professor alvo = this.Read(codigo);
        this.dataset.remove(alvo);
        return alvo; 
    }
}
