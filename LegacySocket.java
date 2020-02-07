import java.net.ServerSocket;
import java.net.Socket;

/**
 * Legacy Socket Implementation
 * @author ashish
 */
public class LegacySocket {
    public static void main(String[] args) {
        try(ServerSocket serverSocket=new ServerSocket(8888))
        {
            boolean running=true;
            while (running)
            {
                Socket clientSocket=serverSocket.accept();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
