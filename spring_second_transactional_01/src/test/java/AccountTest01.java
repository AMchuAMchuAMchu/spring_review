import com.itheima.config.CFSpringConfig;
import com.itheima.log.LogForAccount;
import com.itheima.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_review
 * BelongsPackage ==> PACKAGE_NAME
 * Version ==> 1.0
 * CreateTime ==> 2022-10-26 09:23:02
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CFSpringConfig.class)
public class AccountTest01 {

    @Autowired
    private AccountService accountService;

    @Test
    public void testT01() throws IOException {
        int money = 100;
        accountService.log(money);
        accountService.Kirito2Alice(money);
    }



}
