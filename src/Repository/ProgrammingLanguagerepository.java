package Repository;

import Entity.ProgramingLanguage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProgrammingLanguagerepository  {
    private static List<ProgramingLanguage> languageList = new ArrayList<>();
    private int nextid = 0;

    public void add(ProgramingLanguage language){
        language.setId(nextid++);
        languageList.add(language);
    }
    public List<ProgramingLanguage> getAll(){
        return languageList;
    }
    public void delete(int id){
        languageList.removeIf(programingLanguages -> programingLanguages.getId()==id);
    }
    public void update(ProgramingLanguage programingLanguage){
        for (ProgramingLanguage language:languageList){
            if (language.getId()== programingLanguage.getId()){
                language.setName(programingLanguage.getName());
                break;
            }
        }
    }

    public Optional<ProgramingLanguage> getById(int id){
        return languageList.stream().filter( language->language.getId()==id).findFirst();
    }
}
