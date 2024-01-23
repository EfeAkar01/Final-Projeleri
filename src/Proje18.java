public class Proje18 {
    private int atmNo;

    public Proje18 (int atmNo) {
        this.atmNo = atmNo;
    }

    public int getAtmNo() {
        return atmNo;
    }

    public void setAtmNo(int atmNo) {
        this.atmNo = atmNo;
    }

    public void paraYatir(int miktar) {

        System.out.println(miktar + " TL para yatırıldı.");
    }

    public void paraCek(int miktar) {

        System.out.println(miktar + " TL para çekildi.");
    }

    public boolean kayitKontrol(int hesapNo, String sifre) {

        return true;
    }
}