import javax.swing.JOptionPane;

    public class Main{

        public static void main (String[] args){

            int confirmação = JOptionPane.showConfirmDialog(null,"Bíblioteca Hive\nVocê deseja ver a lista de livros disponíveis?", "Deseja sair do programa?", JOptionPane.YES_NO_CANCEL_OPTION);

            if (confirmação == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "true");
            }
            else if (confirmação == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "cancelar");
            }
            else {
                JOptionPane.showMessageDialog(null, "false");
            }


        }
    }