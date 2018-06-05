
package person;


public class Teacher extends Person {
    private String mainSubject;
    private int workingYears;

    
    
    public String getMainSubject() { 
    return mainSubject;
    } 
    
    public void setMainSubject(String mainSubject) { 
    this.mainSubject = mainSubject;
    
}
    
    public int getWorkingYears(){ 
    return workingYears;
    }
    
    
    public void setWorkingYears(int workingYears) { 
    this.workingYears = workingYears;
    }
    
    public Teacher () { 
        
    }
    
    
    public Teacher(String name, String surname, String jmbg) { 
    super(name, surname, jmbg);
}
    public Teacher(String name, String surname, String jmbg, String mainSubject, int workingYears) { 
    super(name, surname, jmbg);
    this.mainSubject = mainSubject;
    this.workingYears = workingYears;
    }
    
    @Override
    public void showData() {
    
        System.out.println("MainSubject is " + getMainSubject());
        System.out.println("Workingyear " + getWorkingYears());
        super.showData();
    }
}
