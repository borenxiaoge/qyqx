package qyqx.org.util;

import org.apache.commons.lang.StringUtils;

import java.util.UUID;

public class StrUtil {
    /**
     * @return 生成账簿编号
     */
    public synchronized static String getBookSeq() {
        return getSeq("FM_BOOK_NO_", 30);
    }

    /**
     * @param userName
     * @return 生成默认账本名称
     */
    public synchronized static String getBookName(String userName) {
        return userName + "的家庭小账本";
    }

    /**
     * @return 生成用户编号
     */
    public synchronized static String getUserSeq() {
        return getSeq("FM_USER_NO_", 64);
    }

    /**
     * @return 交易明细编号
     */
    public synchronized static String getDetailSeq() {

        return getSeq("FM_DETAIL_NO_", 80);
    }

    /**
     * @param len最大32位 ,超过返回null
     * @return 生成uuid 不含"-"
     */
    public static String getUUID(int len) {
        if (len > 32 || len < 1) {
            return null;
        }
        return UUID.randomUUID().toString().replace("-", "").substring(32 - len);
    }

    /**
     * @param pre 序列前缀
     * @param len 栏位长度
     * @return
     */
    public static String getSeq(String pre, int len) {
        if (StringUtils.isEmpty(pre)) {
            return null;
        }
        len = len > 56 ? 55 : len - 1;// 最大支持56位
        String time17 = DateUtil.getCurTimestampStr();
        return pre.toUpperCase() + getUUID(len - pre.length() - time17.length()) + "_" + time17;
    }

}
