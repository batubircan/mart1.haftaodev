package sevice;
import Entity.ProgramingLanguage;
import java.util.List;

public interface ProgrammingLanguageService  {
    void add(ProgramingLanguage languages);
    List<ProgramingLanguage> getAll();
    ProgramingLanguage getById(int id);
    void update(ProgramingLanguage languages);
    void delete(int id);

}
