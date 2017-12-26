/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.veiculo.entity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ricardo Nascimento
 */
//Cria a tabela 
@Entity
@Table(name="Paciente")

// comando de configuração do banco de dados

public class Paciente implements Serializable{
    @Id 
    @GeneratedValue (strategy= GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String prontuario;
    private String idade;
    private String sexo;
    private String peso;
    private String cor;
    private String enfermaria;
    private String obitoPelaRam;
    private String obitoPorOutrasCausas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEnfermaria() {
        return enfermaria;
    }

    public void setEnfermaria(String enfermaria) {
        this.enfermaria = enfermaria;
    }

    public String getObitoPelaRam() {
        return obitoPelaRam;
    }

    public void setObitoPelaRam(String obitoPelaRam) {
        this.obitoPelaRam = obitoPelaRam;
    }

    public String getObitoPorOutrasCausas() {
        return obitoPorOutrasCausas;
    }

    public void setObitoPorOutrasCausas(String obitoPorOutrasCausas) {
        this.obitoPorOutrasCausas = obitoPorOutrasCausas;
    }
    
    
   
    @Override
    //Conexão com o banco
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.id != null ? this.id.hashCode() : 0);
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
        final Paciente other = (Paciente) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    
    
}

