// STREAM of data-  flow of data.
//! byte Stream - Data is broken into bytes and then it is sent byte-by-by.
/*  java provide - 1) Byte Stream class , character Stream class.
 *Byte stream contain classes like - InputStream , OutputStream
 *Character stream contain classes like - Reader , Writer.
 */

/* METHOD present in InputStream class -> 
 *    int read() , int aviable() , long skip(), 
 *  void mark(int limit) , void reset() , void close() 
 */
/*  METHOD present in OutputStream class
 *  void write() , void flush() , void close()
 */

import java.io.FileOutputStream;
import java.io.*;

import javax.print.DocFlavor.STRING;

class IOstream {
    public static void main(String[] args) {
        //! TO write something on the file.
        try{
            FileOutputStream fos = new FileOutputStream("C:/Users/delll/OneDrive/Desktop/JAVA");
            String str = "HEllo this content will be written via fileOutputStream";
            fos.write(str.getBytes());

            fos.close();
        }
        catch(IOException e){System.out.println(e);}
    }
}
