import java.io.*;
class Lectura
{
   public static int readInt()
   {
      DataInputStream r = new DataInputStream(System.in);
      String g;
      try{
         g=r.readLine();
         }
         catch(IOException e){g="0";}
         int res=Integer.parseInt(g);
         return res;
       }
       public static char readChar()
       {
         DataInputStream r = new DataInputStream(System.in);
         String g;
         try{
         g=r.readLine();
         }
         catch(IOException e){g="0";}
         char res=g.charAt(0);
         return res;
       }
       public static byte readByte()
       {
         DataInputStream r = new DataInputStream(System.in);
         String g;
         try{
            g=r.readLine();
            }
            catch(IOException e){g="0";}
            byte res=Byte.parseByte(g);
            return res;
       }
       public static float readFloat()
       {
         DataInputStream r = new DataInputStream(System.in);
         String g;
         try{
            g=r.readLine();
            }
            catch(IOException e){g="0";}
            float res=Float.parseFloat(g);
            return res;
       }
       public static double readDouble()
       {
         DataInputStream r = new DataInputStream(System.in);
         String g;
         try{
            g=r.readLine();
            }
            catch(IOException e){g="0";}
            double res=Double.parseDouble(g);
            return res;
       }
       public static short readShort()
       {
         DataInputStream r = new DataInputStream(System.in);
         String g;
         try{
            g=r.readLine();
            }
            catch(IOException e){g="0";}
            short res=Short.parseShort(g);
            return res;
       }
       public static long readLong()
       {
         DataInputStream r = new DataInputStream(System.in);
         String g;
         try{
            g=r.readLine();
            }
            catch(IOException e){g="0";}
            long res=Long.parseLong(g);
            return res;
       }
       public static String readString()
       {
         DataInputStream r = new DataInputStream(System.in);
         String g;
         try{
            g=r.readLine();
            }
            catch(IOException e){g="0";}
            return g;
       }

      
     }

         