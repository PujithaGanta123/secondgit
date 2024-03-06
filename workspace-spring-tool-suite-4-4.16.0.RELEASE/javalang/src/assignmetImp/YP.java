package assignmetImp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class YP {
	
	
	private int id;
	private String name;
	private int training;
	private float salary;
	
	public YP(int id,String name, int training, float salary) {
		this.id=id;
		this.name=name;
		this.training=training;
		this.salary=salary;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id=id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int gettraining() {
		return training;
	}
	public void settraining(int training) {
		this.training=training;
	}
	public float getsalary() {
		return salary;
	}
	public void setsalary(float salary) {
		this.salary=salary;
	}


}
interface IYP{
	void addYP(YP yp);
	List<YP> findByYPName(String name);
	YP findByEmpId(int EmpId);
	List<YP> getAllYP();
	void deleteYPById(int productId);
	YP updateYPSalaryAndTraining(int empid,float salary, int training);
	YP findYPWithMaxSalary();
	List<YP> getAllYPCompletedTraining() ;
	List<YP> sortByYPSalary();  	
	
}
 class IYPImpl  implements IYP{
	 private List<YP> yplist;
	 public IYPImpl() {
		 this.yplist= yplist;
	 }
	@Override
	public void addYP(YP yp) {
		// TODO Auto-generated method stub
		yplist.add(yp);		
	}
	@Override
	public List<YP> findByYPName(String name) {
		// TODO Auto-generated method stub
		List<YP> result = new ArrayList<>();
		for(YP yp: yplist) {
			if(yp.getname().equals(name)) {
				result.add(yp);
			}
		}		
		return result;
	}
	@Override
	public YP findByEmpId(int empId) {
		// TODO Auto-generated method stub
		for(YP yp: yplist) {
			if(yp.getid()==empId) {
				return yp;
			}
		}
		return null;
	}
	@Override
	public List<YP> getAllYP() {
		// TODO Auto-generated method stub
		return new ArrayList<>(yplist);		
	}
	@Override
	public void deleteYPById(int empId) {
		// TODO Auto-generated method stub
		yplist.removeIf(yp -> yp.getid() == empId);		
	}
	@Override
	public YP updateYPSalaryAndTraining(int empid,float newSalary, int training) {
		// TODO Auto-generated method stub
		YP yp = findByEmpId(empid);
        if (yp != null) {
            yp.setsalary(newSalary);
            yp.settraining(training);
            return yp;
        }
		return null;
	}
	@Override
	public YP findYPWithMaxSalary() {
		// TODO Auto-generated method stub
		if (yplist.isEmpty()) {
            return null;
        }
        YP maxsalaryYP = yplist.get(0);
        for (YP yp : yplist) {
            if (yp.getsalary() > maxsalaryYP.getsalary()) {
                maxsalaryYP = yp;
            }
        }
		return maxsalaryYP;		
	}
	@Override
	public List<YP> getAllYPCompletedTraining() {
		// TODO Auto-generated method stub
	    List<YP> completedtrainingYPs=new ArrayList<>();
	    for(YP yp:yplist)
	    	if(yp.gettraining()==0) {
	    		completedtrainingYPs.add(yp);
	    	}	
		return completedtrainingYPs;
	}
	@Override
	public List<YP> sortByYPSalary() {
		List<YP> sortbyYPsalary= new ArrayList<>();
		sortbyYPsalary.sort(Comparator.comparingDouble(YP::getsalary).reversed());
		return sortbyYPsalary;	
	}
		
	}
	

