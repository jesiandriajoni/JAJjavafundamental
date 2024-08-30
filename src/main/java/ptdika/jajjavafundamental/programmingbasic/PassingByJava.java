package ptdika.jajjavafundamental.programmingbasic;

public class PassingByJava {
     public static void main(String[] args){
         int intX = 0;
         intX = getDataX();

         int intZ = "abc".length();
         System.out.println("abc".length());

         for(int i = 0; i< "abc".length(); i++){
         }

         System.out.println(intX);
         for(int i = 0; i < intX; i++){
         }

         if(intX>10){

         }

         String strX = "980198340918382973498";


     }

     private static Integer getDataX(){
        return ((10*8)-2)+6;
     }
}
