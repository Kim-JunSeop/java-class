package week3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import static week3.Book.*;

@WebServlet(name = "BookServlet", value = "/Book")
public class BookServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @WebServlet(description = "bookServlet", urlPatterns = {"/Book"})
    public class bookServlet extends HttpServlet {
        private static final long serialVersionUID = 1L;

        public bookServlet() {
            super();
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            response.setContentType("text/html; charset=utf-8");
            request.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head></head>");
            out.println("<body>");
            out.println("<h1>목록</h1>");
            out.println("<table border=" + 1 + "cellspacing=" + 0 + ">");
            out.println("<th>도서번호</th>");
            out.println("<th>도서이름</th>");
            out.println("<th>출판사</th>");
            out.println("<th>가격</th>");


            for (int i = 0; i < idList.size(); i++) {
                out.print("<tr><td>" + idList.get(i) +
                        "</td><td>" + nameList.get(i) +
                        "</td><td>" + publishList.get(i) +
                        "</td><td>" + priceList.get(i) + "</td></tr>");
            }
            out.println("<table>");
            out.println("</body></html>");
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {

            response.setContentType("text/html; charset=utf-8");
            request.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();

            Book book = new Book();
            book.createBook(Integer.parseInt(request.getParameter("id")), request.getParameter("name"),
                    request.getParameter("publish"), Integer.parseInt(request.getParameter("price")));

            addBookToList(book);
            out.println("<html>");
            out.println("<head></head>");
            out.println("<body>");
            out.println("<h1>목록</h1>");
            out.println("<table border=" + 1 + "cellspacing=" + 0 + ">");
            out.println("<th>도서번호</th>");
            out.println("<th>도서이름</th>");
            out.println("<th>출판사</th>");
            out.println("<th>가격</th>");

            for (int i = 0; i < idList.size(); i++)
            {
                out.println("<tr>");
                out.println("<td>" + idList.get(i) + "</td>");
                out.println("<td>" + nameList.get(i) + "</td>");
                out.println("<td>" + publishList.get(i) + "</td>");
                out.println("<td>" + priceList.get(i) + "</td>");
                out.println("</tr>");
            }
            out.println("</table >");
            out.println("</body></html>");
        }

        private void addBookToList(Book book) {
            idList.add(book.getId());
            nameList.add(book.getBookName());
            publishList.add(book.getPublish());
            priceList.add(book.getPrice());
        }
    }
}