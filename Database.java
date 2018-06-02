package dome;

import java.util.ArrayList;

public class Database {
	// 使用alt+/提示
	// 这里面放的是一个我们自己定义的类，记事本中只不过放的是String
//	private ArrayList<CD> listCD = new ArrayList<CD>();
//	private ArrayList<DVD> listDVD = new ArrayList<DVD>();
	private ArrayList<item> listitem =  new ArrayList<item>();
	
	
	
	//需要add函数，把cd加进去
//	public void add(CD cd)
//	{
//		listCD.add(cd);
//	}
//	
//	public void add(DVD dvd)
//	{
//		listDVD.add(dvd);
//	}

	public void add(item s)
	{
		listitem.add(s);
	}
	
	
	//需要列出所有的cd
	public void list()
	{
//		for (CD cd : listCD)
//		{
//			cd.print();
//		}
//		for (DVD dvd : listDVD)
//		{
//			dvd.print();
//		}
		for (item s : listitem) //多态， 声明类型 + 动态类型， 举例print，当他管理的是CD，则CD的piint，
		{
			s.print();	
			System.out.println("------------");
		}
	}
	
	
	public static void main(String[] args) {
		
		item items = new item("a", 0, true, "....");
//		CD cd = items; //Type mismatch: cannot convert from item to CD
		// 子类对象不能接收父类的对象，反之可以，
		CD cd = new CD("a", "a", 0, 0, "...");
		items = (item)cd; // 这里没毛病，让父类对象接收子类对象，可以的 
//		CD cc = (CD)items; //如果硬要这样做，可以前面加上(CD)   造型cast,不安全
		
		
		//注意java不能直接改变变量里面的内容，它是让s这个变量的管理者指向另外一个”bye”变量内容
//		String s = "hello";
//		s = "bye";
		
		Database db = new Database();
		db.add(new CD("abc", "abc", 4, 50, "..."));
		db.add(new CD("abd", "abd ", 5, 60, "..."));
		db.add(new DVD("xxx", "hahah ", 60, 5, "..."));
		
		db.list();

	}

}
