package lab4;

class Account {
	protected long accNum;
	protected double balance;
	Person accHolder;
	
	public Account() {
		super();
	}
	public Account(long accNum, double balance, Person accHolder) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	public void deposit(double d) {
		
	}
	public void withdraw(double w) {
		
	}
	public double Balance() {
		return balance;
	}
	
	//Getters and Setters
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
//	@Override
//	public String toString() {
//		return "Account [accNum=" + getAccNum() + ", balance=" + getBalance() + ", accHolder=" + getAccHolder() + "]";
//	}
	
	
}


class Person extends Account{
	private String name;
	private float age;
	
	public Person() {
		super();
	}
	
	
	public Person(String name) {
		super();
		this.name = name;
	}	

	public Person(long accNum, double balance, Person accHolder) {
		super(accNum, balance, accHolder);
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
	}
	
	public Person(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	public Person(String name, float age) {
		super();
		this.name = name;
		this.age = age;
	}


	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}


//	@Override
//	public String toString() {
//		return "Person [name=" + getName() + ", age=" + getAge() + "]";
//	}
	
	
}

public class Exercise1 {

	public static void main(String[] args) {
//		Person p1 = new Person("smith", 25.3f);
//		Person p2 = new Person("kathy", 35.7f);
//		Account a1 = new Account(234356789, 56378.50, p1);
		Person p3 = new Person("smith", 2000.0);
		p3.getBalance();
		
	}

	

}

