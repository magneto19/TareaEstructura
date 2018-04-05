package tareaestructura;

import javax.swing.JOptionPane;

/**
 * @author Johan Sebastian Lasso Rivas
 */
public class TareaEstructura{

    public static void main(String[] args) {
        
        int x=0;
        int opcion;
        
        do{
           opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite su opcion: \n 1-PAISES \n 2-CAPITALES \n 3-CONTINENTE \n 4-SALIR"));
           String paisesMatriz[][] = {{"Afganistan","Colombia","Alemania","Camerun","Canada"},{"Kabul","Bogotá","Berlín","Yaundé","Ottawa"},{"Asia","América","Europa","África","Ameríca"}};
           switch(opcion){
               case 1:
                   for(int i=0;i<=4;i++){
                     
                    JOptionPane.showMessageDialog(null, "Pais "+paisesMatriz[0][i]);
                   }
                break;
                
                case 2:
                    for(int i=0;i<=4;i++){
                     
                    JOptionPane.showMessageDialog(null, "Capital "+paisesMatriz[1][i]);
                   } 
                break;
                
                case 3:
                    for(int i=0;i<=4;i++){
                     
                    JOptionPane.showMessageDialog(null, "Continente "+paisesMatriz[2][i]);
                   }                   
                break;
                
                case 4:             
                    JOptionPane.showMessageDialog(null, "Ha seleccionado salir");
                    x=1;
                break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Esta opccion no existe"); 
               
           }

        }while(x==0);
    }
    
}
