import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    String nome;
    ArrayList<Produto> produtos;
    ArrayList<Integer> quantidades;


    public Loja( String nome){
        this.nome = nome;
        produtos = new ArrayList<>();
        quantidades = new ArrayList<>();

    }
    public void addProduto( Produto produto, int quantidade){
        produtos.add(produto);
        quantidades.add(quantidade);

    }
    int getQuantidadeTotal(){
        int total = 0;

        for ( int i=0; i<quantidades.size(); i++){
             total += quantidades.get(i);
        }
        return total;
    }
    static Loja generateLoja(String filename) throws Exception {

        File file = new File(filename);
        Scanner sc = new Scanner(file);

        String nomeLoja = sc.nextLine();
        Loja loja = new Loja(nomeLoja);

        while (sc.hasNextLine()) {

            String linha = sc.nextLine();
            String[] partes = linha.split(";");

            String nomeProduto = partes[0].trim();
            float preco = Float.parseFloat(partes[1].trim());
            int quantidade = Integer.parseInt(partes[2].trim());

            Produto p = new Produto(preco, nomeProduto);
            loja.addProduto(p, quantidade);
        }

        sc.close();
        return loja;
    }

    void printInfo() {
        for (int i = 0; i < produtos.size(); i++) {
            produtos.get(i).printInfo();


        }

    }


}