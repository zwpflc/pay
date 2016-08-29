package controller;

import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 
 * <ul>
 * <li>文件名称 : controller.BookController.java</li>
 * <li>版权所有 : 版权所有(C)2016-2020</li>
 * <li>公        司 : CST</li>
 * <li>创建时间 : 2016年8月29日</li>
 * <li>修改记录 : 无</li>
 * </ul>
 * 
 * @author wenpengZhao
 * @version 1.2
 */
@Controller
@RequestMapping("/book")
public class BookController extends BaseController {

    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping("add")
    private String add(Book book) {
        Session session = sessionFactory.openSession();
        session.save(book);
        session.close();
        return "redirect:list";
    }

    @RequestMapping("list")
    private String list() {
        Session session = sessionFactory.openSession();
        List books = session
                .createQuery("from Book order by id")
                .list();
        super.session.setAttribute("books", books);
        return "redirect:list.jsp";
    }

    @RequestMapping("search/{id}")
    private String search(@PathVariable("id") int id) {
        Session session = sessionFactory.openSession();
        super.session.setAttribute("book", session.get(Book.class, id));
        session.close();
        return "redirect:/book/edit.jsp";
    }

    @RequestMapping("modify")
    private String modify(Book book) {
        Session session = sessionFactory.openSession();
        session.update(book);
        session.flush();
        session.close();
        return "redirect:list";
    }

    @RequestMapping("remove")
    private String remove(Book book) {
        Session session = sessionFactory.openSession();
        session.delete(book);
        session.flush();
        session.close();
        return "redirect:list";
    }
}
