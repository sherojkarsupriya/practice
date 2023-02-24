class Project 
{
    int proid;
    String proName;
    String proTech;
   
  Project(int pid, String pname, String ptech)
 {
        proid = pid;
        proName = pname;
        proTech = ptech;
    }
    
    public static void main(String args[])
 {
        Project p1 = new Project(123, "covid", "technology");
        Project p2 = new Project(124, "Anirod", "technology");
        Employee e1 = new Employee(20, "Devansh", p1);
        Employee e2 = new Employee(22, "Hithaksh", p2);
        e1.display();
        e2.display();
    }
    public void display() 
   {
       System.out.println(proid + " is " + proName + " using " + proTech);
    }
}
class Employee
 {
    int empid;
    String empName;
    Project empProj;
    
    Employee(int eid, String ename, Project eproj)
 { 
        empid = eid;
        empName = ename;
        empProj = eproj;
    }
    
    public void display() 
 {
        System.out.println(empid + " is " + empName + " working on project: ");
        empProj.display();
    }

}

