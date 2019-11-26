/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relatorio;
import java.awt.List;
import Model.Usuario;
import java.io.InputStream;
import java.util.ArrayList;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author luikt
 */
public class Relatorio {
    public void gerarRelatorio(ArrayList<Usuario> lista) throws JRException{
        InputStream fonte;
        fonte = Relatorio.class.getResourceAsStream("/report/relatorio.jrxml");
        JasperReport report = JasperCompileManager.compileReport(fonte);
        JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(lista));
        JasperViewer.viewReport(print, false); //fechar apenas a aplicacao, sem fechar a aplicacao
        
    }
}