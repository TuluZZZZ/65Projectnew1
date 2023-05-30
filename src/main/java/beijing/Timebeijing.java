package beijing;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;

@WebServlet("/beijing")
public class Timebeijing extends HttpServlet {
       @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter2=resp.getWriter();
                     ZonedDateTime dateTime1 = ZonedDateTime.now(ZoneId.of("Etc/GMT-8"));
           printWriter2.println(dateTime1+"China/Beijing");
        printWriter2.close();
    }
}
