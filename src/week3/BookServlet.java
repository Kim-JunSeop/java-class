package week3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import static week3.Book.*;

@WebServlet(name = "BookServlet", value = "/week3/BookServlet")
public class BookServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        showBookList(out);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Book book = new Book();
            book.createBook(Integer.parseInt(request.getParameter("id")),
                    request.getParameter("name"), request.getParameter("publish"), Integer.parseInt(request.getParameter("price")));
            addBookToList(book);
        } catch (NumberFormatException e) {
            out.println("<html>");
            out.println("<head><title>도서 목록</title></head>");
            out.println("<body>");
            out.println("<h2 style=>입력한 값을 확인해주세요.</h2>");
            out.println("</body></html>");
        }
        showBookList(out);
    }

    private void showBookList(PrintWriter out) {
        out.println("<html>");
        out.println("<body>");
        out.println("<h2><도서 정보 데이터의 초기화 내용></h2>");
        out.println("<table border= >");
        out.println("<th>도서번호</th>");
        out.println("<th>도서이름</th>");
        out.println("<th>출판사</th>");
        out.println("<th>가격</th>");
        for (int i = 0; i < idList.size(); i++) {
            out.println("<tr>");
            out.println("<td>" + idList.get(i) + "</td>");
            out.println("<td>" + nameList.get(i) + "</td>");
            out.println("<td>" + publishList.get(i) + "</td>");
            out.println("<td>" + priceList.get(i) + "</td>");
            out.println("</tr>");
        }
        out.println("<table>");
        out.println("</body></html>");
    }

    private void addBookToList(Book book) {
        idList.add(book.getId());
        nameList.add(book.getBookName());
        publishList.add(book.getPublish());
        priceList.add(book.getPrice());
    }
}