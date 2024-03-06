package day5Assignment;

	public class Employee {
		String name;
		String designation;
		int experience;
		double salary;
		double bonus;
		public Employee(String name,String designation,int experience) {
			this.name=name;
			this.designation=designation;
			this.experience=experience;
			calculateSalary();
			calculateBonus();
		}
	 
		private void calculateSalary() {
			switch(designation) {
			case "manager":
				salary=50000+(experience*2000);
				break;
			case "developer":
				salary=40000+(experience*1500);
				break;
			default:
				salary=30000+(experience*1000);
				break;
			}
		}
	 
		private void calculateBonus() {
			if(experience>=5) {
				bonus=salary*0.2;
			}else {
				bonus=salary*0.1;
			}
		}
		public void displayDetails() {
			System.out.println("Employee name:"+name);
			System.out.println("Designation:"+designation);
			System.out.println("Experience:"+experience);
			System.out.println("Salary:"+salary);
			System.out.println("Bonus:"+bonus);
		}
	public static void main(String args[]) {
		 Employee e=new Employee("AAA","manager",7);
		 e.displayDetails();
	}
	}

