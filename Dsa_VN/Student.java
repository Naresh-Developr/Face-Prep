package Dsa_VN;

import java.util.*;

public class Student {

    int sid;
    String sname;
    String saddress;
    int srank;
    static String sclg = "SNS";

    Student(int a,String b, String c,int rank){
        sid = a;
        sname = b;
        saddress = c;
        srank = rank;

    }
    
}

class test{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        System.out.println("Enter the no of records: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            int sid = sc.nextInt();
            String sname = sc.next();
            String saddress = sc.next();
            int srank = sc.nextInt();

            Student obj = new Student(sid,sname,saddress,srank);

            list.add(obj);
        }

        System.out.println("Printing the Records: ");
        System.out.println();
        for(int i=0;i<n;i++){
            System.out.println(list.get(i).sid + " " + list.get(i).sname + " " +list.get(i).saddress + " " +list.get(i).srank + " " +Student.sclg);

        }
        //System.out.println();
        System.out.print("Enter the location : ");
        String loc = sc.next();
        //2System.out.println();
        int top = Integer.MAX_VALUE;
        String name = list.get(0).sname;
        String add = list.get(0).saddress;
        int id = list.get(0).sid;
        for(int i=0;i<n;i++){
            if((loc.equals(list.get(i).saddress)) && ((list.get(i).srank)<top)){
                top = list.get(i).srank;
                name = list.get(i).sname;
                add = list.get(i).saddress;
                id = list.get(i).sid;
                

            }
        }
        System.out.println("From location : "+ loc  +" ");
        System.out.println("Topper Rank is :" + top);
        System.out.println("Topper Name is :" + name );
        System.out.println("Topper id is :" + id);
        System.out.println("Topper address is :" + add);
        sc.close();
    }
    

}
    

