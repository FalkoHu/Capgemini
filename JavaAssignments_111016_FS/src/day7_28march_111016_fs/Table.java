package day7_28march_111016_fs;

public class Table implements Comparable<Table>{
	private long id;
	private int number;
	private int capacity;
	
	public Table() {
		
	}
	public Table(long id, int number, int capacity) {
		super();
		this.id = id;
		this.number = number;
		this.capacity = capacity;
	}
	
	static Table createTable(String line) {
		String[] values = line.split(",");
		return new Table(Long.parseLong(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]));
	}
	
	@Override
	public String toString() {
		return String.format("%-5s %-10s %s\n",this.id,this.number,this.capacity);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public int compareTo(Table o) {
		Integer o1 = this.number;
		Integer o2 = o.getNumber();
		return o1.compareTo(o2);
	}
}
