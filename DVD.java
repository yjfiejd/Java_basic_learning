package dome;

public class DVD extends item {
	
	private String title;
	private String dirctor;;

	public DVD(String title, String dirctor, int playingTime, int actor, String comments) {
		super(title, playingTime, false, comments);
		this.title = title;
		setTitle("C");
		this.dirctor = dirctor;

	}

	public static void main(String[] args) {
		DVD dvd = new DVD("a", "b", 1, 1, "...");
		dvd.print();
	}

	public void print() {
		System.out.print("DVD:");
		super.print(); //调用父类的print01，采用super.print01() 函数
		System.out.println(dirctor);
		
	}

}
