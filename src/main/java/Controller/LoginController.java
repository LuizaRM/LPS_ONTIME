/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.LoginDao;
import model.Login;

/**
 *
 * @author Wellington
 */
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
