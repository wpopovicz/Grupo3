/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import entities.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author Popovicz
 */
public class GerenciaLogin {
    
    private ArrayList<Pessoa> pessoa;
    

        public GerenciaLogin() {
            pessoa = new ArrayList<>();
        }

        public void addPessoa(Pessoa p) {
            pessoa.add(p);
        }

        public Pessoa localizarPessoa(int codigo , String senha) {
            for(Pessoa p : pessoa){
                if (p.getCodigo() == codigo){
                    if (p.getSenha().equals(senha)){
                        return p;
                    }
                }
            }
            return null;
            }
    }