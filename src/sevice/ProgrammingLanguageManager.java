package sevice;

import Entity.ProgramingLanguage;
import Repository.ProgrammingLanguagerepository;
import java.util.List;

public class ProgrammingLanguageManager implements ProgrammingLanguageService  {
    private ProgrammingLanguagerepository repository;

    public ProgrammingLanguageManager(ProgrammingLanguagerepository repository){
        this.repository=repository;
    }


    @Override
    public void add(ProgramingLanguage languages) {
        repository.add(languages);

    }

    @Override
    public List<ProgramingLanguage> getAll() {
        return repository.getAll();
    }

    @Override
    public ProgramingLanguage getById(int id) {
        return repository.getById(id).orElse(null);
    }

    @Override
    public void update(ProgramingLanguage languages) {
        repository.update(languages);
    }


    @Override
    public void delete(int id) {
        repository.delete(id);

    }
}
