package com.jjj.boot;


import com.jjj.boot.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import javax.sql.DataSource;
import java.sql.SQLException;


/**
 * @className: com.jjj.boot.MainAppletTest
 * @description:
 * @author: 江骏杰
 * @create: 2022-11-06 11:00
 */
@SpringBootTest
public class MainAppletTest {
    @Autowired
    DataSource dataSource;

    @Test
    public void testDataSource() throws SQLException {
        System.out.println(dataSource);
    }
}
