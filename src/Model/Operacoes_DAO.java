package Model;

import javax.swing.JOptionPane;

public class Operacoes_DAO {
  
    public static String x = "";
    public static Double v1 = 0.0;
    public static Double v2 = 0.0;
    
    
    public static void somar(){
    
        x = View.Inicio_GUI.valor1_txt.getText();
        v1 = Double.parseDouble(x);
        
        x = View.Inicio_GUI.valor2_txt.getText();
        v2 = Double.parseDouble(x);
        
        View.Inicio_GUI.resultado_txt.setText("O resultado da soma é "+(v1+v2));
    }
    
        public static void subtrair(){
    
        x = View.Inicio_GUI.valor1_txt.getText();
        v1 = Double.parseDouble(x);
        
        x = View.Inicio_GUI.valor2_txt.getText();
        v2 = Double.parseDouble(x);
        
        View.Inicio_GUI.resultado_txt.setText("O resultado da subtração é "+(v1-v2));
    }
        
        public static void multiplicar(){
    
        x = View.Inicio_GUI.valor1_txt.getText();
        v1 = Double.parseDouble(x);
        
        x = View.Inicio_GUI.valor2_txt.getText();
        v2 = Double.parseDouble(x);
        
        View.Inicio_GUI.resultado_txt.setText("O resultado da multiplicação é "+(v1*v2));
    }
        
        public static void dividir(){
    
        x = View.Inicio_GUI.valor1_txt.getText();
        v1 = Double.parseDouble(x);
        
        x = View.Inicio_GUI.valor2_txt.getText();
        v2 = Double.parseDouble(x);
        
        Double divisao = 0.0;
        
            if (v2 != 0) {
                divisao = v1/v2;
            }else{
                JOptionPane.showMessageDialog(null, "Não é possivel realizar divisão por 0.");
            }
        
        View.Inicio_GUI.resultado_txt.setText("O resultado da divisão é "+ divisao);
    }
        
    public static void limpar(){
    
        View.Inicio_GUI.valor1_txt.setText("");
        View.Inicio_GUI.valor2_txt.setText("");
        View.Inicio_GUI.resultado_txt.setText("");
        
    }
}
