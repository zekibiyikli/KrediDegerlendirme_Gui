package krediDegerlendirmeGui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Main {
	static JFrame frame;
	static JPanel panel;
	static JLabel borclabel,gelirlabel,egitimlabel,evetlabel,hayýrlabel;
	static JButton sendbtn;
	static double evetvalue,hayýrvalue;
	static ButtonGroup birAradaTut1,birAradaTut2,birAradaTut3;
	static JRadioButton borcrb1,borcrb2,egitimrb1,egitimrb2,egitimrb3,egitimrb4,gelirrb1,gelirrb2,gelirrb3; 
	static JPanel panelimiz1,panelimiz2,panelimiz3,panelimiz4;
	
	public static String[][] degerlendirme=Egitim.veri();
	
	public static String inGelir,inEgitim,inBorc;
	
	public static double[][] degerler= {
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
			{0,0,0,0,0},
	};
	
	public static class RadioButtonClass extends JFrame{
		
		public RadioButtonClass(){

		this.setBounds(400, 200, 500, 300);

		getContentPane().setLayout(null);
		
		panelimiz1=new JPanel();
		panelimiz2=new JPanel();
		panelimiz3=new JPanel();
		panelimiz4=new JPanel();
		
		panelimiz1.setBounds(10, 10, 400, 30);
		panelimiz2.setBounds(10, 40, 400, 30);
		panelimiz3.setBounds(10, 70, 400, 30);
		panelimiz4.setBounds(10, 150, 100, 200);

		birAradaTut1=new ButtonGroup();
		birAradaTut2=new ButtonGroup();
		birAradaTut3=new ButtonGroup();
		
		borclabel=new JLabel("Borc: ");
		borclabel.setSize(75,50);
		borclabel.setLocation(200,10);
		panelimiz1.add(borclabel);
		
		gelirlabel=new JLabel("Eðitim: ");
		gelirlabel.setSize(75,50);
		gelirlabel.setLocation(800,250);
		panelimiz2.add(gelirlabel);
		
		egitimlabel=new JLabel("Gelir: ");
		egitimlabel.setSize(75,50);
		egitimlabel.setLocation(800,250);
		panelimiz3.add(egitimlabel);

		borcrb1=new JRadioButton("Düþük");
		panelimiz1.add(borcrb1);
		birAradaTut1.add(borcrb1);

		borcrb2=new JRadioButton("Yüksek");
		panelimiz1.add(borcrb2);
		birAradaTut1.add(borcrb2);

		egitimrb1=new JRadioButton("Ýlk");
		panelimiz2.add(egitimrb1);
		birAradaTut2.add(egitimrb1);
		
		egitimrb2=new JRadioButton("Orta");
		panelimiz2.add(egitimrb2);
		birAradaTut2.add(egitimrb2);
		
		egitimrb3=new JRadioButton("Lise");
		panelimiz2.add(egitimrb3);
		birAradaTut2.add(egitimrb3);
		
		egitimrb4=new JRadioButton("Üniversite");
		panelimiz2.add(egitimrb4);
		birAradaTut2.add(egitimrb4);

		gelirrb1=new JRadioButton("Düþük");
		panelimiz3.add(gelirrb1);
		birAradaTut3.add(gelirrb1);
		
		gelirrb2=new JRadioButton("Orta");
		panelimiz3.add(gelirrb2);
		birAradaTut3.add(gelirrb2);
		
		gelirrb3=new JRadioButton("Yüksek");
		panelimiz3.add(gelirrb3);
		birAradaTut3.add(gelirrb3);
		
		sendbtn=new JButton("Gönder");
		sendbtn.setSize(50, 50);
		sendbtn.setLocation(810,160);
		sendbtn.addActionListener(new Action());
		panelimiz4.add(sendbtn);
		
		evetlabel=new JLabel("Evet: "+evetvalue);
		evetlabel.setSize(75,50);
		evetlabel.setLocation(200,10);
		panelimiz4.add(evetlabel);
		
		hayýrlabel=new JLabel("Hayýr: "+hayýrvalue);
		hayýrlabel.setSize(75,50);
		hayýrlabel.setLocation(200,10);
		panelimiz4.add(hayýrlabel);
		
		this.add(panelimiz1);
		this.add(panelimiz2);
		this.add(panelimiz3);
		this.add(panelimiz4);
		
		for(int i=0;i<degerler.length;i++) {
			for(int j=0;j<degerler[0].length;j++) {
				degerler[i][j]=0;
			}
		}

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

		  }}

		public static void main(String[] args) {

			RadioButtonClass obj=new RadioButtonClass();
					
		  }
		
		static class Action implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==sendbtn){
					if(borcrb1.isSelected()) {
						inBorc="düþük";
					}
					if(borcrb2.isSelected()) {
						inBorc="yüksek";
					}
					if(egitimrb1.isSelected()) {
						inEgitim="ilk";
					}
					if(egitimrb2.isSelected()) {
						inEgitim="orta";
					}
					if(egitimrb3.isSelected()) {
						inEgitim="lise";
					}
					if(egitimrb4.isSelected()) {
						inEgitim="üniversite";
					}
					if(gelirrb1.isSelected()) {
						inGelir="düþük";
					}
					if(gelirrb2.isSelected()) {
						inGelir="orta";
					}
					if(gelirrb3.isSelected()) {
						inGelir="yüksek";
					}
					
					KrediSonuc(inBorc,inEgitim,inGelir);
				}
				
			}
			}
		
		public static void KrediSonuc(String borc,String egitim, String gelir) {
			
			for(int i=1;i<degerlendirme.length;i++) {
				if(degerlendirme[i][0].equals(borc)) {
					degerler[0][0]++;
					if(degerlendirme[i][3]=="evet") {
						degerler[0][1]++;

					}
					else if(degerlendirme[i][3]=="hayýr") {
						degerler[0][2]++;

					}
				}
				
				if(degerlendirme[i][1].equals(egitim)) {
					degerler[1][0]++;
					if(degerlendirme[i][3]=="evet") {
						degerler[1][1]++;

					}
					else if(degerlendirme[i][3]=="hayýr") {
						degerler[1][2]++;

					}
				}
				
				if(degerlendirme[i][2].equals(gelir)) {
					degerler[2][0]++;
					if(degerlendirme[i][3]=="evet") {
						degerler[2][1]++;

					}
					else if(degerlendirme[i][3]=="hayýr") {
						degerler[2][2]++;

					}
				}
				
				if(degerlendirme[i][1].equals(egitim) && degerlendirme[i][0].equals(borc)) {
					degerler[3][0]++;
					if(degerlendirme[i][3]=="evet") {
						degerler[3][1]++;

					}
					else if(degerlendirme[i][3]=="hayýr") {
						degerler[3][2]++;

					}
				}
				
				if(degerlendirme[i][2].equals(gelir) && degerlendirme[i][0].equals(borc)) {
					degerler[4][0]++;
					if(degerlendirme[i][3]=="evet") {
						degerler[4][1]++;

					}
					else if(degerlendirme[i][3]=="hayýr") {
						degerler[4][2]++;

					}
				}
				
				if(degerlendirme[i][2].equals(gelir) && degerlendirme[i][1].equals(egitim)) {
					degerler[5][0]++;
					if(degerlendirme[i][3]=="evet") {
						degerler[5][1]++;

					}
					else if(degerlendirme[i][3]=="hayýr") {
						degerler[5][2]++;

					}
				}
				
				if(degerlendirme[i][2].equals(gelir) && degerlendirme[i][1].equals(egitim) && degerlendirme[i][0].equals(borc)) {
					degerler[6][0]++;
					if(degerlendirme[i][3]=="evet") {
						degerler[6][1]++;
					}
					else if(degerlendirme[i][3]=="hayýr") {
						degerler[6][2]++;

					}
				}
			}
			Sonuc();
			
		}
		
		public static void  Sonuc() {
			
			double bestevet=0,besthayýr=0;
						
			for(int i=0;i<degerler.length;i++) {
				if(degerler[i][0]!=0) {
					degerler[i][3]=((degerler[i][1]/degerler[i][0])*100);
					degerler[i][4]=(degerler[i][2]/degerler[i][0])*100;
					System.out.println(degerler[i][0]+"-"+degerler[i][1]+"-"+degerler[i][2]+"-"+degerler[i][3]+"-"+degerler[i][4]);
						if(degerler[i][3]>bestevet || degerler[i][4]>bestevet) {
							bestevet=degerler[i][3];
							besthayýr=degerler[i][4];
						}
				}
			}
			
			if(bestevet==0) {
				evetvalue=bestevet;
				hayýrvalue=100;
			}else {
				
				evetvalue=bestevet;
				hayýrvalue=besthayýr;
			}
			RadioButtonClass obj=new RadioButtonClass();
			
		}
	

	}


