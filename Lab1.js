public class QuizScore
{
    public static void main(String[] args)
    {
      ArrayList<Integer> scores = new ArrayList<>();
      scores.remove(minimum);

      int i;
      double sum = 0;
      for (i = 1; i < scores.size(); i++)
      {
        sum += scores.get(i);
      }
      return sum;

      System.out.println("The total quiz score excluding the lowest value is: " + sum);

    }

    public int mimimum(int n)
    {
      int i;
      int min = scores[0];
      for (i = 1; i < n; i++)
      {
        if (scores[i] < min)
        {
            min = scores[i];
        }
      }
      return min;
    }
}



// Given an array whose size is an even number and you are to switch the first and second half.
public int swapHalf(int[] first, int[] second)
{
  int[] first = new int[values.length/2];

  for (int j = values.length/2; j < values.length; j++)
  {
    first[j] = values[j];
  }
}

/*
Consider the task of rearranging all elements in an array so that the even numbers come
first. Otherwise, the order doesn’t matter
*/

public int [] evenToFront(int[] arr)
{
  int temp = 0;
  int evenEnd = 0;
  for (int i = 0; i < arr.length; i++)
  {
    if (arr[i] %2 == 0)
    {
      temp = arr[i];

      for (int j = i; j > a; j--)
      {
        arr[j] = arr[j - 1];
      }
      arr[evenEnd] = temp;
      evenEnd++;
    }
  }
}

// Take two 5 x5 matrices of char and print the result of concatenation of each column.
// Use a simple string to concatenate. You do not need to save the results but print it
// after each column

Incomplete



// matrices multiplication 3x3
public int[][] matricesMultiplication (int [][] A, int[][] B, int[][] C)
{
  int[][] A = { {2, 4, 6}, {8, 10, 12}, {14, 16, 18} };
  int[][] B = { {1, 3, 5}, {7, 9, 11}, {13, 15, 17} };

  //rows and columns for each matrix
  int rowsA = A.length;
  int colsA = A[0].length;
  int rowsB = B.length;
  int colsB = B[0].length;

  int[][] C = new int [rowsA][colsB];

  for (int i = 0; i < rowsA; i++)
  {
    for(int j = 0; j < colsB; j++)
    {
     for(int k = 0; k < colsA; k++)
     {
      C[i][j] += A[i][k] * B[k][j];
     }
    }
  }
  return C;
}

// Create an ArrayList of Student’s ID number

public class StudentID
{
    public static void main(String args[])
    {

        ArrayList<Student> studentId = new ArrayList<Student>();
        Student s1 = new Student("Zohaib", 465889);
        Student s2 = new Student("John", 465895);
        Student s3 = new Student("Jaime", 998964);
        Student s4 = new Student("Gibran", 998932);
        studentId.add(s1);
        studentId.add(s2);
        studentId.add(s3);
        studentId.add(s4);


        Scanner scan = new Scanner(System.in);
        System.out.println("What is the students name?");
        String name = scan.nextLine();
        System.out.println("What is their ID?");
        int id = scan.nextInt();

        System.out.println(StudentList.get(0).getName()+", "+StudentList.get(0).getId());

        ArrayList<Student> shallowClone = (ArrayList<Student>) studentId.clone();
        System.out.println("Cloned ArrayList:"+ shallowClone);

        ArrayList<Student> studentId2 = new ArrayList<Student>();
        Student s5 = new Student("Shah", 456098);
        student s6 = new Student("Mars", 508967);
        studentId2.add(s5);
        studentId2.add(s6);

        studentId.addAll(studentId2);

        studentId2.clear();
        studentId.containsAll(studentId2);

        Object[] ob = studentId.toArray();

        Collections.swap(studentId, 1, 2);
        Collections.shuffle(studentId);
        Collections.reverse(studentId);

        ArrayList<Student> arrl3 = new ArrayList<Student>(studentId.subList(1, 2));
        System.out.println("SubList stored in Arraylist: " + arrl3);

        // retainAll() demonstration
        studentId2.add(s2);
        studentId2.add(s3);

        System.out.println("Calling retainAll()");
        studentId.retainAll(studentId2);
    }
}

public class Student
{
    private String fullName;
    private int stId;

    public String getName()
    {
        return this.fullName;
    }

    public int getId()
    {
        return this.stId;
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
}
