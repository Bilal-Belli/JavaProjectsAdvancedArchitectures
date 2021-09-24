import java.util.Date;
public class Achat {
	private Album album;
	private Date dateAchat;
	public Achat(Album album, Date dateAchat) {
		super();
		this.album = album;
		this.dateAchat = dateAchat;
	}
	public Album getAlbum() {
		return album;
	}
	public void setAlbum(Album album) {
		this.album = album;
	}
	public Date getDateAchat() {
		return dateAchat;
	}
	public void setDateAchat(Date dateAchat) {
		this.dateAchat = dateAchat;
	} 
	
	
}
