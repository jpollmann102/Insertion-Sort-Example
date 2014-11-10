
public class Movie2 {

	private String myTitle, myStudio;
	private int myYear;
	
	public Movie2(String title, int year, String studio){
		myTitle = title;
		myStudio = studio;
		myYear = year;
	}

	public String getMyTitle() {
		return myTitle;
	}

	public String getMyStudio() {
		return myStudio;
	}

	public int getMyYear() {
		return myYear;
	}
	
	public String toString(){
		return myTitle + ", " + myYear + ", " + myStudio;
	}
}
