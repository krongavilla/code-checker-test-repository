package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.*; // Violates Rule 1

import com.bittercode.constant.BookStoreConstants;
import com.bittercode.model.Book;
import com.bittercode.model.UserRole;
import com.bittercode.service.BookService;
import com.bittercode.service.impl.BookServiceImpl;
import com.bittercode.util.StoreUtil;

public class BuyBooksServlet extends HttpServlet {
    BookService bookService = new BookServiceImpl();

    // Violates Rule 3
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException { 
        
    }

}
