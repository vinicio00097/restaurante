package gt.com.restaurante.svlt;

import gt.com.restaurante.servicios.OrdenesService;
import gt.com.restaurante.utils.ExportOrders;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Exportar",urlPatterns = {"/Exportar"})
public class ExportsServlets extends HttpServlet {
    private final OrdenesService ordenesService=new OrdenesService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("docType")!=null){
            switch (req.getParameter("docType")){
                case "json":
                    ExportOrders.toExport(resp,ordenesService,req.getParameter("idOrder"),req.getParameter("docType"));
                    break;
                case "xml":
                    ExportOrders.toExport(resp,ordenesService,req.getParameter("idOrder"),req.getParameter("docType"));
                    break;
                case "txt":
                    ExportOrders.toExport(resp,ordenesService,req.getParameter("idOrder"),req.getParameter("docType"));
                    break;
            }
        }
    }
}
