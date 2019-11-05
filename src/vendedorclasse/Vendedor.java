package vendedorclasse;

public class Vendedor {
    private String nome;
    private char categoria;
    private double salarioBase;
    private double valorVendas;

    public Vendedor(){
        
    }
    
    public Vendedor(String nome, char categoria, double salarioBase, double valorVendas) {
        this.nome = nome;
        this.categoria = categoria;
        this.salarioBase = salarioBase;
        this.valorVendas = valorVendas;
    }
    
    public boolean bateuMeta(double meta){
        if(valorVendas >= meta){
            return true;
        }else{
            return false;
        }
    }
    
    public double calcSalario(){
        if(categoria == 'g'){
            return salarioBase;
        }else if(categoria == 'b'){
            return salarioBase + 0.05 * valorVendas;
        }else{
            return salarioBase + 0.07 * valorVendas;
        }
    }
    
    
    public String getNome() {
        return nome;
    }

    public char getCategoria() {
        return categoria;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getValorVendas() {
        return valorVendas;
    }
    
    
}