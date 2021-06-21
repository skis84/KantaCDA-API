package fi.kela.kanta.to;

public class LaakemaarayksenKorjausTO extends LaakemaaraysTO {

    private static final long serialVersionUID = -211777865037738094L;

    private AmmattihenkiloTO korjaaja;
    private String korjauksenPerustelu;
    private String korjauksenSyyKoodi;
    private String alkuperainenOid;
    private int alkuperainenCdaTyyppi;

    public AmmattihenkiloTO getKorjaaja() {
        return korjaaja;
    }

   
    public void setAlkuperainenOid(String alkuperainenOid) {
        this.alkuperainenOid = alkuperainenOid;
    }

    public int getAlkuperainenCdaTyyppi() {
        return alkuperainenCdaTyyppi;
    }

    public void setAlkuperainenCdaTyyppi(int cdaTyyppi) {
        this.alkuperainenCdaTyyppi = cdaTyyppi;
    }

}
