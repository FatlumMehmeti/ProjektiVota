package projektiVotat;
import javax.swing.JOptionPane;
import java.lang.*;
public class Zgjedhjet {
	public static void main(String []args)
	{           /**Kerkon nga Kandidati 1 te shtyp emrin dhe adsresen  e tij.*/
			String emri_1=JOptionPane.showInputDialog("Kandidati 1:\n  Shkruani Emrin  tuaj::");
			String adresa_1=JOptionPane.showInputDialog("Kandidati 1:\n Shkruani  adresen tuaj:");
			  /**Kerkon nga Kandidati 2 te shtyp emrin dhe adsresen*/
			String emri_2=JOptionPane.showInputDialog("Kandidati 2:\n  Shkruani Emrin  tuaj:");
			String adresa_2=JOptionPane.showInputDialog("Kandidati 2:\n Shkruani  adresen tuaj:");
	 
	/**Keskesat per shtypjen e votave ku me 1 votojm Kandidatin 1 ndersa me 2 Kandidatin 2 e tij. */
			int votuesi_1 = Integer.valueOf(JOptionPane.showInputDialog
         ("Shtypni 1 nese doni te votoni Kadidatin 1:\""+emri_1+"\" ose  shtypni 2 nese doni te votoni Kadidatin 2:\""+emri_2+"\""));
			int votuesi_2 = Integer.valueOf(JOptionPane.showInputDialog
					("Shtypni 1 nese doni te votoni Kadidatin 1:\""+emri_1+"\" ose  shtypni 2 nese doni te votoni Kadidatin 2:\""+emri_2+"\""));
			int votuesi_3 = Integer.valueOf(JOptionPane.showInputDialog
					("Shtypni 1 nese doni te votoni Kadidatin 1:\""+emri_1+"\" ose  shtypni 2 nese doni te votoni Kadidatin 2:\""+emri_2+"\""));
			int votuesi_4 = Integer.valueOf(JOptionPane.showInputDialog
					("Shtypni 1 nese doni te votoni Kadidatin 1:\""+emri_1+"\" ose  shtypni 2 nese doni te votoni Kadidatin 2:\""+emri_2+"\""));
			int votuesi_5 = Integer.valueOf(JOptionPane.showInputDialog
					("Shtypni 1 nese doni te votoni Kadidatin 1:\""+emri_1+"\" ose  shtypni 2 nese doni te votoni Kadidatin 2:\""+emri_2+"\""));
			Votat voto=new Votat();
			/**Behet llogaritja e votave per kandidatin 1 dhe 2.*/
			voto.numeroVota(votuesi_1);
			voto.numeroVota(votuesi_2);
			voto.numeroVota(votuesi_3);
			voto.numeroVota(votuesi_4);
			voto.numeroVota(votuesi_5);
		/*Behet shfaqja e emrave dhe adresave te kandidateve 1 dhe 2 dhe totali i votave ne nje dritare grafike.*/
			voto.kandidati_1(emri_1,adresa_1);
			voto.kandidati_2(emri_2,adresa_2);		
	}
}

