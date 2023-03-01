package com.data.create.mysql;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author zhougf
 * @desc 代码制作
 * @date 2022/12/28 10:43
 */
public class DataCreate {
    public static void main(String[] args) {
        String url = "j";
        String username = "";
        String password = "p+1c+";
        FastAutoGenerator.create(url, username, password)
                .globalConfig(builder -> {
                    builder.author("zhougf") // 设置作者
//                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("F:\\person\\data-create\\src\\main\\java\\com\\data\\create\\code"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.data.code") // 设置父包名
                            .moduleName("system") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "F:\\person\\data-create\\src\\main\\java\\com\\data\\create\\code")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.addInclude("ca_oa_station_info") ;// 设置需要生成的表名
                    builder.mapperBuilder().enableBaseResultMap().enableBaseColumnList();
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
