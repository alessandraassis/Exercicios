import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);


        System.out.println( "Seja bem-vindo(a)!");
        System.out.println( "Quantas lojas serão cadastradas??  ");
        int n = sc.nextInt();
        sc.nextLine( );

        Shooping shooping = new Shooping( "Meu Shopping");

        for ( int i=1; i<=n; i++){
            System.out.print( "Arquivo da Loja " + i + ":" );
            String a = sc.nextLine();

            Loja loja = Loja.generateLoja(a);
            shooping.addLoja(loja);


        }
        while(true){
            System.out.print( "Escolha uma loja, ou digite \"0\" para encerrar: ");
            String nome = sc.nextLine( );

            if (nome.equals( "0")){
                break;

            }

            Loja loja = shooping.getLoja(nome);

            if(loja!= null){
                System.out.println( "Total de produtos = " + loja.getQuantidadeTotal());
                System.out.println( );
                System.out.println("Exibir detalhes  \"s\" ou \"n\" ??");
                String opcao = sc.nextLine();

                if(opcao.equalsIgnoreCase("s")){
                    loja.printInfo();
                }

            }
        }

        sc.close();



    }


}
