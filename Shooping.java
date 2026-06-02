import java.util.ArrayList;

public class Shooping {

   private String nome;
   ArrayList<Loja> lojas;

   Shooping( String nome){
       this.nome = nome;
       lojas= new ArrayList< >();

   }

    void addLoja(Loja loja){
       lojas.add(loja);

    }

    Loja getLoja(String nomeLoja) {
        for ( int i = 0; i < lojas.size(); i++) {
            if ( lojas.get(i).nome.equalsIgnoreCase (nomeLoja ) ) {
                return lojas.get(i);
            }
        }
        return null;
    }


}
