package cn.mingming.borrowbooks.dao.utils;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
/**
 * @author carey
 * @date 2019/4/11
 */
public class CodeGenerator {
    public static void main(String[] args) {
        String packageName = "com.example";
        generateByTables(packageName, "user", "role");
    }

    private static void generateByTables(String packageName, String... tableNames){
        // 全局配置
        GlobalConfig config = new GlobalConfig();
        config.setActiveRecord(false)
                .setAuthor("carey")
                .setOutputDir("/Users/carey/Documents/workspace/borrow_books_backend/dao/src/main/java/com/mingming/borrowbooks/dao")
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setEnableCache(false)
                .setFileOverride(true);

        //数据源配置
        String dbUrl = "jdbc:mysql://localhost:3306/borrow_books";
        String username = "root";
        String password = "root10086";
        String drivername = "com.mysql.jdbc.Driver";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername(username)
                .setPassword(password)
                .setDriverName(drivername);

        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组


        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")

                ).execute();
    }
}
