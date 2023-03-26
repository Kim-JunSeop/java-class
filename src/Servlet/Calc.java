package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Calc", value = "/calc")
public class Calc extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        out.append("<!doctype html><html><head><title>Hello World Servlet</title> </head><body>");
        out.append(" <h2> Hello World !!</h2> <hr>");
        out.append("현재 날짜와 시간은: " + java.time.LocalDateTime.now());
        out.append("</body> </html> ");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        int num1, num2;
        int result;
        String op;
        response.setContentType("text/html; charset=euc-kr");
        PrintWriter out = response.getWriter();
        num1 = Integer.parseInt(request.getParameter("num1"));
        num2 = Integer.parseInt(request.getParameter("num2"));
        op = request.getParameter("operator");
        result = calc(num1, num2, op);
        out.println("<html>");
        out.println("<head><title>계산기</title></head>");
        out.println("<body><center>");
        out.println("<h2>계산 결과</h2>");
        out.println("<HR>");
        out.println(num1 + op + num2 + " = " + result);
        out.println("</body></html>");
    }

    public int calc(int num1, int num2, String op) {
        int result = 0;
        if (op.equals("+")) {
            result = num1 + num2;
        } else if (op.equals("-")) {
            result = num1 - num2;
        } else if (op.equals("*")) {
            result = num1 * num2;
        } else if (op.equals("/")) {
            result = num1 / num2;
        }
        return result;
    }
}
