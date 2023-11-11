import java.net.ServerSocket;
import java.io.IOException;

public class SimpleHTTPServer {

    public static void main(String[] arguments) {
	try {
	    ServerSocket server = new ServerSocket(8000);
	}
	catch (IOException exception) {
	    exception.printStackTrace();
	}
    }

}
