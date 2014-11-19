// import org.apache.solr.client.solrj.SolrQuery;
// import org.apache.solr.client.solrj.SolrServer;
// import org.apache.solr.client.solrj.SolrServerException;
// import org.apache.solr.client.solrj.impl.HttpSolrServer;
// import org.apache.solr.client.solrj.response.QueryResponse;

import javax.servlet.*;
import javax.servlet.http.*;
public class JeepGrandCherokeeServlet extends HttpServlet {
    /** Handle the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     */

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, java.io.IOException {
        response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();

//        String urlString = "http://localhost:8983/solr/review2";
//        SolrServer solr = new HttpSolrServer(urlString);
//        SolrQuery parameters = new SolrQuery();
//        parameters.set("q", "jeep");
//        try {
//            QueryResponse solrResponse = solr.query(parameters);
//            out.println(solrResponse.getResults().toString());
//        } catch (SolrServerException e) {
//            out.println(e.getStackTrace());
//        }


        String edmundsImg="<img src='https://www.beepi.com/images/press/logos/Edmunds.png' alt='Edmunds' width='100' height='30'>";
        String carAndDriverImg="<img src='https://www.beepi.com/images/press/logos/CarAndDriver.png' alt='CarAndDriver' width='100' height='30'><br>";
        String expertText1CarAndDriver = "<reviewBody>The Grand Cherokee excels at climbing mountains and social circles. It offers a wealth of powertrains: a 3.6-liter V-6, a 5.7-liter Hemi V-8, a 3.0-liter turbo-diesel, and the SRT variant’s 6.4-liter Hemi V-8. There’s a choice of three 4x4 systems plus Quadra-Lift air suspension with five height settings. Comfortable interiors are trimmed with high-quality materials and offer upscale options Read more...</reviewBody> ";
        String expertText2Edmunds ="<reviewBody>The 2012 Jeep Grand Cherokee reminds us of Rocky Balboa (the pre-Ivan Drago fight one), having made the transition from underdog to top contender. Prior to last year's complete overhaul, the Grand Cherokee offered rugged off-road capability but a substandard cabin, substandard passenger space and an underpowered but thirsty V6. But the 2012 Grand Cherokee, with its well-trimmed and roomier interior, powerful V6 and more refined performance and ride, is in fighting shape as a top contender among midsize SUVs. </reviewBody> ";
        String userReview1= "<reviewBody> user review 1 </reviewBody>";

        out.println("<html>");
        /* css */
        ServletHtmlUtilities.fillHead(out);

        /* body */
        out.println("<body bgcolor=#ffeeff>");
        out.println("<b>Should you own a 2012 Jeep Grand Cherokee?</b><br><br>");


        out.println("<script src='js/jquery.bxslider.min.js'></script>");
        out.println("<link href=\"/lib/jquery.bxslider.css\" rel=\"stylesheet\" />");

        out.println("<script type=\"text/javascript\">\n" +
                "  $(document).ready(function(){\n" +
                "    $('#slider1').bxSlider({" +
                "     fade:true," +
                "     adaptiveHeight: false," +
                "     slideWidth: 700" +
                "});\n" +
                "\n" +
                "  });</script>");



        out.println("                  <div id=\"slider1\">\n" +
                "                    <div class=\"slide\">\n" +
                                       carAndDriverImg + expertText1CarAndDriver+"\n"+
                "                    </div>\n" +
                "                    <div class=\"slide\">\n" +
                                        edmundsImg+expertText2Edmunds+"\n" +
                "                    </div>\n" +
                "                    <div class=\"slide\">\n" +
                                        userReview1+"\n"+
                "                    </div>\n" +
                "                  </div>");


        out.println("</body>");
        out.println("</html>");


        out.close();
    }
}




