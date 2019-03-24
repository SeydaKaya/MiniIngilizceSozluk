package com.example.minifransizcasozluk;

public class language
{
    private String tr;
    private String eng;
    private int resimId;
    private int sesId;


    public language(String tr, String eng, int resimId, int sesId) {
        this.tr = tr;
        this.eng = eng;
        this.resimId=resimId;
        this.sesId=sesId;

    }

    public language()
    {
    }

    public int getResimId() {
        return resimId;
    }

    public void setResimId(int resimId) {
        this.resimId = resimId;
    }

    public int getSesId() {
        return sesId;
    }

    public void setSesId(int sesId) {
        this.sesId = sesId;
    }

    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }

    public String getEng() {
        return eng;
    }

    public void setEng(String eng) {
        this.eng = eng;
    }
}
