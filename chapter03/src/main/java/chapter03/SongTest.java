package chapter03;

public class SongTest {

	public static void main(String[] args) {
		Song song = new Song();
		song.setTitle("좋은날");
		song.setArtist("아이유");
		song.setAlbum("real");
		song.setCompser("이민수");
		song.setYear(2010);
		song.setTrack(3);
		
		song.show();
		Song song2 = new Song("안녕", "buzz", "les", "als", 123, 123);
		song2.show();
		
		Song song3 = new Song("사건의 지평선", "윤하");
		song3.show();
	}
	
	

}
