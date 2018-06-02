import java.util.ArrayList;
import java.util.HashSet;

public class Notebook_new {
	
	//建立一个容器
	private ArrayList<String> notes = new ArrayList<String>();
	
	//建立增加句子接口
	public void add(int location, String s)
	{
		notes.add(location, s);
	}
	
	//获取大小接口
	public int getSize()
	{
		return notes.size();
	}
	
	//获取具体某条文本接口
	public String getNote(int index)
	{
		return notes.get(index);
	}
	
	//获取删除某一条的接口
	public void removeNote(int index)
	{
		notes.remove(index);
	}
	
	//获取所有的string接口
	public String[] list()
	{
//		String[] a = new String[notes.size()];
//		for (int i=0; i<=notes.size(); i++) //z这里不应该有这个等于号的，错误❌
//		{
//			a[i] = notes.get(i);
//		}
//		return a;
		
		String[] a = new String[notes.size()];
		for (int i = 0; i<notes.size(); i++)
		{
			a[i] = notes.get(i);
		}
		return a;
	}
	
	// 开始运行主程序了
	public static void main(String[] args) {
		Notebook_new nb = new Notebook_new();
		nb.add(0, "first");
		nb.add(1, "second");
		nb.add(0, "third");
		System.out.println(nb.getSize());
		System.out.println(nb.getNote(0));
		System.out.println(nb.getNote(1));
		System.out.println(nb.getNote(2));
		//删除一个输入
		nb.removeNote(1);
		System.out.println(nb.getSize());
//		nb.add(1, "i am new second");
		//打印所有的输入的字符
		String[] a = nb.list();
		for (String s : a)
		{
			System.out.println(s);
		}
		
		System.out.println("----------------");
		
		HashSet<String> s = new HashSet<String>();
		s.add("first");
		s.add("Second");
		s.add("first");
		for (String k : s)
		{
			System.out.println(k);
		}
		System.out.println("----------------");
		System.out.println(s); //也可以直接输出

		
	}

}
