package Repository;

import Entity.ProgramingLanguage;
import Entity.technology;
import java.util.ArrayList;
import java.util.List;

public class technologyrepository {

    private List<technology> technologies;

    public technologyrepository(){
        technologies = new ArrayList<technology>();

        technologies.add(new technology(1,"Spring boot", new ProgramingLanguage(1,"java")));

    }
    public List<technology> getAll(){
        return technologies;
    }

    public void add(technology tech){
        technologies.add(tech);
    }

}
