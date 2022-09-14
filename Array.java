import java.util.HashMap;

class Array {
  

  public static void main(String[] args) {

      //int[] nilai_mahasiswa = {80, 36, 43, 67, 93, 90};

      //System.out.println(nilai_mahasiswa[0]);
      //System.out.println(nilai_mahasiswa.length);

     // for(int i = 0; i < nilai_mahasiswa.length - 1; i++){
     //   System.out.println(nilai_mahasiswa[1]);
     //  }

    HashMap<String, String > Data_Mahasiswa_1
      = new HashMap<String, String>();

    Data_Mahasiswa_1.put("Nama", "Emery");
    Data_Mahasiswa_1.put("NIK", "E34");
    Data_Mahasiswa_1.put("HP", "samsung");

    System.out.println(Data_Mahasiswa_1.get("Emery"));
  }
}