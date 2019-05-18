package qyqx.org.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import qyqx.org.data.mapper.AccBookMapper;
import qyqx.org.data.po.AccBook;
import qyqx.org.data.vo.AccBookRes;
import qyqx.org.service.BookService;
import qyqx.org.util.StrUtil;

import javax.annotation.Resource;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    AccBookMapper mapper;
    @Resource
    RedisTemplate<String, Object> redisTemplate;


    @Override
    public void addBook() {
        AccBook book = new AccBook();
//        BeanUtils.copyProperties(req, book);
        book.setUserId(StrUtil.getUserSeq());
        book.setOpenId("willdo");
        book.setAccBookId(StrUtil.getBookSeq());
        book.setAccBookName(StrUtil.getBookName("willdo"));
//        redisTemplate.opsForHash().put("hashBook", "book", book);
//        redisTemplate.opsForValue().set("strBook", book);
        mapper.insert(book);
    }

    @Override
    public AccBookRes getAccBookById(String bookId) throws Exception {
        AccBookRes res = new AccBookRes();
        Object obj = redisTemplate.opsForValue().get("sbook");
        if (obj != null && obj instanceof AccBookRes) {
            return (AccBookRes) obj;
        }
        //缓存不存在重新连接数据库
        AccBook book = mapper.selectByPrimaryKey(bookId);
        if (book == null || book.getAccBookId() == null) {
            throw new Exception("账本信息不存在");
        }
        BeanUtils.copyProperties(book, res);
        redisTemplate.opsForValue().set("sbook", res);
        return res;
    }
}
