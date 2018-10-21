package ua.com.prog.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/qwestionservlet")
public class Serv extends HttpServlet {

    static final String TEMPLATE ="<html>" +
            "<head><title>VladGual</title></head>" +
            "<body>" +
            "<h1>Hello %s%s%s%s </h1>" +
            "<h1>Your age is%s%s</h1>" +
            "<h2>Statistics answers of qwestions is</h2>" +
            "<h2>%s</h2>" +
            "<h2>%s</h2>" +
            "<h2>%s</h2>" +
            "</body></html>";

    static final int QWESTION_1_YES = 0;
    static final int QWESTION_1_NO = 1;
    static final int QWESTION_2_YES = 2;
    static final int QWESTION_2_NO = 3;
    static final int QWESTION_3_YES = 4;
    static final int QWESTION_3_NO = 5;

    static final int[] statistics = new int[6];

    @Override
    public void doGet(HttpServletRequest req,
                      HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        int age = Integer.parseInt(req.getParameter("age"));

        int ans1 = req.getParameter("question1").equals("yes")?QWESTION_1_YES:QWESTION_1_NO;
        int ans2 = req.getParameter("question2").equals("yes")?QWESTION_2_YES:QWESTION_2_NO;
        int ans3 = req.getParameter("question3").equals("yes")?QWESTION_3_YES:QWESTION_3_NO;

        statistics[ans1]++;
        statistics[ans2]++;
        statistics[ans3]++;

        String ansstr1 = "Qwestion 1 YES is " + statistics[0] + " times NO is " + statistics[1] + " times";
        String ansstr2 = "Qwestion 2 YES is " + statistics[2] + " times NO is " + statistics[3] + " times";
        String ansstr3 = "Qwestion 3 YES is " + statistics[4] + " times NO is " + statistics[5] + " times";

        PrintWriter pw = resp.getWriter();
        pw.print(String.format(TEMPLATE," ",name," ",surname," ",age,ansstr1,ansstr2,ansstr3));
    }
}
