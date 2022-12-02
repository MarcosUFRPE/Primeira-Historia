import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner his=new Scanner(System.in);
        System.out.println("Era uma vez uma menina que andava tranquilamente em uma cidade,ao seu lado viu um prédio muito alto");
        System.out.println("O que ela pensou?: 1 subir no prédio ou 2 continuar andando");
        String resposta = his.nextLine();
        if (resposta.equals("1")){
            System.out.println("Subindo no prédio,Lin encontrou duas portas");
            System.out.println("1 ela abriu a porta da direita? ou 2:abriu a da esquerda?");
            String resp =his.nextLine();
            if (resp.equals("1")){
                System.out.println("Abrindo a porta da direita ela avistou no fundo da sala um anjo, que tinha o nome marquinhos.");
                System.out.println("Esse anjo apereceu na vida da Lin pra livra-lá de todo e qualquer mal");
                System.out.println("Esse anjo não pode descolar da Lin, porque agora tem uma parte de seu coração agregado ao dela, caso ela deixe-o");
                System.out.println("Ele morrerá.");
            }else{
                System.out.println("continuar andando e não entrar no prédio, não teria a proteção do anjo.");
            }
        }else{
            System.out.println("E assim seria um dia masi um dia triste e conturbado na vida de Lin.");
        }
       his.close();
    }
}
    
            
            