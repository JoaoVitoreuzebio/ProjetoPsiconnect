
package a3_projeto;


public class A3_projeto {


    public static void main(String[] args) {
        System.out.println("Olá mundo!!!!");
        
        tela_login loginJanela = new tela_login();
        loginJanela.setVisible(true);
        DB db = new DB("login.db");
        
        db.query("SELECT * FROM cadastro");
        while(db.next()){
            int id = db.getInt("id");
            String nome = db.getString("nome");
            System.out.println("ID: "+ id + "NOME: "+ nome);
        }
        db.closeConnection();
    }
    
}