public class Auto {

    private String nev;
    private String rendszam;
    private int ev;

    public Auto(String nev,String rendszam,int ev)
    {
        this.nev=nev;
        this.rendszam=rendszam;
        this.ev=ev;
    }

    public String getNev(){
        return title;
    }
    
    public void setNev(string nev)
    {
        this.nev=nev;
    }

    public String getNev()
    {
        return title;
    }
    
    public void setRendszam(string rendszam)
    {
        this.rendszam=rendszam;
    }

    public int getEv()
    {
        return ev;
    }

    public void setEv(int ev)
    {
        this.ev=ev;
    }

    @Override
    public String toString(){
        return nev+ ","+rendszam+ ","+ev;
    }
}