package Panneau;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JPanel;

import Equipements.Objet;
import Personnages.Equipe;

public class MenuInventaireDetail extends JPanel {

	Equipe equipe = new Equipe();
	boolean menuOuvert = true;
	
	public MenuInventaireDetail(Equipe equipe) {
		this.equipe=equipe;
	}
	
	public void deroulementMenu(int selectPrecedent ) {
		
		Scanner sc = new Scanner(System.in);
		int selectPersoPrecedent = 0, selectObjetPrecedent = selectPrecedent, selectPersoActuel = 0;
		
		if (selectPrecedent > equipe.getListePersonnage().get(0).nombreObjetDansSac()-1) {
			selectPersoPrecedent = 1;
			selectObjetPrecedent = selectPrecedent - equipe.getListePersonnage().get(0).nombreObjetDansSac();
		}
		if(selectPrecedent > (equipe.getListePersonnage().get(0).nombreObjetDansSac() + equipe.getListePersonnage().get(1).nombreObjetDansSac() -1)) {
			selectPersoPrecedent = 2;
			selectObjetPrecedent = selectPrecedent - (equipe.getListePersonnage().get(0).nombreObjetDansSac() + equipe.getListePersonnage().get(1).nombreObjetDansSac());
		}
		
		while (menuOuvert == true) {
			
			this.affichageMenu(selectPersoActuel);
			switch (sc.nextLine().charAt(0)) {

				case 'v': menuOuvert = false;
						  Objet objet = equipe.getListePersonnage().get(selectPersoPrecedent).getSac()[selectObjetPrecedent];
						  equipe.getListePersonnage().get(selectPersoActuel).ajouterEquipement(objet);
						  equipe.getListePersonnage().get(selectPersoPrecedent).retirerEquipement(objet);
						  break;	
			
				case 'z': if (selectPersoActuel != 0) {
						  	selectPersoActuel--;
						  }
					      break;
	
				case 's': if (selectPersoActuel != equipe.getListePersonnage().size()-1) {
						  	selectPersoActuel++;
						  }
						  break;	
						  				  
				default:
			}
		} 
		
	}
	
	public void affichageMenu(int selectPerso) {
		
		String fleche = "";
		
		System.out.print("####################\n");
		for (int j=0; j<equipe.getListePersonnage().size(); j++) {
			
			if (selectPerso == j) { fleche = "->"; }
			else { fleche = "  "; };
			
			System.out.print("#   " +fleche+ "  " +equipe.getListePersonnage().get(j).getNom());
			for (int i=0; i<12-equipe.getListePersonnage().get(j).getNom().length(); i++) { System.out.print(" "); } 
			System.out.print("#\n");
		}
		System.out.print("####################\n");
		/*
		for (int i=0; i<(equipe.getListePersonnage().size()); i++) {
			
			if (select == i) { fleche = "->"; }
			else { fleche = "  "; };
			
			System.out.print("|                                                                                |\n"
							+"| " +fleche+ " " +equipe.getListePersonnage().get(i).toStringMenu());
			for (int j=0; j<76-equipe.getListePersonnage().get(i).toStringMenu().length(); j++) { System.out.print(" "); } 
			System.out.print("|\n"
							  +"|                                                                                |\n");	 		
		}		 		   
				 		   		   
		System.out.print("----------------------------------------------------------------------------------\n");
		for (int i=0; i<equipe.getListePersonnage().get(select).getSac().length; i++) {
			Objet objet = equipe.getListePersonnage().get(select).getSac()[i];
			try {
				System.out.print("| " +objet.getPresentationMenu());
				for (int j=0; j<79-objet.getPresentationMenu().length(); j++) { System.out.print(" "); } 
				System.out.print("|\n"
								+"|     Decription : " +objet.getDescription());
				for (int j=0; j<62-objet.getDescription().length(); j++) { System.out.print(" "); } 
				System.out.print("|\n");
			} catch (NullPointerException e) {
				
			}
		}
		System.out.println("----------------------------------------------------------------------------------\n");		   
		*/	 		   
	}

}
