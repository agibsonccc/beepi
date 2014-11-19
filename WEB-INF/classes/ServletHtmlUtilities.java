
/**
 * Created by yukatherin on 11/18/14.
 */
public class ServletHtmlUtilities {

    public static void fillHead(java.io.PrintWriter out) {
        out.println("<head>");

        out.println("<title>Jeep Grand Cherokee 2012</title>");

        out.println("<style type='text/css'>");
        out.println("body {\n" +
                "    color: #333;\n" +
                "    font-family: Verdana,Arial,Helvetica,sans-serif;\n" +
                "    font-size: 100%;\n" +
                "    line-height: 1em;\n" +
                "}");
        out.println("reviewBody {\n" +
                "    color: #111;\n" +
                "    font-family: Verdana,Arial,Helvetica,sans-serif;\n" +
                "    font-size: 85%;\n" +
                "    line-height: 1.5em;\n" +
                "}");

        out.println("img {\n" +
                "    border-left: 10 none;\n" +
                "    margin: 0 auto;" +
                "    padding: 10px 10px 10px 10px;\n" +
                "}");

        out.println(".bx-wrapper div.slide {\n" +
                "    margin: 0 auto;\n" +
                "    padding: 15 70 15 70\n" +
                "}");


        out.println("</style>");

        out.println("<script src='http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js'></script>");

        out.println("</head>");
    }


}

