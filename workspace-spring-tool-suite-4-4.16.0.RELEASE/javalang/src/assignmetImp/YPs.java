package assignmetImp;

import java.util.List;
import java.util.Scanner;

public class YPs {

	public static void main(String[] args) {
		IYPImpl iyp=new IYPImpl();
		Scanner sc=new Scanner(System.in);
		int choice;
	/*	1.	Add New YP
		2.	Find YPByID
		3.	Find YP By Name
		4.	List All YP
		5.	Delete YP By Id
		6.	Update YP training and salary
		7.	Get the YP with Max salary
		8.	List All YP compledted training!
		9.	Sort YP By salary in Desending
		10.	Exit */
	
		do {
			System.out.println("Menu");
			System.out.println("1.Add New YP");
			System.out.println("2.Find YPByID");
			System.out.println("3.Find YP By Name");
			System.out.println("4.List All YP");
			System.out.println("5.Delete YP By Id");
			System.out.println("6.UPdating YP training and salary");
			System.out.println("7.Get the YP with max salary");
			System.out.println("8.List All YP completed training");
			System.out.println("9.Sort YP By salary in Descenting");
			System.out.println("Exit");
			sc.nextLong();
			System.out.println("enter your choice");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("enter your empid");
				int empid =sc.nextInt();
				System.out.println("enter your name");
				String name=sc.nextLine();
				System.out.println("enter your training period");
				int training =sc.nextInt();
				System.out.println("enter your salary");
				float salary = sc.nextFloat();
                iyp.addYP(new YP(empid, name, training, salary));
                break;
            case 2:
                System.out.print("Enter empid: ");
                empid = sc.nextInt();
                YP ypById = iyp.findByEmpId(empid);
                if (ypById != null) {
                    System.out.println("YP found:");
                    System.out.println(ypById.getname() + " " + ypById.getid() + " " + ypById.gettraining() + " " + ypById.getsalary());
                } else {
                    System.out.println("YP not found.");
                }
                break;
            case 3:
                System.out.print("Enter name: ");
                String searchName = sc.nextLine();
                List<YP> ypListByName = iyp.findByYPName(searchName);
                if (!ypListByName.isEmpty()) {
                    System.out.println("YPs found:");
                    for (YP yp : ypListByName) {
                        System.out.println(yp.getname() + " " + yp.getid() + " " + yp.gettraining() + " " + yp.getsalary());
                    }
                } else {
                    System.out.println("No YP found with that name.");
                }
                break;
            case 4:
                List<YP> allYPs = iyp.getAllYP();
                System.out.println("All YPs:");
                for (YP yp : allYPs) {
                    System.out.println(yp.getname() + " " + yp.getid() + " " + yp.gettraining() + " " + yp.getsalary());
                }
                break;
            case 5:
                System.out.print("Enter empid to delete: ");
                empid = sc.nextInt();
                iyp.deleteYPById(empid);
                System.out.println("YP with empid " + empid + " deleted.");
                break;
            case 6:
                System.out.print("Enter empid to update: ");
                empid = sc.nextInt();
                System.out.print("Enter new training: ");
                int newTraining = sc.nextInt();
                System.out.print("Enter new salary: ");
                float newSalary = sc.nextFloat();
                iyp.updateYPSalaryAndTraining(empid, newSalary, newTraining);
                System.out.println("YP with empid " + empid + " updated.");
                break;
            case 7:
                YP maxSalaryYP = iyp.findYPWithMaxSalary();
                if (maxSalaryYP != null) {
                    System.out.println("YP with Max Salary:");
                    System.out.println(maxSalaryYP.getid() + " " + maxSalaryYP.getname() + " " + maxSalaryYP.gettraining() + " " + maxSalaryYP.getsalary());
                } else {
                    System.out.println("No YP found.");
                }
                break;
            case 8:
                List<YP> completedTrainingYPs = iyp.getAllYPCompletedTraining();
                System.out.println("YPs with Completed Training:");
                for (YP yp : completedTrainingYPs) {
                    System.out.println(yp.getname() + " " + yp.getid() + " " + yp.gettraining() + " " + yp.getsalary());
                }
                break;
            case 9:
                List<YP> sortedYPs = iyp.sortByYPSalary();
                System.out.println("YPs Sorted By Salary in Descending Order:");
                for (YP yp : sortedYPs) {
                    System.out.println(yp.getname() + " " + yp.getid() + " " + yp.gettraining() + " " + yp.getsalary());
                }
                break;
            case 10:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 10.");
        }
    } while (choice != 10);

    sc.close();
				
			}
			
			
		

	}



