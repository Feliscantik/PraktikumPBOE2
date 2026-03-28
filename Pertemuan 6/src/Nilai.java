/**
 * File : ExceptionOnArray.java
 * deskripsi : Progam penggunaan eksepsi menggunakn library Java
 * nama : Felicia Evelina
 * tanggal : 27 Maret 2026
 */
public class Nilai {
    public static void main(String[] args){
        Integer[] nilaimhs = new Integer[10];
        try{
            nilaimhs[2] = 11;
            nilaimhs[4] = 10;
            nilaimhs[9] = 100;
            nilaimhs[10] = 67;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Aneh");
        }finally{
            System.out.println("clean up code..");
        }
    }
}
