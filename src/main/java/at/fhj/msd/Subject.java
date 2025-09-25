package at.fhj.msd;

public class Subject {

    private String name;
    private int totalGrades;

    public  Subject(){}

    public Subject(String name,int totalGrades){
        if(name==null||name.isBlank())
            throw new IllegalArgumentException();
        if(totalGrades<0||totalGrades>100)
            throw new IllegalArgumentException();

        this.name=name;
        this.totalGrades=totalGrades;
    }

    public String getName() {
        
        return name;
    }

    public void setName(String name) {
        if(name==null||name.isBlank())
            throw new IllegalArgumentException();
        this.name = name;
    }

    public int getTotalGrades() {
        return totalGrades;
    }

    public void setTotalGrades(int totalGrades) {
        if(totalGrades<0||totalGrades>100)
            throw new IllegalArgumentException();
        this.totalGrades = totalGrades;
    }
    
}