package vendedorclasse;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class VendedorClasse {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner leia = new Scanner(System.in);
        Vendedor vend[] = new Vendedor[9];
        
        lerDados(vend);
        
        System.out.println("Nome  Salário");
        for(int i=0; i<9; i++){
            System.out.println(vend[i].getNome() + "  " + vend[i].calcSalario());
        }
        
        char cat;
        System.out.println("Digite a categoria");
        cat = leia.next().charAt(0);
        double meta;
        System.out.println("Digite a meta");
        meta = leia.nextDouble();
        
    }

    public static void lerDados(Vendedor vend[]) throws FileNotFoundException {
        
        File arq = new File("dados.txt");
        Scanner leiaArq = new Scanner(arq);

        System.out.printf("%12s %12s %12s %12s\n", leiaArq.next(),
                leiaArq.next(), leiaArq.next(), leiaArq.next());
        for (int i = 0; i < 9; i++) {
            vend[i] = new Vendedor(leiaArq.next(), leiaArq.next().charAt(0),
                    leiaArq.nextDouble(), leiaArq.nextDouble());
            System.out.printf("%12s %12c %12.2f %12.2f\n",vend[i].getNome(),
                    vend[i].getCategoria(), vend[i].getSalarioBase(),
                    vend[i].getValorVendas());
        }

    }
    
    public static void exibirmeta(Vendedor vend[], char cat, double meta){
        if(cat =='g'){
            System.out.println("Gerente");
            
        }else{
            for(int i=0;i<9;i++){
                if(cat ==vend[i].getCategoria()){
                    if(vend[i].bateuMeta(meta)){
                        System.out.println(vend[i].getNome());
                    }
                }
            }
        }
    }

}
