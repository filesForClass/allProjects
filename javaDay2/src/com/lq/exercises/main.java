

public class main {
	
	
	// TODO Auto-generated method stub
	
	
	
	/* Exercise 1 
	
	String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	
	
	 for( int i = 0; i < daysOfWeek.length; i++) {
		System.out.println( daysOfWeek[i] );
	}
	
	 System.out.println("\nREVERSED:" );
	 
	for( int i = (daysOfWeek.length-1); i >= 0; i--) {
		System.out.println(daysOfWeek[i] );
	} 
	 
	*/
	
	 
	
	/* Exercise 2 
	 
	int i = 0;
	while(i <21) {
		i++;
		if (i%2 != 0) 
			continue;
			
		System.out.println( i );			
	}
	
	 */
	
	
	/* Exercise 3 
	
	for(int i = 1; i <= 100; i ++) {
		if (i >= 50 && i <= 60) 
			continue;
		
		System.out.println( i );
	} 
	
	*/
	
	/* Exercise 4 
	
	String[] months = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

	
	int i = 1;
	
	while(i <= 12) {
		
		System.out.print(months[i-1] + " has ");
		
		switch (i) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.print("31");
			break;
		case 2:
			System.out.print("28");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.print("30");
			break;
		}
		
		System.out.println(" days ");
		
		i++;
			
	} */
}
