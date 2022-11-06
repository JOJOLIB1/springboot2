package com.jjj.boot;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;


/**
 * @className: com.jjj.boot.MainAppletTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-06 11:00
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class MainAppletTest {
    @Autowired
    DataSource dataSource;
    @Test
    public void testDataSource() throws SQLException {

    }
}
