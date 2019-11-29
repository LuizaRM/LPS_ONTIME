
package controller;

import Dao.LoginDao;
import model.Login;


public class LoginController {
  
    public LoginController(){        
    }
    
    public void login(String email, String senha){
      
        //Instanciando e setando o modelo
        Login login = new Login();
        login.setEmail(email);
        login.setSenha(senha);
        
        //Instanciando e setando o DAO
        LoginDao loginDao = new LoginDao();
        loginDao.login(login);
    }
    
}
