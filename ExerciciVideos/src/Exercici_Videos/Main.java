package Exercici_Videos;

import java.net.URL;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Video video1 = new Video();
		video1.setTitle("Visita al zoo");
		video1.url = new URL("http://www.elsmeusvideos.com/user/visita_al_zoo");
		String tags = new String("zoo,animals,visita");
		video1.addTags(tags);
		
		Video video2 = new Video();
		video2.setTitle("Caigudes estúpides");
		video2.url = new URL("http://www.elsmeusvideos.com/user/caigudes_estupides");
		String tags2 = new String("humor,caigudes,bicicleta");
		video2.addTags(tags2);
		
		Video video3 = new Video();
		video3.setTitle("Concert d'any nou");
		video3.url = new URL("http://www.elsmeusvideos.com/user/concert_dany_nou");
		String tags3 = new String("música,concert,any nou");
		video3.addTags(tags3);
		
		Video video4 = new Video();
		video4.setTitle("Ciutat de París 2019: Uchimura vs Pietrov");
		video4.url = new URL("http://www.elsmeusvideos.com/user/ciutat_de_paris_2019_uchimura_vs_pietrov");
		String tags4 = new String("torneig,esports,judo");
		video4.addTags(tags4);
		
		User user1 = new User() ;
			user1.name = ("Víctor");
			user1.surname = ("Sauler");
			user1.setPassword("C0n7r4ss3ny4");
			user1.setRegDate(Date(2019, 01, 29));
			user1.addVideo(video1);
			user1.addVideo(video2);
			
			User user2 = new User() ;
			user2.name = ("Andreu");
			user2.surname = ("Montcunill");
			user2.setPassword("P4ssw0rd");
			user2.setRegDate(Date(2019, 02, 13));
			user2.addVideo(video3);
			user2.addVideo(video4);
	
				User[] User = {user1, user2};
				
			for (User u: User) {	
				
				for (Video v: u.getVideoList()) {
			
					System.out.println("L'usuari " + u.getName() + " ha publicat el video " 
							+ v.getTitle() + "." + " Etiquetes: " + v.getTags());
				}
			}
				
		}
	
	private static Date Date(int i, int j, int k) {
		
		return null;
	}

}