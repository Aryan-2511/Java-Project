import java.util.Scanner;

public class Student_System {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many UG students are there ?");
        int numOfUG = scanner.nextInt();
        while(numOfUG<10){
            System.out.println("Minimum number of students should be 10 !! ");
            System.out.println("How many UG students are there ?");
            numOfUG = scanner.nextInt();
        }
        System.out.println("How many PG students are there ?");
        int numOfPG = scanner.nextInt();
        while(numOfPG<10){
            System.out.println("Minimum number of students should be 10 !! ");
            System.out.println("How many UG students are there ?");
            numOfPG = scanner.nextInt();
        }
        UGStudent[] s1 = new UGStudent[numOfUG];
        for (int i = 0; i < numOfUG; i++){
            System.out.println("Enter Name for UG Student " + (i+1));
            String name = scanner.next();
            System.out.println("Enter USN for UG Student " + (i+1));
            String USN = scanner.next();
            System.out.println("Enter semester for UG Student " + (i+1));
            int semester = scanner.nextInt();
            System.out.println("Enter branch for UG Student " + (i+1));
            String branch = scanner.next();
            s1[i] = new UGStudent(USN,name,semester,branch);
        }
        
        
        PGStudent[] s2 = new PGStudent[numOfPG];
        System.out.println("Enter the details of the PG students : ");
        for (int i = 0; i < numOfPG; i++){
            System.out.println("Enter Name for PG Student " + (i+1));
            String name = scanner.nextLine();
            System.out.println("Enter USN for PG Student " + (i+1));
            String USN = scanner.next();
            System.out.println("Enter Specialization for PG Student " + (i+1));
            String specialization = scanner.next();
            System.out.println("Enter UGDegree for PG Student " + (i+1));
            String UGDegree = scanner.next();
            s2[i] = new PGStudent(USN,name,specialization,UGDegree);

        }
        /*
        Ways to print the objects in the array
        1.Using printdetails method
        for (int i = 0; i < numOfPG; i++){
            System.out.println("\n Details of PG Student "+(i+1) +":\n" );
            s2[i].printDetails();
        }
        for (int i = 0; i < numOfUG; i++){
            System.out.println("\n Details of UG Student "+(i+1) +":\n" );
            s1[i].printDetails();
        } 

        2.Using Get function
        for (int i = 0; i < numOfPG; i++){
            System.out.println("\nPG Student "+(i+1)+":\n");
            System.out.println("USN - "+s2[i].getUSN()+"\nName - "+s2[i].getName()+"\nSpecialization - "+s2[i].getSpecialization()+
            "\n1UG Degree - "+s2[i].getUGDegree());
        }
        for (int i = 0; i < numOfUG; i++){
            System.out.println("\nUG Student "+(i+1) +":\n" );
            System.out.println("USN -"+s1[i].getUSN()+"\nName - "+s1[i].getName()+"\nSemester - "+s1[i].getSemester()+
            "\nBranch - "+s1[i].getBranch());
        } 
        */

       scanner.close();
    }

    
}


