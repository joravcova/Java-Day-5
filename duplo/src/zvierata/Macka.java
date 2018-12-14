package zvierata;

import java.util.Date;

public class Macka extends Cicavec {
    protected String meno;
    protected int vek;
    public Macka (){

    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public boolean jeVekspravny (){
        if (new Date().getYear() - this.datumNarodenia.getYear()== this.vek){
            return true;
        }else {
            return false;

        }
    }
    public Macka(Date datumNarodenia, String meno) {
        super(datumNarodenia);
        this.meno = meno;
    Date aktualny = new Date();
    this.vek = aktualny.getYear() - datumNarodenia.getYear();
    }
    @Override
    public void napisCoSom() {
        System.out.println("Mnau mnau Som macka a mam " + vek + "rokov");
    }
}
