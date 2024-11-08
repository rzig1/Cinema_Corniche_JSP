package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ajouter_0020client_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("  <meta charset=\"UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("  <link rel=\"icon\" href=\"logobg.jpg\" type=\"image/x-icon\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("    @import url('https://fonts.googleapis.com/css2?family=Montserrat:wght@400;700&display=swap');\n");
      out.write("\n");
      out.write("\n");
      out.write("*{\n");
      out.write("  color: #3C3C3E;\n");
      out.write("}\n");
      out.write("body{\n");
      out.write("    background-color: #D9D9D9;\n");
      out.write("    font-family: 'Montserrat', sans-serif;\n");
      out.write("    width: 100%;\n");
      out.write("    height: 100vh;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("ul{\n");
      out.write("    color: aliceblue;\n");
      out.write("}\n");
      out.write("li{\n");
      out.write("    color: aliceblue;\n");
      out.write("}\n");
      out.write(".grid-container{\n");
      out.write("    display: grid;\n");
      out.write("    grid-template-columns: auto auto auto auto auto auto;\n");
      out.write("    gap: 10px;\n");
      out.write("}\n");
      out.write(".item-1{\n");
      out.write("    grid-column: 1;\n");
      out.write("    justify-content: center;\n");
      out.write("    text-align: center;\n");
      out.write("    margin: 0px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".item-22{\n");
      out.write("  grid-column: span  2/5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item-3{\n");
      out.write("  grid-column: 5 /6 ;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".item-4{\n");
      out.write("    grid-column:  6;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write(".item-2{\n");
      out.write("  grid-column: span 2/ 6;\n");
      out.write(" \n");
      out.write("  \n");
      out.write("}\n");
      out.write(".item-5{\n");
      out.write("  grid-column: 6;\n");
      out.write("}\n");
      out.write(".navbar {\n");
      out.write("    overflow: hidden;\n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar a {\n");
      out.write("    \n");
      out.write("    display: block;\n");
      out.write("    color: #3C3C3E;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 14px 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("    font-size: 10px;\n");
      out.write("    box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".card {\n");
      out.write("    width: 130px;\n");
      out.write("    height: 130px;\n");
      out.write("    background: #D9D9D9;\n");
      out.write("    position: relative;\n");
      out.write("    display: flex;\n");
      out.write("    place-content: center;\n");
      out.write("    place-items: center;\n");
      out.write("    overflow: hidden;\n");
      out.write("    border-radius: 20px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .card h2 {\n");
      out.write("    z-index: 1;\n");
      out.write("    color: #3C3C3E;\n");
      out.write("    font-size: 1em;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .card::before {\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    width: 100px;\n");
      out.write("    background-image: linear-gradient(180deg, #3C3C3E, rgb(60, 60, 62));\n");
      out.write("    height: 130%;\n");
      out.write("    animation: rotBGimg 3s linear infinite;\n");
      out.write("    transition: all 0.2s linear;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  @keyframes rotBGimg {\n");
      out.write("    from {\n");
      out.write("      transform: rotate(0deg);\n");
      out.write("    }\n");
      out.write("  \n");
      out.write("    to {\n");
      out.write("      transform: rotate(360deg);\n");
      out.write("    }\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  .card::after {\n");
      out.write("    content: '';\n");
      out.write("    position: absolute;\n");
      out.write("    background: #D9D9D9;\n");
      out.write("    ;\n");
      out.write("    inset: 5px;\n");
      out.write("    border-radius: 15px;\n");
      out.write("  }  \n");
      out.write("  /* .card:hover:before {\n");
      out.write("    background-image: linear-gradient(180deg, rgb(81, 255, 0), purple);\n");
      out.write("    animation: rotBGimg 3.5s linear infinite;\n");
      out.write("  } */\n");
      out.write("section{\n");
      out.write("  margin: 10px;\n");
      out.write("  \n");
      out.write("\n");
      out.write("}\n");
      out.write("img{\n");
      out.write("  max-width: 100%;\n");
      out.write("  height: auto;\n");
      out.write("}\n");
      out.write("  \n");
      out.write(".pc{\n");
      out.write("  padding: 19px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write(".study{\n");
      out.write("  padding: 19px;\n");
      out.write("  grid-column: 2/8;\n");
      out.write("}\n");
      out.write(".item-11{\n");
      out.write("\n");
      out.write("  grid-column: 1/4;\n");
      out.write("    justify-content: center;\n");
      out.write("    text-align: left;\n");
      out.write("    margin: 0px;\n");
      out.write("}\n");
      out.write(".containerf {\n");
      out.write("  max-width: 1200px;\n");
      out.write("  margin: 0 auto;\n");
      out.write("  padding: 20px;\n");
      out.write("}\n");
      out.write(".circle-img {\n");
      out.write("  display: inline-block;\n");
      out.write("  border-radius: 50%;\n");
      out.write("  padding: 5px;\n");
      out.write("  background: #D9D9D9;\n");
      out.write("  box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);\n");
      out.write("}\n");
      out.write(".circle-img img {\n");
      out.write("  width: 100px;\n");
      out.write("  height: 100px;\n");
      out.write("}\n");
      out.write(".footer-desc {\n");
      out.write("  display: inline-block;\n");
      out.write("  vertical-align: top;\n");
      out.write("  margin-left: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("section {\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("      height: 100vh;\n");
      out.write("      margin: 0;\n");
      out.write("    }\n");
      out.write("    .grid-containerS {\n");
      out.write("      width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .button-container {\n");
      out.write("      display: flex;\n");
      out.write("      flex-direction: column;\n");
      out.write("      align-items: center;\n");
      out.write("      padding: 60px;\n");
      out.write("      overflow: hidden;\n");
      out.write("      border-radius: 20px;\n");
      out.write("      box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);\n");
      out.write("      padding: 14px;\n");
      out.write("      background-color: #D9D9D9;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .button-container button {\n");
      out.write("      margin-bottom: 10px;\n");
      out.write("      background-color: #D9D9D9;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      padding: 10px;\n");
      out.write("      cursor: pointer;\n");
      out.write("    }\n");
      out.write("    .button-container button:hover {\n");
      out.write("      background-color: #A9A9A9; /* Couleur différente au survol */\n");
      out.write("    }\n");
      out.write("    .button-container button:focus {\n");
      out.write("      outline: none; /* Supprime la bordure de focus par défaut */\n");
      out.write("      background-color: #A9A9A9; /* Couleur différente pour le focus */\n");
      out.write("    }\n");
      out.write("    form {\n");
      out.write("      max-width: 400px;\n");
      out.write("      margin: 20px auto;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    label {\n");
      out.write("      display: block;\n");
      out.write("      margin-bottom: 8px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input {\n");
      out.write("      width: 100%;\n");
      out.write("      padding: 8px;\n");
      out.write("      margin-bottom: 16px;\n");
      out.write("      box-sizing: border-box;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .buttonForm {\n");
      out.write("      background-color: #A9A9A9;\n");
      out.write("      color: #3C3C3E;\n");
      out.write("      padding: 10px 15px;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      cursor: pointer;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("  <title>Ajouter Client</title>\n");
      out.write("</head>\n");
      out.write("     <body>\n");
      out.write("  \n");
      out.write("  <nav class=\"container-fluid\" style=\"box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);padding: 4px;\">\n");
      out.write("    <div class=\"grid-container\">\n");
      out.write("      <div class=\"item-1\" style=\"color: aliceblue;\">\n");
      out.write("      <div class=\"card\">\n");
      out.write("        <a target=\"_self\" href=\"index.html\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <img src=\"logo.png\" alt=\"logo\" style=\"width: auto; z-index: 1; height: auto;\">\n");
      out.write("          </div>\n");
      out.write("        </a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"item-22 navbar\" style=\"justify-self:baseline;\">\n");
      out.write("        <ul  style=\"list-style-type: none; text-decoration: none; align-items: center;\">\n");
      out.write("            <li style=\"display: inline-block; ;\"><a href=\"espace ticket.html\">Espace Ticket</a></li>\n");
      out.write("            <li style=\"display: inline-block;\"><a href=\"espace client.html\">Esapce Client</a></li>\n");
      out.write("            <li style=\"display: inline-block;\"><a href=\"espace film.html\">Espace Film</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"item-3 navbar \">\n");
      out.write("        <ul style=\" text-decoration: none; list-style-type: none; \">\n");
      out.write("          <li style=\"display: inline-block;\">\n");
      out.write("            <a target=\"_self\" href=\"contact\">\n");
      out.write("              Contact\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"item-4 navbar \" style=\"justify-self: baseline;\">\n");
      out.write("        <ul style=\" text-decoration: none; list-style-type: none; \">\n");
      out.write("          <li style=\"display: inline-block;\">\n");
      out.write("            <a target=\"_blank\" class=\"\" href=\"https://www.facebook.com\">\n");
      out.write("              <img src=\"Facebook.svg\" alt=\"facebook-icon\">\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li style=\"display: inline-block;\">\n");
      out.write("            <a target=\"_blank\" href=\"https://instagram.com/\">\n");
      out.write("              <img src=\"Instagram.svg\" alt=\"instagram-icon\">\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("         \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</nav> \n");
      out.write("<section style=\"width: 100%;\">\n");
      out.write("    <div class=\"grid-containerS container p-2\">\n");
      out.write("        <div class=\"button-container\">\n");
      out.write("            <h4> Client ajouter avec succés</h4>\n");
      out.write("            <form action=\"ajouter client.jsp\" method=\"post\">\n");
      out.write("                \n");
      out.write("                <label for=\"Nomp\">Nom :</label>\n");
      out.write("                <input type=\"text\" id=\"Nomp\" name=\"Nomp\" required>\n");
      out.write("            \n");
      out.write("                <label for=\"Prenomp\">Prénom :</label>\n");
      out.write("                <input type=\"text\" id=\"Prenomp\" name=\"Prenomp\" required>\n");
      out.write("            \n");
      out.write("                <label for=\"Datec\">Date de naissance :</label>\n");
      out.write("                <input type=\"date\" id=\"Datec\" name=\"Datec\" required>\n");
      out.write("            \n");
      out.write("                <label for=\"Cin\">CIN :</label>\n");
      out.write("                <input type=\"text\" id=\"Cin\" name=\"Cin\" required>\n");
      out.write("            \n");
      out.write("                <label for=\"Ademailc\">Adresse email :</label>\n");
      out.write("                <input type=\"email\" id=\"Ademailc\" name=\"Ademailc\" required>\n");
      out.write("            \n");
      out.write("                <button type=\"submit\">Insérer Client</button>\n");
      out.write("              </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("</section>\n");
      out.write(" ");

    String NomP = request.getParameter("Nomp");
    String PrenomP = request.getParameter("Prenomp");
    String Datec = request.getParameter("Datec");
    String Cin = request.getParameter("Cin");
    String Ademailc = request.getParameter("Ademailc");
    String requette = "insert into client values (null,'" + NomP + "','" + PrenomP + "','" + Datec + "','" + Cin + "','" + Ademailc + "')";
    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion?useSSL=false", "root", "admin");
        Statement St = connection.createStatement();
        St.executeUpdate(requette);
    } catch (Exception e) {
        System.out.println(e.toString());
    }
 
      out.write("\n");
      out.write("<footer>\n");
      out.write("  <div class=\"container-fluid\" id=\"contact\"  style=\"box-shadow: 0 3px 10px rgb(0 0 0 / 0.2);padding: 4px;\">\n");
      out.write("    <div style=\"margin: 0px auto; padding: 13px; display: flex; width: 30%;\">\n");
      out.write("      <div class=\"circle-img\">\n");
      out.write("        <img src=\"logo.png\" alt=\"Contact\" style=\"width: 100%;\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"footer-desc\">\n");
      out.write("        <h3>Contactez-nous</h3>\n");
      out.write("        <p>+216 99535357</p>\n");
      out.write("        <p>cinemaelcorniche@gmail.com</p>\n");
      out.write("      </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
