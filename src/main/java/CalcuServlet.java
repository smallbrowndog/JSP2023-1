

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcuServlet
 */
@WebServlet("/CalcuServlet")
public class CalcuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		String op = request.getParameter("op");
		int result = 0;
		
		// 스위치문을 작성할때 break를 작성하지 않으면 정상적으로 코드가 작동하지 않는다
		switch(op) {
		case "+" : result = n1 + n2;
		break;
		case "-" : result = n1 - n2;
		break;
		case "*" : result = n1 * n2;
		break;
		case "/" : result = n1 / n2;
		break;
		case "^" : result = n1 ^ n2;
		break;
		}
		
		response.getWriter().append("Served at : ").append(request.getContextPath());
		response.setContentType("text/html; charset = utf-8");
		PrintWriter out = response.getWriter();
		out.append("<html><body><h2> Calculcator Servlet Display </h2><hr>");
		
		out.append("Result is : " + n1 + op + n2 + "=" + result + "</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
