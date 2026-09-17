public class Motor {
    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan:" + this.kecepatan);
        System.out.println("=========================");
    }

     public String getplatNomor() {
        return platNomor;
    }

    public void setplatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public boolean isIsMesinOn() {
        return isMesinOn;
    }

    public void setisMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }

    public int getkecepatan() {
        return kecepatan;
    }

    public void setkecepatan(int kecepatan) {
        if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        }
        else {
            this.kecepatan = kecepatan;
        }
        
    }
}