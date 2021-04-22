package com.bfourclass.euopendata;

import com.bfourclass.euopendata.user.auth.InMemorySecurityContext;
import com.bfourclass.euopendata.user.auth.SecurityContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
public class SecurityContextTest {

    @Test
    public void insertsIntoContext() {
        SecurityContext context = new InMemorySecurityContext();
        String token = context.authenticateUserReturnToken("user");
        Assert.isTrue(context.exists(token), "context inserts on login");
    }

}