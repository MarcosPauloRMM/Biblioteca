package bd;
import java.util.ArrayList;


/**
 *
 * @author User
 */
public class BdLivro {

    //Array List
    private static ArrayList<Livro> dados;
    public static ArrayList<Livro> getLivro(){
            if(dados == null){
                dados = new ArrayList<>();
                dados.add(new Livro("Dracúla", "Bran Stoker", 2017, 606 ,"9788537816496"));
            }
            return dados;
    }
    //metodo para inserir livro
    public static void  addLivro(Livro dado){
        dados.add(dado);
    }
    //metodo para alterar livro
    public static void updateLivro(int index, Livro dado){
        dados.set(index, dado);
    }
    //metodo para remover contato
    public static void remove(int index){
        dados.remove(index);
        
    } 
}
