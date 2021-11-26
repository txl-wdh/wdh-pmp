package com.wdh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class WdhApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(WdhApplication.class, args);
        System.out.println("WDH启动成功！\n" +
                "   ______                                                                    \n" +
                "   L,.   ',                                                                  \n" +
                "    \\      ',_                  F-16C In flight + external FuelTank          \n" +
                "     \\   @   ',                                                              \n" +
                "      \\ ^~^    ',                                                            \n" +
                "       \\    NR   ',                                                          \n" +
                "        \\___'98fw  ',_                          _..----.._                   \n" +
                "        [______       \"'==.I\\_____________..--\"<__\\\\_n@___4\\,_               \n" +
                "      ,..-=T         __   ____________          \\/  \"'\" 0<==  \"'-+.._        \n" +
                "      I____|_____    }_>=========I>=**\"\"''==-------------==-   \" |   \"'-.,___\n" +
                "    [_____,.--'\"                             \"\"--=<\"\"-----=====+==--''\"\"     \n" +
                "      \"\"'-=+..,,__,-----,_____                  -=* |                        \n" +
                "                  |__   /-----'#------.,I_---------'\"                        \n" +
                "                     \"\"\"\"'--..__         _.>                                 \n" +
                "                                \"\"'''''\"\"                   -- by TXL        \n");
    }
}
