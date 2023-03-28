package projektiVotat;

import java.awt.*;import javax.swing.*;
/** Krijon nje dritare garfike dhe shfaq te dhenat per 2 kandidat dhe bene ngjehjen e votave te tyre.*/
public class Votat extends JPanel{
	
		private String emri_1,adresa_1,emri_2,adresa_2 ; //mban fjalite qe do te shfaqen
 		private int votat_per_1,votat_per_2,vota_me_gabime; //mban numrin e votave qe do te shfaqen
 		public Votat(){
 			JFrame frame=new JFrame();
 			frame.getContentPane().add(this);
 			frame.setTitle("Zgjedhjet");             // krijon nje dritare grafike  
 			frame.setSize(500,300);
 			frame.setVisible(true);
	  }
 		public void paintComponent(Graphics g){  
 			g.setColor(Color.white);
 			g.fillRect(0,0,500,300);              //ngjyros dritaren grafike dhe perdor metoden private kandidatet 
 			kandidatet(g);
 		}
 		public void kandidati_1 (String e_1,String a_1){ 
 			emri_1 = e_1;
 			adresa_1 = a_1;                 // mer te dhenat per kandidatin 1 
 			this.repaint(); 
 		}
 		public void kandidati_2(String e_2,String a_2){
 			emri_2 = e_2;
 			adresa_2= a_2;         // mer te dhenat per kandidatin 2
 			this.repaint(); 
 		}
 		public int numeroVota(int a) {
 			if(a==1) {votat_per_1+=a;             // ngjeh votat per kandidatin 1
 			return votat_per_1;}
 			else if(a==2) {votat_per_2+=(a/2);      // ngjeh votat per kandidatin 2
 			return votat_per_2;}
 		
 			else {	vota_me_gabime=a;                          // shfaqe votat jovalide 
				System.out.print("Vlera "+vota_me_gabime+" qe keni shtypur per te  votuar eshte vote e pavolitshme. \n");
 				}
 			return a;
 		}
 		private void kandidatet(Graphics p) {	
           //shafqe te dhenat per kandidatin 1 dhe 2 si dhe numrin total te votave  te tyre 
 			p.setColor(Color.black);         
 			p.drawString("Kandidati 1 ka emrin \""+emri_1+"\" dhe ka adresen \""+adresa_1+"\" dhe ka kaq vota "+votat_per_1,10, 50);
 			p.drawString("Kandidati 2 ka emrin \""+emri_2+"\" dhe ka adresen \""+adresa_2+"\" dhe ka kaq vota "+votat_per_2, 10, 80);
 		}
	}
