package qyqx.org.service;

import qyqx.org.data.po.AccBook;
import qyqx.org.data.vo.AccBookReq;
import qyqx.org.data.vo.AccBookRes;

public interface BookService {

    public void addBook();

    public AccBookRes getAccBookById(String bookId) throws Exception;
}
