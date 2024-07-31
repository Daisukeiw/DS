/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import javax.swing.JOptionPane;

public class Automotivo {
    private String modelo;
    private String marca;
    private Integer ano;
    private String cor;
    
    public Automotivo() {
        this("", "", 0, "");
    }
    public Automotivo(String modelo, String marca, Integer ano, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void provarExistencia(){
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Marca: "+ this.getMarca());
        System.out.println("Ano: "+ this.getAno());
        System.out.println("Cor: "+ this.getCor());
        
        JOptionPane.showMessageDialog(null, "Modelo: "+ this.getModelo() + "\n Marca: "+ this.getMarca()+
"\n Ano: "+ this.getAno()+ "\n Cor: "+ this.getCor());
        //JOptionPane.showMessageDialog("Modelo: "+ this.getModelo());
        //JOptionPane.showMessageDialog("Marca: "+ this.getMarca());
        //JOptionPane.showMessageDialog("Ano: "+ this.getAno());
        //JOptionPane.showMessageDialog("Cor: "+ this.getCor());
    }
    
    public void entraDados() {
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        setModelo(modelo);
        marca = JOptionPane.showInputDialog("Marca: ");
        setMarca(marca);
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        setAno(ano);
        String cor = JOptionPane.showInputDialog("cor: ");
        setCor(cor);
    }
    
    public static void main(String[] args) {
        Automotivo auto1;
        auto1 = new Automotivo();
        auto1.entraDados();
        auto1.provarExistencia();
    }
}
