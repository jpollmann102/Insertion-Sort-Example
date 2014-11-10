/*
 * Josh Pollmann
 * 11/9/14
 * This program uses insertion sorts to sort movies by title, year, and studio
 */
public class TestMovie2 {
	
	public static void printMovies(Movie2[] m){
		for(int i = 0; i < m.length; i++){
			System.out.println(m[i].toString());
		}
	}
	
	// 1 = ascending 2 = descending
	public static Movie2[] sortYears(Movie2[] movies, int order){ // This sort works fine :)
		if(order == 1){
			for(int i = 0; i < movies.length; i++){
				Movie2 next = movies[i];
				int e = i;
				int insertIndex = 0;
				while(e > 0 && insertIndex == 0){
					if(next.getMyYear() > movies[e - 1].getMyYear()){
						insertIndex = e;
					}else{
						movies[e] = movies[e - 1];
					}
					e--;
				}
				movies[insertIndex] = next;
			}
		}else if(order == 2){
			for(int i = 0; i < movies.length; i++){
				Movie2 next = movies[i];
				int e = i;
				int insertIndex = 0;
				while(e > 0 && insertIndex == 0){
					if(next.getMyYear() < movies[e - 1].getMyYear()){
						insertIndex = e;
					}else{
						movies[e] = movies[e - 1];
					}
					e--;
				}
				movies[insertIndex] = next;
			}
		}
		return movies;
	}
	
	// 1 = ascending 2 = descending
	public static Movie2[] sortTitles(Movie2[] movies, int order){ 
		if(order == 1){
			for(int i = 0; i < movies.length; i++){
				Movie2 next = movies[i];
				int e = i;
				int insertIndex = 0;
				while(e > 0 && insertIndex == 0){
					if(next.getMyTitle().compareTo(movies[e - 1].getMyTitle()) > 0){
						insertIndex = e;
					}else if(next.getMyTitle().compareTo(movies[e - 1].getMyTitle()) == 0){
						insertIndex = 0;
					}else{
						movies[e] = movies[e - 1];
					}
					e--;
				}
				movies[insertIndex] = next;
			}
		}else if(order == 2){
			for(int i = 0; i < movies.length; i++){
				Movie2 next = movies[i];
				int e = i;
				int insertIndex = 0;
				while(e > 0 && insertIndex == 0){
					if(next.getMyTitle().compareTo(movies[e - 1].getMyTitle()) < 0){
						insertIndex = e;
					}else if(next.getMyTitle().compareTo(movies[e - 1].getMyTitle()) == 0){
						insertIndex = 0;
					}else{
						movies[e] = movies[e - 1];
					}
					e--;
				}
				movies[insertIndex] = next;
			}
		}
		return movies;
	}
	
	// 1 = ascending 2 = descending
	public static Movie2[] sortStudios(Movie2[] movies, int order){
		if(order == 1){
			for(int i = 0; i < movies.length; i++){
				Movie2 next = movies[i];
				int e = i;
				int insertIndex = 0;
				while(e > 0 && insertIndex == 0){
					if(next.getMyStudio().compareTo(movies[e - 1].getMyStudio()) > 0){
						insertIndex = e;
					}else if(next.getMyStudio().compareTo(movies[e - 1].getMyStudio()) == 0){
						if(next.getMyTitle().compareTo(movies[e - 1].getMyTitle()) < 0){
							insertIndex = e;
						}else if(next.getMyTitle().compareTo(movies[e - 1].getMyTitle()) == 0){
							insertIndex = 0;
						}else{
							movies[e] = movies[e - 1];
						}
					}else{
						movies[e] = movies[e - 1];
					}
					e--;
				}
				movies[insertIndex] = next;
			}
		}else if(order == 2){
			for(int i = 0; i < movies.length; i++){
				Movie2 next = movies[i];
				int e = i;
				int insertIndex = 0;
				while(e > 0 && insertIndex == 0){
					if(next.getMyStudio().compareTo(movies[e - 1].getMyStudio()) < 0){
						insertIndex = e;
					}else if(next.getMyStudio().compareTo(movies[e - 1].getMyStudio()) == 0){
						if(next.getMyTitle().compareTo(movies[e - 1].getMyTitle()) > 0){
							insertIndex = e;
						}else if(next.getMyTitle().compareTo(movies[e - 1].getMyTitle()) == 0){
							insertIndex = 0;
						}else{
							movies[e] = movies[e - 1];
						}
					}else{
						movies[e] = movies[e - 1];
					}
					e--;
				}
				movies[insertIndex] = next;
			}
		}
		return movies;
	}
	
	public static void main(String[] args){
		Movie2[] myMovies = new Movie2[10];
		
		myMovies[0] = new Movie2("The Muppets Take Manhattan", 2001, "Columbia Tristar");
		myMovies[1] = new Movie2("Mulan Special Edition", 2004, "Disney");
		myMovies[2] = new Movie2("Shrek 2", 2004, "Dreamworks");
		myMovies[3] = new Movie2("The Incredibles", 2004, "Pixar");
		myMovies[4] = new Movie2("Nanny McPhee", 2006, "Universal");
		myMovies[5] = new Movie2("The Curse of the Were-Rabbit", 2006, "Aardman");
		myMovies[6] = new Movie2("Ice Age", 2002, "20th Century Fox");
		myMovies[7] = new Movie2("Lilo & Stitch", 2002, "Disney");
		myMovies[8] = new Movie2("Robots", 2005, "20th Century Fox");
		myMovies[9] = new Movie2("Monsters, Inc.", 2001, "Pixar");
		
		
		System.out.println("Before Sorting:");
		printMovies(myMovies);

		System.out.println();
		System.out.println("Sorted by Year - Ascending:");
		printMovies(sortYears(myMovies, 1));
		
		System.out.println();
		System.out.println("Sorted by Year - Descending:");
		printMovies(sortYears(myMovies, 2));
		
		System.out.println();
		System.out.println("Sorted by Title - Ascending:");
		printMovies(sortTitles(myMovies, 1));
		
		System.out.println();
		System.out.println("Sorted by Title - Descending:");
		printMovies(sortTitles(myMovies, 2));
		
		System.out.println();
		System.out.println("Sorted by Studio - Ascending:");
		printMovies(sortStudios(myMovies, 1));
		
		System.out.println();
		System.out.println("Sorted by Studio - Descending:");
		printMovies(sortStudios(myMovies, 2));

		
	}
}
