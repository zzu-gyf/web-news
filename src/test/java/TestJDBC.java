import com.news.util.DBUtil;
import org.junit.Test;

import java.sql.Connection;

public class TestJDBC {
    @Test
    public void test1() {
        Connection conn=DBUtil.getConnection();
        System.out.println(conn);
    }
}
