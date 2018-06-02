package dome;

//定义初始化
public class item {
	private String title;
	private int playingTime;
	private boolean gotIt = false;
	private String comment1;
//构造器
	public item(String title, int playingTime, boolean gotIt, String comment1) {
		super();
		this.title = title;
		this.playingTime = playingTime;
		this.gotIt = gotIt;
		this.comment1 = comment1;
	}  

	public void setTitle(String title)
	{
		this.title = title;
	}

	public item()
	{
		
	}


	public void print() 
	{
		System.out.println(title);
		
	}

}
