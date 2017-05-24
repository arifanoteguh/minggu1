package arifanoteguhwicaksono.pkg10114134.encapintegration;

public class Pendataan extends Pekerjaan implements Info{
    Pekerjaan kerja = new Pekerjaan();
    Manusia org = new Manusia();
    short waktu;
    byte jam;

    @Override
    void kerjaLembur(){
        System.out.print("Lembur? [Y/T]: ");
        ceklembur2=input.nextLine();
        ceklembur = "Y".equals(ceklembur2);
    }
	
    @Override
    void jumlahLembur(){
        System.out.print("Lama Lembur dalam Jam : ");
        super.jam=input.nextByte();
        gajilembur=super.jam*lembur;
    }
    
    @Override
    public void dataUtama() {
        System.out.println("Pendataan");
    }

    @Override
    public void dataKedua() {
        System.out.println("Data Gaji");
    }
    
    @Override
    public void info(){
        System.out.println("Total Gaji");
    }
    
    Pendataan(){
        super.jam+=1;
    }

    public static void main(String argv[]){
        Pendataan penggaji = new Pendataan();
        Info inface = new Pendataan();

        inface.dataUtama();
        penggaji.methodInput();
        penggaji.methodInput("Mahasiswa");

        inface.dataKedua();
        penggaji.terimaGaji();
        penggaji.kerjaLembur();
        if(penggaji.ceklembur){
                penggaji.upahLembur();
                penggaji.jumlahLembur();
        }
        System.out.println("=======================================");
        inface.info();
        penggaji.getGajiTotal();
    }

    private void methodInput(){
        org.Manusia();
        org.setBerumur();
        org.jenisKelamin();
    }
    private void methodInput(String jenis){
        kerja.bekerjaSebagai();
    }
}