public class Produto {

     private String nome;
     private Float preco;

     public Produto(float preco, String nome){
         this.nome = nome;
         this.preco = preco;

     }

     public void printInfo( ){
         System.out.println( nome +  " -> R$" +  preco);

     }


}
