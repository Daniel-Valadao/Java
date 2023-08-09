import javax.swing.JOptionPane;

public class EstruturaCondicional {
    public static void main(String args[]){
        int nota1 , nota2,Media;
        nota1=Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira nota"));
        nota2=Integer.parseInt(JOptionPane.showInputDialog("Digite a Segunda nota"));
        Media= (nota1+nota2)/2;
        if(Media>=6){
        JOptionPane.showMessageDialog(null,"Aprovado"+Media);
        }
        else{
            JOptionPane.showMessageDialog(null,"Reprovado"+Media);
        }
    }
}
