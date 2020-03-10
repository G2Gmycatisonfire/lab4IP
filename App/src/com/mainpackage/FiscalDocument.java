package com.mainpackage;

import java.util.List;

public abstract class FiscalDocument {
    public FiscalDocument() {
    }
    public FiscalDocument(int id, String title) {
        this.id = id;
        this.title = title;
    }

    private int id;
    public int getID() {
        return this.id;
    }
    protected void setID(int id) {
        this.id = id;
    }
    private String title;
    public String getTitle() {
        return this.title;
    }
    protected void setTitle(String title) {
        this.title = title;
    }
    private List<Institution> institutionList;
    public List<Institution> getInstitutionList() {
        return this.institutionList;
    }
    protected void setInstitutionList(List<Institution> institutionList) {
        this.institutionList = institutionList;
    }

    public boolean addInstitution(Institution institution) {
        if (this.institutionList.contains(institution))
            return false;

        this.institutionList.add(institution);
        return true;
    }
    public boolean removeInstitution(Institution institution) {
        if (!this.institutionList.contains(institution))
            return false;

        this.institutionList.remove(institution);
        return true;
    }
}
