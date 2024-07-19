import java.util.Scanner;
class two_statck
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    MY_LIST l1 = new MY_LIST();
    for(int i=0;i<a;i++)
    {
      l1.push1(sc.nextInt());
    }
    int b = sc.nextInt();
    for(int i=0;i<b;i++)
    {
      l1.push2(sc.nextInt());
    }
    int p1 = sc.nextInt();
    int p2 = sc.nextInt();
    l1.display1();
    l1.display2();
    for(int i=0;i<p1;i++)
    {
    	if(l1.pop1()==Integer.MIN_VALUE)
        {
         //System.out.println("Stack underflow. pop from stack 1 failed");
          break;
        }
    }
    for(int i=0;i<p2;i++)
    {
    	if(l1.pop2()==Integer.MIN_VALUE)
        {
          //System.out.println("Stack underflow. pop from stack 2 failed");
          break;
        }  
    }
    l1.display1();
    l1.display2();
    //l1.display3();
     sc.close();
  }
}
class MY_LIST
{
  int top1 = -1;
  static int size = 1000;
  int top2 = size;
  int[] arr = new int[size];
  void push1(int n)
  {
    if(top1==top2)
    {
      System.out.println("Stack overflow");
      return;
    }
    top1++;
    arr[top1] = n;
  }
  void push2(int n)
  {
    if(top1==top2)
    {
      System.out.println("Stack overflow");
      return;
    }
    top2--;
    arr[top2] = n;
  }
  void display1()
  {
    System.out.println("Stack 1 Elements:");
    while(top1!=-1)
    {
      System.out.print(arr[top1]+" ");
      top1--;
    }
    System.out.println();
    return;
  }
  void display2()
  {
    System.out.println("Stack 2 Elements:");
    while(top2!=1000)
    {
      System.out.print(arr[top2]+" ");
      top2++;
    }
    System.out.println();
    return;
  }
  int pop1()
  {
    if(empty1())
    {
      System.out.println("Stack underflow. pop from stack 1 failed");  
      return Integer.MIN_VALUE;
    }
    int temp = arr[top1];
    arr[top1]=0;
    top1--;
    return temp;
  }
//   void display3(){
//     System.out.println("stack 1 elements are: ");
//     for(int i=top1;i>=0;i--){
//         System.out.println(arr[i]+" ");
//     }
//     System.out.println();
//     System.out.println("stack 2 elements are: ");
//     for(int j=top2;j<size;j++){
//         System.out.println(arr[j]+" ");
//     }
//     System.out.println();

//   }
  int pop2()
  {
    if(empty2())
    {
      System.out.println("Stack underflow. pop from stack 1 failed");
      return Integer.MIN_VALUE;
    }
    int temp = arr[top2];
    arr[top2]=0;
    top2++;
    return temp;
  }
  boolean empty1(){
    return top1==-1;
  }
  boolean empty2(){
    return top2==size;
  }
}