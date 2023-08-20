package pp1;

public class Object {
	int i;
	int j;
	public Object() {
		i = 10;
		j = 20;	
	}
	public Object(int i,int j) {
		this.i=i;
		this.j=j;
	}
	public static void main(String[] args) {
		Object t1 = new Object(22,45);
		Object t2 = new Object(22,45);
		Object t3 = new Object(54,66);
		System.out.println(t1.add());
		System.out.println(t2.add());
		System.out.println(t3.add());
		System.out.println(t1==t2);
	}
	public int add() {
		return i+j;
		
	}

}
// we can create the constructor at same time in two different class// 