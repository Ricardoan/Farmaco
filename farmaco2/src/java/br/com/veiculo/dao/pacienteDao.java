/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.veiculo.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.veiculo.entity.Paciente;
import br.com.veiculo.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;

/**
 *
 * @author Ricardo
 * Observações: Toda operação de listagem , remoção, inclusão no banco é feita na classe Dao
 */
public class pacienteDao { // Classe que faz a comunicação com o banco
    private Session sessao;
    private Transaction trans;
    private List<Paciente> list; 

    
    public List<Paciente> getList() { // metodo que retorna a lista
        sessao = HibernateUtil.getSessionFactory().openSession(); // abre a sessão
        trans = sessao.beginTransaction();
        
        Criteria cri = sessao.createCriteria(Paciente.class); // pesquisar criteria
        this.list = cri.list(); 
        return list;
    }
    
   
    public void addPaciente(Paciente p) { // adicionar pessoas no hibernat
        try{    
        sessao = HibernateUtil.getSessionFactory().openSession(); // abre a sessão
        trans = sessao.beginTransaction();
        // pegando os atributos da classe pessoa
        Paciente pa = new Paciente ();
       
        pa.setNome (p.getNome());
        pa.setCor(p.getCor());
        pa.setEnfermaria(p.getEnfermaria());
        pa.setIdade(p.getIdade());
        pa.setObitoPelaRam(p.getObitoPelaRam());
        pa.setObitoPorOutrasCausas(p.getObitoPorOutrasCausas());
        pa.setPeso(p.getPeso());
        pa.setProntuario(p.getProntuario());
        pa.setSexo(p.getSexo());
        
        
        sessao.save(pa); // comomando para salvar no hibernat
        trans.commit(); // confirmação da gravação, grava no banco de dados
        
        } catch (Exception e){
            e.printStackTrace();
        
        } finally{
            sessao.close();
        } 
    
    }  
    
    public void removePaciente (Paciente p){
         try{    
        sessao = HibernateUtil.getSessionFactory().openSession(); // abre a sessão
        trans = sessao.beginTransaction();
        // pegando os atributos da classe pessoa
        
        
        sessao.delete(p); // deletar o objeto no banco de dados
        trans.commit(); //  grava no banco de dados
        
        } catch (Exception e){
            e.printStackTrace();
        
        } finally{
     sessao.close();
        } 
    }

    

    
}
