package Quetes;

import java.util.ArrayList;
import Cartes.Coord;
import Equipements.Equipement;
import Equipements.Objet;

public class PnjKaramel extends Pnj {

	public PnjKaramel() {
		
		pnj_nom = "Karamel";
		
		//pnj_coord = new Coord(8,9);
		
		pnj_objet = new Objet("L'armure l�gendaire");
		
		pnj_numero_quete_actuel = 0 ;
		
		pnj_dialogue_presentation = "Bonjour, moi c'est Karamel, j'ai entendu parler de toi. \n";
		
		pnj_dialogue_boucle_quete = "Est-ce que tu peux m'aider ?";
		
		pnj_dialogue_boucle_sans_quete = "Merci de nous avoir aid� mon fr�re et moi";
		
		liste_quetes = new ArrayList<Quete>();
		liste_quetes.add(new Quete("Qu�te 1 de Karamel", 
								   "Mon fr�re s'est fait attaqu� par des pillards, et lui ont vol� son bouclier. Ils se sont r�fugi�s dans un donjon au Sud du village. \n Je t'en prie, r�cup�re-le.",  
								   "Merci beaucoup. Il sera content de le r�cup�rer.",
								   new Objet("Le Bouclier de Perlin"),
								   "EXP +20", false));
		liste_quetes.add(new Quete("Qu�te 2 de Karamel", 
								   "Mon fr�re est parti dans le Donjon4 au Nord, mais il n'est pas revenu. \n Va t'assures qu'il va bien.", 
								   "Il va bien ? Dieu merci. \n Ce journal me sera utile.",
								   new Objet("Le journal d'indice"),
								   "EXP +20", false));
		liste_quetes.add(new Quete("Qu�te 3 de Karamel", 
								   "D'apr�s les indice du journal,le monstre qui a tu� nos parents se trouve dans le Donjon1 au Nord-Ouest du village. \n Tue le boss pour venger nos parents.", 
								   "Mes parents ont enfin �t� venger. \n Merci.",
								   new Objet("La t�te du boss1"),
								   "EXP +30", false));
		liste_quetes.add(new Quete("Qu�te 4 de Karamel", 
								   "J'aimerai d�corer la tombe de mes parents avec les roseaux de la r�gion. Ils poussent dans le Sud, au bord d'un lac. \n Ram�ne moi un bouquet.", 
								   "Les roseaux sont magnifiques, les tombes seront bien d�cor�es. \n Merci.",
								   new Objet("Un bouquet de roseaux"),
								   "EXP +10", false));
		liste_quetes.add(new Quete("Qu�te 5 de Karamel", 
								   "Malheur! Des monstres sont venus pour terrorriser le village pendant mon absence. Il sont originaires du Donjon2 dans le Nord. \n Elimine tous ces monstres. ",
								   "Incroyable ! Tu a r�ussi. Tu es vraiment tr�s fort.",
								   new Objet("La preuve du massacre"),
								   "EXP +30", false));
		
		liste_quetes.add(new Quete("Qu�te 6 de Karamel", 
				   				   "Il y avait autrefois une ancienne statue de la prosp�rit� au village, d�sormais dans le donjon11 au Sud. \n Retrouve-la pour nous la rendre. ",
				   				   "Le village vit d�sormais en paix. \n Merci.",
				   				   new Objet("L'ancienne statue de la prosp�rit�"),
				   				   "EXP +20", false));
		
	}	

}