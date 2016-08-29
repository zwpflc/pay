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
 * User: lmf@cic.tsinghua.edu.cn
 * Date: 13-11-25
 * Time: 上午11:13
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
