package washington;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@WebServlet("/washington")
public class Timewashington extends HttpServlet {
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter1=resp.getWriter();
                     ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Etc/GMT+4"));
           printWriter1.println(dateTime+"America/Washington");
        printWriter1.close();
    }
}
