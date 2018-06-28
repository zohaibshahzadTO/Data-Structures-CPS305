// Lab 2 Ver 2

public class ListNode
{
  private int value;
  private ListNode next;

  public ListNode(int newVal, ListNode newNext)
  {
    value = newVal;
    next newNext
  }

  public int getValue()
  {
    return value;
  }

  public ListNode getNext()
  {
    return next;
  }

  public void setData(int newValue)
  {
    value = newValue;
  }

  public void setNext(ListNode newNext)
  {
    next = newNext;
  }

  public void insertFirst(int value)
  {
    ListNode newNode = new ListNode(value, null);
    if (head == null)
    {
      head = newNode;
    }
    else
    {
      newNode.setNext(head);
      head = newNode;
    }
  }

  public void insertLast(int value)
  {
    ListNode newNode = new ListNode(value, null);
    if (head == null)
    {
      head = newNode;
    }
    else
    {
      current = head;
      while (current != null)
      {
        previous = current;
        current = current.getNext();
      }
      previous.setNext(newNode);
    }
  }

  public ListNode insertAtGivenPos(ListNode head, int value, int position)
  {
    int size = length(head);
    if (position > size + 1 || position < 1)
    {
      return head;
    }

    ListNode newNode = new ListNode(data);
    if (position == 1)
    {
      newNode.next = head;
      return newNode;
    }
    else
    {
      ListNode previous = head;
      int count = 1;
      while(count < position - 1)
      {
        previous = previous.next;
        count++;
      }

      ListNode current = previous.next;
      newNode.next = current;
      previous.next = newNode;
      return head;
    }

    public ListNode deleteFirst()
    {
      ListNode remove = head;
      if (head != null)
      {
        head = head.getNext();
      }
      return remove;
    }

    public ListNode deleteLast()
    {
      if (head != null)
      {
        current = head;
        while(current.getNext() != null)
        {
          previous = current;
          current = current.getNext();
        }
        previous.setNext(null);
        return current;
      }
      return null;
    }

    public ListNode deleteAtGivenPos(ListNode head, int position)
    {
      int size = length(head);
      if(position > size || position < 1)
      {
        return head;
      }

      if (position == 1)
      {
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
      }
      else
      {
        ListNode previous = head;
        int count = 1;
        while(count < position - 1)
        {
          previous = previous.next;
          count++;
        }

        ListNode current = previous.next;
        previous.next = current.next;
        current.next = null;
        return current;
      }

      public void addSorted(int value) {
        if (front == null || value <= front.data)
        {
          front = new ListNode(value, front);
        }
        else
        {
          ListNode current = front;
          while (current.next != null && current.next.data < value)
          {
              current = current.next;
          }
        }
      }

      public void print(ListNode head)
      {
        if (head = null)
        {
          return;
        }

        ListNode current = head;
        while (current != null)
        {
          current = current.next;
        }
      }

      public int size(ListNode head)
      {
        if (head != null)
        {
          return 0;
        }

        int count = 0;
        ListNode current = head;
        while(current != null)
        {
          count++;
          current = current.next;
        }
        return count;
      }

      public boolean isEmpty()
      {
        return head == null;
      }

      public void clear()
      {
        head = null;
        tail = null;
        currentSize = 0;
      }

      public String toString()
      {
        Node n = head.next;
        String temp = "";
        while(n != null)
        {
          temp = temp + n.value + " ";
          n = n.next;
        }
        return temp;
      }

      public boolean contains(String o) {
        if (next.getValue().equals(o))
        {
            return true;
        }
        else
        {
            next.contains(o);
        }

      }

      public int indexOf(Object obj) {
        int index = 0;
        Node current = head;

        while (current != null)
        {
          if (current.equals(obj))
          {
            return index;
          }
          index++;
          current = current.next;
        }
        return -1;
       }

    }
  }
}

// Stacks and Queues

public class ExamScores
{
  public static void main(String[] args)
  {
    Stack<Student> studentScore = new Stack<Student>();
    Stack<Student> backup = new Stack<Student>();
    Student s1 = new Student("Yielding", 87);
    Student s2 = new Student("White", 84);
    Student s3 = new Student("Todd", 52);
    Student s4 = new Student("Tashev", 95);
    studentScore.push(s1);
    studentScore.push(s2);
    studentScore.push(s3);
    studentScore.push(s4);
  }

  public queueWithTwoStacks(Stack<Student> backup, int x)
  {
    if (studentScore.isEmpty())
    {
      studentScore.push(x);
    }
    else
    {
      while (!studentScore.isEmpty())
      {
        backup.push(studentScore.pop());
      }
      studentScore.push(x);

      while (!backup.isEmpty())
      {
        studentScore.push(backup.pop());
      }
    }
  }


  public void pop()
  {
    studentScore.pop();
  }


  public int peek()
  {
    return studentScore.peek();
  }

  public boolean empty()
  {
    return studentScore.isEmpty();
  }

  public static void filterQueue(queueWithTwoStacks<Student> studentFinal)
  {
    int size = studentFinal.size();
    String currentStudent = new studentFinal.first;
    for(int i = 0; i < size; i++)
    {
      if(currentStudent.score == 100)
      {
        studentFinal.dequeue(currentStudent);
      }
      currentStudent = currentStudent.next;
    }
  }

  public class Student
  {
      private String fname;
      private int stScore;

      public String getName()
      {
          return this.fname;
      }

      public int getScore()
      {
          return this.stScore;
      }

      public boolean setName(String name)
      {
          this.fname = name;
          return true;
      }

      public boolean setScore(int score)
      {
          this.stScore = score;
          return true;
      }
  }
}

// Student Linked List

public class LNode
{
  int STDnum;
  string STDname;
  double gpa;
  LNode next;

  Public ListNode (int stdnum, string sname, double sgpa, LNode snext)
  {
    STDnum = stdnum;
    STDname = sname;
    gpa = sgpa;
    Next = snext;
  }
}

//


public class Student
{
  public static void main(String[] args)
  {
    LinkedList<StudentInfo> list = new LinkedList<StudentInfo>();
    list.add(new StudentInfo("Zohaib","465889",24, 3.40));
    list.add(new StudentInfo("Gibran","465895",22, 3.50));
    list.add(new StudentInfo("Jaime","998964",26, 2.90));

    Scanner input = new Scanner(System.in);
    System.out.print("Enter Student Information to display: ");
    String record = input.next();
    for (StudentInfo info : list)
    {
      if (data.getName().equals(record))
      {
        System.out.println(info.getName() + "\t" + info.getId() + "\t" + data.getGPA());
      }
    }
  }



  public class StudentInfo
  {
    private String fullName;
    private int stId;
    private double gpa;

    public String getName()
    {
        return this.fullName;
    }

    public int getId()
    {
        return this.stId;
    }

    public double getGPA()
    {
        return this.gpa;
    }

    public boolean setName(String name)
    {
        this.fullName = name;
        return true;
    }

    public boolean setIdNum(int id)
    {
        this.stId = id;
        return true;
    }

    public boolean setGPA(double GPA)
    {
        this.gpa = GPA;
        return true;
    }
  }
}
