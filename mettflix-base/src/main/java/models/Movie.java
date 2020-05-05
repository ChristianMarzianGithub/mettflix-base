package models;

public class Movie {
	
	private int Id;
	private String Name;
	private String Genre;
	private String Bewertung;
	
	public Movie(int id, String name, String genre, String bewertung) {
		this.setId(id);
		this.setName(name);
		this.setGenre(genre);
		this.setBewertung(bewertung);
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public String getBewertung() {
		return Bewertung;
	}

	public void setBewertung(String bewertung) {
		Bewertung = bewertung;
	}
}
