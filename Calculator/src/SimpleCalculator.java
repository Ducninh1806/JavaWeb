import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleCalculator", urlPatterns = "/operator")
public class SimpleCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        float firstOperator = Float.parseFloat(request.getParameter("firstOperator"));
        float secondOperator = Float.parseFloat(request.getParameter("secondOperator"));
        char operator = request.getParameter("operator").charAt(0);

        out.println("<html>");
        out.println("<h2>Result<h2>");
        try {
            float result = Calculator.calculate(firstOperator,secondOperator,operator);
            out.println(firstOperator+" "+ operator+ " "+secondOperator+" = " +result);
        }catch (Exception ex){
            out.println("Error: "+ ex.getMessage());
        }
        out.println("<html>");


    }
}
