package dome;

public class CD extends item {
	private String artist;
	private int numofTracks;

	
	// 点击source中的generate constructor using field 
	public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
		super(title, playingTime, false, comment); // 调用父类的item的构造器
		this.artist = artist;
		this.numofTracks = numofTracks;

	}  

	public static void main(String[] args) { 
		CD cd = new CD("a", "b", 2, 2, "...");
		cd.print();
	}
	
	public void print()
	{
		System.out.print("CD:");
		super.print();
		
	}

	

}
