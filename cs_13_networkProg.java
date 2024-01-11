
/* server side- 
 * 
 * ServerSocket class in java : to develop server software.
 * no. of client == no. of socket in server.
 * to enstablish connection: accept(){create a socket of server.} of ServerSocket class is used.
 *  inputStream class - requred. - that is connected to outputStream of client -{to receive data from client.}
 *  outputStream class - requred. - that is connected to inputStream of client -{to send data to client.}
 * 
 */
//COMMUNICATION -  when a client is sending  some data{by WRITING on outputStream } server will READ through inputStream.
//                 & when server WRITE something on outputStream - CLIENT will READ into inputStream
/* client side- 
 * for a client to connect with server - IP, port no. of server is required.
 *  Socket class in java : to develop client software
 * 
 *  inputStream class - to read from server.
 *  outputStream class - to send data to server.
 */



public class cs_13_networkProg {
    
}
