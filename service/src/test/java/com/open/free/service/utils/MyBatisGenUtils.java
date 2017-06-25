package com.open.free.service.utils;

import org.junit.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Noodlewar on 2017/4/10.
 */
public class MyBatisGenUtils {

    public static void generator() throws Exception {
        boolean overwrite = false;
        List<String> warnings = new ArrayList<String>();
        InputStream config = Class.forName(MyBatisGenUtils.class.getName())
                .getResourceAsStream("/mybatis/generatorConfig.xml");

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        ConfigurationParser parser = new ConfigurationParser(warnings);
        Configuration configuration = parser.parseConfiguration(config);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(configuration, callback, warnings);
        myBatisGenerator.generate(null);
    }

    @Test
    public void gen() throws Exception {
        MyBatisGenUtils.generator();
    }

}
