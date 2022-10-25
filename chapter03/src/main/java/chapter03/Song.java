package chapter03;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String compser;
	private int year;
	private int track;

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getCompser() {
		return compser;
	}

	public void setCompser(String compser) {
		this.compser = compser;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	public String getTitle() {
		return title;
	}


	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", compser=" + compser + ", year="
				+ year + ", track=" + track + "]";
	}

	public void show() {
		System.out.println(artist  + " " +
						   title   + " ( " +
						   album   + ", " +
						   year    + ", " +
						   track   + "번 track, " +
						   compser + " 작곡 )");
	}
	
}
