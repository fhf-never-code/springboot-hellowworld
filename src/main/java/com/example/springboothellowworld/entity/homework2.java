package com.example.springboothellowworld.entity;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
@Slf4j
public class homework2 {
        /**
         * 获取指定文件大小

         * @param path

         * @return

         */

        public static long getSize(Path path) {

            try {

                return Files.size(path);

            } catch (IOException e) {

                throw new RuntimeException("操作错误！无法对指定文件执行操作");
            }
    }

    String str = "fhf";
    String str1 = "我的网名叫风红枫";
    public void get(String str) {
        int length = 5;
        if (str.length() <= length) {

        }

    }
}
