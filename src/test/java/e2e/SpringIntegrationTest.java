package e2e;

import com.lib.training.Application;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {Application.class, TestConfig.class},
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
    )
@ActiveProfiles(profiles = "test")
public class SpringIntegrationTest {
}
