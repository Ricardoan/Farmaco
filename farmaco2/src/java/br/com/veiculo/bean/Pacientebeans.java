/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.veiculo.bean;


import br.com.veiculo.entity.Paciente;

import br.com.veiculo.dao.pacienteDao;
import java.util.List;
import javax.faces.bean.*;


/**
 *
 * @author Ricardo
 */
@ManagedBean
@SessionScoped
public class Pacientebeans {

    /**
     * Creates a new instance of Pessoasbean
     */
    
    private Paciente pa = new Paciente ();
    private pacienteDao pacienteDao = new pacienteDao();
    private List<Paciente> listarPaciente;
    
    public Pacientebeans() {
    }
    
    
    public Paciente getPaciente() {
        return pa;
    }
   
    public void setPaciente(Paciente p) {
        this.pa = p;
    }
    //**************************************
   
    public List listarPaciente(){
      listarPaciente = pacienteDao.getList();
       return this.listarPaciente;
   }
   //************************************** 
    
    
    public String adicionarPaciente (){  // adicionar pessoas
        pacienteDao.addPaciente(pa);
        pa.setCor(null);
        pa.setEnfermaria(null);
        pa.setIdade(null);
        pa.setNome(null);
        pa.setObitoPelaRam(null);
        pa.setObitoPorOutrasCausas(null);
        pa.setPeso(null);
        pa.setProntuario(null);
        pa.setSexo(null);
        return "index";
    }
    //*************************************
   
    public String removerPaciente (Paciente p){
        this.pa = p;
        pacienteDao.removePaciente (pa);
        pa.setCor(null);
        pa.setEnfermaria(null);
        pa.setIdade(null);
        pa.setNome(null);
        pa.setObitoPelaRam(null);
        pa.setObitoPorOutrasCausas(null);
        pa.setPeso(null);
        pa.setProntuario(null);
        pa.setSexo(null);
        return "index";
    }
    //***************************************
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + (this.pa != null ? this.pa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
         final Pacientebeans other = (Pacientebeans) obj;
        if (this.pa != other.pa && (this.pa == null || !this.pa.equals(other.pa))) {
            return false;
        }
        return true;
    }
    
    
}

