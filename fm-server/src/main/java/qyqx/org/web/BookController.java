package qyqx.org.web;

import org.springframework.web.bind.annotation.*;
import qyqx.org.data.vo.AccBookReq;
import qyqx.org.data.vo.AccBookRes;
import qyqx.org.service.BookService;

import javax.annotation.Resource;

@RestController("/book")
public class BookController {

    @Resource
    BookService service;

    @PostMapping
    public void addBook() {
        service.addBook();
    }

    //    @PutMapping
//    public AccBookRes uptBook() {
//        return null;
//    }
//
    @GetMapping
    public String getBooks() {
        return "sss";
    }

    @GetMapping("/book/{accBookId}")
    public AccBookRes getBook(@PathVariable("accBookId") String accBookId) throws Exception {
        return service.getAccBookById(accBookId);
    }

//    @DeleteMapping
//    public void delete(@PathVariable String accBookId) {
//    }
}
