/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.DaoPessoa;
import Model.Filter;
import Model.Operator;
import entities.Pessoa;
import java.util.List;

/**
 *
 * @author Popovicz
 */
public class GerenciaLogin {

    private DaoPessoa daoPessoa = new DaoPessoa();
    private Pessoa pessoa;
    private List<Pessoa> lista;
//    private ArrayList<Pessoa> pessoa;

    public GerenciaLogin() throws Exception {
        List<Pessoa> lista;

    }

    public void addPessoa(Pessoa p) {
        lista.add(p);

    }

    public Pessoa localizarPessoa(int codigo) throws Exception {
        Pessoa p;
        Filter f = new Filter("codigo", Operator.EQUAL, codigo);
        lista = daoPessoa.list(f);
        p = lista.get(0);
        for (Pessoa e : lista) {
            p.setId(e.getId());
            p.setSaldo(e.getSaldo());
            p.setCategoria(e.getCategoria());
            p.setCodigo(e.getCodigo());
            p.setNome(e.getNome());
            p.setSenha(e.getSenha());
            p.setEmail(e.getEmail());
        }
        if (p.getCodigo() == codigo) {
            return p;
        }
        return null;
        }
    
}