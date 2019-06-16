/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofemcar;

/**
 *
 * @author Home
 */
public class DadosUsuarios {
    

 

    
   private String nome;
   
   private String senha;
   
   private String login;
   
   private String email;
   
   private String cpf;
    
   
   public DadosUsuarios(){
    
     
   
   }
   
   public String getNome(){
   
   return nome;
   }
   
   public void setNome(String name){
   
   nome = name;
   }
   
   public String getLogin(){
   
   return login;
   }
   
   public void setLogin(String log ){
   
   login = log;
   }
   
   public String getCpf() {
       return cpf;
   }
   
   public void setCpf(String cp){
       cpf = cp;
   }
   
   public String getSenha () {
       return senha;
   }
   
   public void setSenha (String sn){
       senha = sn;
   }
   
   
   
}

    

