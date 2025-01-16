import java.io.File;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import servlets.HelloServlet;


public class App {
    public static void main(String[] args) throws LifecycleException  {
        
        
        Tomcat tomcat = new Tomcat(); // tomcat server object
        tomcat.setPort(8080); // set port for tomcat
        tomcat.getConnector(); // cretae HTTP connection with port number

        // Add base url for the server
        Context ctx =  tomcat.addWebapp("api/", new File("build/webapp").getAbsolutePath());

        // Add Servlet
        Tomcat.addServlet(ctx, "HelloServlet", new HelloServlet());
        // Add URL Pattern To The Added Servlet
        ctx.addServletMappingDecoded("/hi", "HelloServlet");

        // Start Tomcat Server
        tomcat.start();

        System.out.println("Tomcat server started on http://localhost:8080");

        // Blocks the main thread and keeps Tomcat running, If not program stops by exeuting remaining statements immediatly and server also stops running.
        tomcat.getServer().await();

    }  
}
