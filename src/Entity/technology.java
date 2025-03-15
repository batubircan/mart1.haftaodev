package Entity;

public class technology {

    private int id;
    private String name;
    private ProgramingLanguage programinglanguages;

    public technology(){

    }

    public technology(int id, String name, ProgramingLanguage programinglanguages) {
        this.id = id;
        this.name = name;
        this.programinglanguages = programinglanguages;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProgramingLanguage getPrograminglanguages() {
        return programinglanguages;
    }

    public void setPrograminglanguages(ProgramingLanguage programinglanguages) {
        this.programinglanguages = programinglanguages;
    }
}

