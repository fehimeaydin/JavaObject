package faydin.obj.Odev231218;

public class Soccer extends Odev {
	
		@Override
	    String getName() {
	        return "Soccer Class";
	    }
		
		@Override
		void getNumberOfTeamMembers() {
			
			System.out.println("Each team has 11 players in " + getName());
		}
	
}
