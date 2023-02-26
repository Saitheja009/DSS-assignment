package org.example.model;

public class Audio {
	private String nameoftheArtist;
	private String titleTrack;
	private String albumTitle;
	private int trackNumber;
	private int year;
	private int totalnumberOfReviews;
	private int totalnumberofcopiesSold;
	
	
	public Audio(String nameoftheArtist, String titleTrack, String albumTitle, int trackNumber, int year,
			int totalnumberOfReviews, int totalnumberofcopiesSold) {

		this.nameoftheArtist = nameoftheArtist;
		this.titleTrack = titleTrack;
		this.albumTitle = albumTitle;
		this.trackNumber = trackNumber;
		this.year = year;
		this.totalnumberOfReviews = totalnumberOfReviews;
		this.totalnumberofcopiesSold = totalnumberofcopiesSold;
	}
	public Audio() {
		
	}
	public String getNameoftheArtist() {
		return nameoftheArtist;
	}
	public void setNameoftheArtist(String nameoftheArtist) {
		this.nameoftheArtist = nameoftheArtist;
	}
	public String getTitleTrack() {
		return titleTrack;
	}
	public void setTitleTrack(String titleTrack) {
		this.titleTrack = titleTrack;
	}
	public String getAlbumTitle() {
		return albumTitle;
	}
	public void setAlbumTitle(String albumTitle) {
		this.albumTitle = albumTitle;
	}
	public int getTrackNumber() {
		return trackNumber;
	}
	public void setTrackNumber(int trackNumber) {
		this.trackNumber = trackNumber;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTotalnumberOfReviews() {
		return totalnumberOfReviews;
	}
	public void setTotalnumberOfReviews(int totalnumberOfReviews) {
		this.totalnumberOfReviews = totalnumberOfReviews;
	}
	public int getTotalnumberofcopiesSold() {
		return totalnumberofcopiesSold;
	}
	public void setTotalnumberofcopiesSold(int totalnumberofcopiesSold) {
		this.totalnumberofcopiesSold = totalnumberofcopiesSold;
	}
}