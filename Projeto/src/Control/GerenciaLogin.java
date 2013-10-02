/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.DaoPessoa;
import entities.Pessoa;
import java.util.ArrayList;
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
            lista = daoPessoa.list();
        }

        public void addPessoa(Pessoa p) {
            lista.add(p);
        }

        public Pessoa localizarPessoa(int codigo , String senha) {
            for(Pessoa p : lista){
                if (p.getCodigo() == codigo){
                    if (p.getSenha().equals(senha)){
                        return p;
                    }
                }
            }
            return null;
            }
    }