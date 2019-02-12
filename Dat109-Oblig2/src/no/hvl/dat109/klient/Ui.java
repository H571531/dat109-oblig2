/**
 * 
 */
package no.hvl.dat109.klient;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**
 * @author Adrian
 *
 */
public class Ui {

	public Ui() {
		
	}
	
	public List<String> setUpDeltakere(){
		boolean fornoyd=false;
		List<String> deltakere=new ArrayList<String>();
		String input="";
		int spillerT=1;
		JOptionPane.showMessageDialog(null, "Velkommen til terningspill!");
		do{
			input=JOptionPane.showInputDialog("Skriv inn navn for Spiller"+spillerT+" tom linje for ingen");
			if(input.equals("")) {
				fornoyd=true;
			}else {
				deltakere.add(input);
			}
			spillerT++;
		}while(!fornoyd);
		return deltakere;
	}
	
	public void visVinner(String vinner) {
		JOptionPane.showMessageDialog(null, vinner);
	}
	
	public boolean spilleIgjen() {
		boolean spille = false;
		//default icon, custom title
        int n = JOptionPane.showConfirmDialog(null,
            "Vil du spille igjen?",
            "Spille igjen?",
            JOptionPane.YES_NO_OPTION);

        if(n == JOptionPane.YES_OPTION){
            spille=false;
            System.out.println("Starter igjen");
        }else {
            System.out.println("Starter ikke");
            spille=true;
        }
        return spille;
		
	}
	
}
