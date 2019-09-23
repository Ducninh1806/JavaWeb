package QuanLyKhachHang.Controller;

import QuanLyKhachHang.Model.Customer;
import QuanLyKhachHang.Service.CustomerService;
import QuanLyKhachHang.Service.CustomerServicelmpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServicelmpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

    }
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{


    }




}
