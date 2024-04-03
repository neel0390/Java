class Student{
    int rollno;
    String name;
    int marks;

}

class Aoo{

    public static void main(String [] args){

        Student s1 = new Student();
        s1.rollno = 21;
        s1.name = "jhon";
        s1.marks = 80;

        Student s2 = new Student();
        s2.rollno = 24;
        s2.name = "adam";
        s2.marks = 85;

        Student s3 = new Student();
        s3.rollno = 26;
        s3.name = "jeery";
        s3.marks = 99;

        // System.out.println(s1.name);

        Student arr[] = new Student[3];
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        // for(int i=0; i<arr.length;i++){
        //     System.out.println("Student Name:"+arr[i].name +" "+"Marks:"+arr[i].marks);
        // }
      
        // for(Student i:arr){
        //     System.out.println("Student Name:"+i.name+" "+"Marks:"+i.marks);

       


        }

        
    }

