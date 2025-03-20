public class Student{
	private String id;
	private String name;
	private int age;
	private float score ;
	
	public Student()
	{
		this.id ="default"	;
		this.name ="default";
		this.age =0;
		this.score =0;
	}
	public Student(String id, String name, int age, float score)
	{
		this.id = id ;
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	public void setID(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		if (age > 0 && age <= 100)
		{
			this.age = age;
		} else {System.out.println("年齡必須介於0至100之間");}
		
	}
	public int getAge()
	{
		return age;
	}

	public void setScore(float score)
	{
		this.score = score;
	}
	public float getScore()
	{
		return score;
	}

	public void display()
	{
		System.out.println("編號為 "+getId()+"的小貓咪叫做"+getName()+"，小貓的年紀大概是"+getAge()+"歲，在收容所的乖小貓評分為"+getScore()+"分");
	}
	
}