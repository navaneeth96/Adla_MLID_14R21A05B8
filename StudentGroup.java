import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {
	public Node first;
	public Node last;
	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
	}
	public class Linkedlist() {
		private Node root;
		public void addAtEnd(int data);
		return;
	}
	Node tmp=root;
	while(tmp.next!=null) {
		tmp=tmp.next;
	}
	tmp.next = new Node(data);
}

	

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		student.setId(createid("a",1));
		student list.add(students);
	}

	@Override
	public Student getStudent(int index) {
		studentId
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		studentId=id;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		Node f=first;
		Node newNode=new Node(student);
		first = newNode;
		if(f=null) 
			last=newNode;
		else 
			f.previous=newNode;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		Node 1=last;
		Node newNode=new Node(student);
		last = newNode;
		if(f==null)
			first=newNode;
		else
			1.next=newNode;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		studentgroup.remove(students);
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		studentgroup.remove(index);
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		studentgroup.remove(students);
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		int data = 0;
		Node tmp = root;

		if (index < 0)
			return -1;
		if (index == 0) {
			data = root.data;
			root = root.next;
			return data;
		}

		while(index > 0) {
			if(tmp == null) {
				return -1;
			}
			tmp = tmp.next;
			index--;
		}
		data=tmp.data;
		tmp.data=tmp.next.data;
		tmp.next=tmp.next.next;
		return data;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
