/**
 * @author SSene - Suzette Senephansiri
 * CIS175 - Spring 2022
 * Feb 9, 2022
 */

package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CoffeeMenu;

/**
 * Servlet implementation class getOrderServlet
 */
@WebServlet("/getOrderServlet")
public class getOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String customerName = request.getParameter("customerName");
		String drinkOrder = request.getParameter("orderMenu");
		
		CoffeeMenu customerOrder = new CoffeeMenu(customerName, drinkOrder);
		
		request.setAttribute("coffeeOrder", customerOrder);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
