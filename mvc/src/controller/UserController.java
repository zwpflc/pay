package controller;

import entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * User: lmf@cic.tsinghua.edu.cn
 * Date: 13-11-25
 * Time: 上午8:58
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {

    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("signup")
    private String signup(User user) {
        Session session = sessionFactory.openSession();
        session.save(user);
        session.close();
        super.session.setAttribute("user", user);
        return "redirect:index.jsp";
    }

    @RequestMapping("login")
    private String login(User user) {
        Session session = sessionFactory.openSession();
        List users = session
                .createQuery("from User where username=:username and password=:password")
                .setString("username", user.getUsername())
                .setString("password", user.getPassword())
                .list();
        if (users.size() == 1) {
            super.session.setAttribute("user", users.get(0));
            return "redirect:index.jsp";
        } else {
            super.request.setAttribute("message", "invalid username or password");
//            return "forward:/index.jsp";
            return "index";
        }
    }

    @RequestMapping("logout")
    private String logout() {
        super.session.invalidate();
        return "redirect:index.jsp";
    }
}
