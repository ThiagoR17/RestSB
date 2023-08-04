package com.example.br.RestSB.entity;

import java.math.BigDecimal;




public class Valores {

    
    private BigDecimal meusalYoutube =  BigDecimal.ZERO;
    private BigDecimal meusalestagiario =  BigDecimal.ZERO;

    public Valores(){

    }

    public Valores(BigDecimal meusalYoutube){
        this.meusalYoutube = meusalYoutube;
    }
    public Valores(BigDecimal meusalYoutube, BigDecimal meusalestagiario){
        this.meusalYoutube = meusalYoutube;
        this.meusalestagiario = meusalestagiario;
    }



    public BigDecimal getMeusalnoYoutube(){
        return meusalYoutube;
    }

    public void setMeusalYoutube(BigDecimal meusalYoutube){
        this.meusalYoutube = meusalYoutube;
    }

   
    public BigDecimal getMeusalestagio(){
        return meusalestagiario;
    }

    public void setMeusalestagio(BigDecimal meusalestagiario){
        this.meusalestagiario = meusalestagiario;
    }
    @Override
    public String toString() {
        return "Salarios{" + "meu Salario no Youtube=" + meusalYoutube + ", Minha bolsa estágio=" + meusalestagiario + '}';
    }
    


}
