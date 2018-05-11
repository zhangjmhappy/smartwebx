
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
* @Description:    java类作用描述
* @Author:         administrator
* @CreateDate:     2018/5/6 14:41
* @UpdateUser:     zhangjianming
* @UpdateDate:     2018/5/6 14:41
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("hello");

        resp.setCharacterEncoding("utf-8");
        resp.getWriter().print("哈哈哈哈");



    }

    /**
    * 方法实现说明
    * @author      作者姓名
    * @param null
    * @return      
    * @exception   
    * @date        2018/5/6 14:46
    */
    
    /**
    * 方法实现说明
    * @author      作者姓名
    * @param null
    * @return
    * @exception
    * @date        2018/5/6 14:48
    */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
    

    public String sayHello(String name ,int age){
        return "111";
    }
}
