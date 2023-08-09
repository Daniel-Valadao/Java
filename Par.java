import javax.swing.JOptionPane;
public class Par {
    public static void main(String args[]){
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Entre com um número inteiro"));
        if(num%2==0){
            JOptionPane.showMessageDialog(null ,"O número :"+num+ "é par");
        }
        else{
            JOptionPane.showMessageDialog(null,("O número :"+num+ "Não é par"));
            }
        

    }
    
}
