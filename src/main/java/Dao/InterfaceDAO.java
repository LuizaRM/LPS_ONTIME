
package dao;

import java.util.ArrayList;


public interface InterfaceDAO {
    
    public void adicionar(Object obj);
    public void excluir(Object obj);
    public void alterar(Object obj);
    public ArrayList<Object> consultar(Object obj);
   
}
