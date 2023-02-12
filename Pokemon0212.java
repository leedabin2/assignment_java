package edu.pokemon;

import java.util.Scanner;

class Pokemon
{
	protected int count = 0;
	protected int idx = 0;
	protected int menu = 0;
	protected int pokemon = 0;
	protected int attack_menu = 0;
    protected String owner = null;
    protected String skills = null;
    
  
    public Pokemon()
    {
    	owner = null;
    	skills = null;
    	count++;
    }
    
    public Pokemon(int count,int menu,int pokemon,String owner,String skills,int attack_menu)
    {	
    	super();
    	this.count = count;
    	this.menu = menu;
    	this.pokemon = pokemon;
        this.owner = owner;
        this.skills = skills;
        this.attack_menu = attack_menu;
      
    }
    public void setowner(String owner)
    {
    	this.owner = owner;
    } 
    public String getowner()
    {
    	return owner;
    }
    public void setskills(String skills)
    {
    	this.skills = skills;
    } 
    public String getskills()
    {
    	return skills;
    }
    public void setcount(int count)
    {
    	this.count = count;
    }
    public int getcount()
    {
    	return count = count + 1;
    }
    public void info()
    {
        System.out.printf("%s의 포켓몬이 사용 가능한 스킬",this.owner);
        String[] arr = skills.split("/");
        for (int i = 0; i <= skills.length(); i++)
        {	
        	System.out.printf("%d+1",i);
        	System.out.printf("%d+1 : %s",i,arr[i]);
        }
    }

    public void attack()
    {
    }
    public void attack(int idx)
    {
    	System.out.printf("skills[%d] 공격 시전!",idx);
    	System.out.printf("총 %d 마리의 포켓몬이 생성되었습니다",count );
    }
    public void show()
    {
    	System.out.printf("포켓몬 생성 : %s",owner);
    }
 
   
}
class Pikachu extends Pokemon
{
	private String name = null;
	private int attack_menu = 0;
	
	public Pikachu()
	{
		super();
		
	}
	public Pikachu(int count,int menu,int pokemon,String owner,String skills,String name,int attack_menu)
	{
		super(count,menu,pokemon,owner,skills,attack_menu);
		this.name = name;
		this.attack_menu = attack_menu;
		System.out.printf(this.name);
		
	}
	public void attack(int idx)
	{
		super.attack(idx);
		String[] arr = skills.split("/");
		System.out.printf("[삐까삐까] %s의 %s가 %s 공격 시전!",owner,name,arr[idx]);
	}
	 public void setname(String name)
    {
	 	this.name = name;
    }
    public String getname()
    {
    	System.out.printf("포켓몬 생성 : %s",this.name);
    	return name;
    }
    public void info()
    {
        System.out.printf("%s의 포켓몬이 사용 가능한 스킬",this.owner);
        String[] arr = skills.split("/");
        for (int i = 0; i <= skills.length(); i++)
        {	
        	System.out.printf("%d+1",i);
        	System.out.printf("%d+1 : %s",i,arr[i]);
        }
    }
    public void show()
    {
    	super.show();
    	System.out.printf("포켓몬 생성 : %s",this.owner);
    }
	    

}

class Ggoboogi extends Pokemon
{	
	private String name = null;
	private int attack_menu = 0;
	public Ggoboogi()
	{
		super();
	}
	public Ggoboogi(int count,int menu,int pokemon,String owner,String skills,int attack_menu,String name)
	{
		super(count,menu,pokemon,owner,skills,attack_menu);
		this.name = "꼬부기";
		System.out.printf("%s",this.name);
	}
	public void info()
	{
	  System.out.printf("%s의 포켓몬이 사용 가능한 스킬",this.owner);
	  String[] arr = skills.split("/");
      for (int i = 0; i <= skills.length(); i++)
      {	
      	System.out.printf("%d+1",i);
    	System.out.printf("%d+1 : %s",i,arr[i]);
      }
	 }
    public void attack(int idx)
    {
    	super.attack(idx);
    	String[] arr = skills.split("/");
    	System.out.printf("[꼬북꼬북] %s의 %s가 %s공격 시전!",owner,name,arr[idx]);
    }

    public void swim()
    {
    	System.out.printf("%s가 수영을 합니다",this.name);
    }
    public void show()
    {
    	super.show();
    	System.out.printf("포켓몬 생성 : %s",this.owner);
    }
}
class Pairi extends Pokemon 
{
	private String name = null;
	private int attack_menu = 0;
	public Pairi()
	{
		super();
	}
	public Pairi(int count,int menu,int pokemon,String owner,String skills,int attack_menu,String name)
	{
		super(count,menu,pokemon,owner,skills,attack_menu);
		this.name = "파이리";
		this.attack_menu = attack_menu;
		System.out.printf("%s",name);
	}
	public void info()
	{
	  System.out.printf("%s의 포켓몬이 사용 가능한 스킬",this.owner);
	  String[] arr = skills.split("/");
      for (int i = 0; i <= skills.length(); i++)
      {	
      	System.out.printf("%d+1",i);
    	System.out.printf("%d+1 : %s",i,arr[i]);
      }
	 }
   public void attack(int idx)
    {
    	super.attack(idx);
    	String[] arr = skills.split("/");
    	System.out.printf("[파일파일] %s의 %s가 %s 공격 시전!",owner,name,arr[idx]);
    }
   public void show()
   {
   	super.show();
   	System.out.printf("포켓몬 생성 : %s",this.owner);
   }
}

public class Pokemon0212 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		int mycount = 0;
		System.out.printf("총 %d 마리의 포켓몬이 생성되었습니다",mycount );
		mycount = sc.nextInt();
		
		sc.nextLine();
		
		int mymenu = 0;
		System.out.printf("1) 포켓몬 생성 2) 프로그램 종료 : ");
		mymenu = sc.nextInt();
		
		int mypokemon = 0;
		String myowner = null;
		String myskills = null;
		String myname = null;
		int myattack_menu = 0;
		
//		} System.out.printf("메뉴에서 골라주세요");
	
		Pikachu pipi = new Pikachu(mycount,mymenu,mypokemon,myowner,myskills,myname,myattack_menu);
		
		
		while (mymenu == 2) {	
			if (mymenu == 1) {
				System.out.printf("1) 피카츄 2) 꼬부기 3) 파이리 : ");
				mypokemon = sc.nextInt();
				sc.nextLine();
		
				
				System.out.printf("플레이어 이름 입력 : ");
				myowner = sc.nextLine();
				
				
				System.out.printf("사용 가능한 기술 입력(/로 구분하여 입력) : ");
				myskills = sc.nextLine();
			
				if (mypokemon == 1) {	
					pipi.show();
					pipi.info();		
				}
				else if (mypokemon == 2) {
					pipi.show();
					pipi.info();
				}
				else if (mypokemon == 3) {
					pipi.show();
					pipi.info();
				}
				else {
					System.out.printf("메뉴에서 골라 주세요");
				pipi.info();
				System.out.printf("공격 번호 선택 : ");
				myattack_menu = sc.nextInt();
				pipi.attack(myattack_menu-1);
				}

			}
			
	}
	}
}

