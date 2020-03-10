package com.mainpackage;

import java.util.List;

public class Institution {
    public Institution() {
    }
    public Institution(int id, String title) {
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
    private List<FiscalDocument> fiscalDocuments;
    public List<FiscalDocument> getFiscalDocuments() {
        return this.fiscalDocuments;
    }
    protected void setFiscalDocuments(List<FiscalDocument> fiscalDocuments) {
        this.fiscalDocuments = fiscalDocuments;
    }

    public boolean addFiscalDocument(FiscalDocument fiscalDocument) {
        if (this.fiscalDocuments.contains(fiscalDocument))
            return false;

        this.fiscalDocuments.add(fiscalDocument);
        return true;
    }
    public boolean removeFiscalDocument(FiscalDocument fiscalDocument) {
        if (!this.fiscalDocuments.contains(fiscalDocument))
            return false;

        this.fiscalDocuments.remove(fiscalDocument);
        return true;
    }
}
