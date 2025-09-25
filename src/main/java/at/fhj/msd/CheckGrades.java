package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;

public class CheckGrades {

    private List<Subject> subjects;

    public CheckGrades(){
        subjects =new ArrayList<>();
       
    }

    public void addSubject(Subject s){
        if(s==null)
            throw new IllegalArgumentException();

        subjects.add(s);
    }

    public void removeSubject(Subject s){
        if(s==null)
            throw new IllegalArgumentException();
            
        subjects.remove(s);

    }
    
}