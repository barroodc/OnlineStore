import com.solvd.onlineshop.dao.jdbcmySQLImpl.CheckoutCartDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class FirstTest {

    private static final Logger LOGGER = LogManager.getLogger(FirstTest.class);

    @Test
    void setup(){
        LOGGER.info("Hello World");
    }
}

