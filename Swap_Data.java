class Swap_data {
  
  public static void main(String[] args) {
    int a = 1;
    int b = 2;

    System.out.println ("Isi Variabel A sebelum di swap");
    System.out.println ("A = "+ a);

    System.out.println ("Isi Variabel B sebelum di swap");
    System.out.println ("B = "+ b);

    int temp;

    temp = a;
    temp = b;
    System.out.println ("Isi Variabel Temp");
    System.out.println (temp);

    a = b;
    System.out.println ("Isi Variabel A");
    System.out.println ("A = "+ a);

    b = a;
    System.out.println ("Isi Variable B");
    System.out.println ("B = "+ b);
  }
     
}