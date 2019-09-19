import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscount", urlPatterns = "/product")
public class ProductDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        Float price = Float.parseFloat(request.getParameter("price"));
        Float percent = Float.parseFloat(request.getParameter("percent"));

        Float amount = price*percent/100;

        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h2>Product Discount Calculator<h2>");
        writer.println("Product Description: "+ product +"<br>" );
        writer.println("List Price: "+ price+ "<br>");
        writer.println("Discount Percent: "+ percent+ "<br>");
        writer.println("Discount Amount: "+ amount+ "<br>");
        writer.println("Discount Price: "+ (price- amount) + "<br>");
        writer.println("<html>");


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
