package com.example.abeday5cw3.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.abeday5cw3.model.Language;
import com.example.abeday5cw3.repository.LanguageRepo;

@Service
public class AbeLanguageService {
    private AbeLanguageRepo languageRepo;
    public AbeLanguageService(AbeLanguageRepo languageRepo)
    {
        this.languageRepo=languageRepo;
    }
    public boolean saveLanguage(Language language)
    {
        try
        {
            languageRepo.save(language);

        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<AbeLanguage> getLanguages()
    {
        return languageRepo.findAll();
    }
    public boolean updateLanguage(int id,AbeLanguage language)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        try{
            languageRepo.save(language);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteLanguage(int id)
    {
        if(getLanguageById(id)==null)
        {
            return false;
        }
        languageRepo.deleteById(id);
        return true;
        
    }
    public AbeLanguage getLanguageById(int id)
    {
        return languageRepo.findById(id).orElse(null);
    }

}
