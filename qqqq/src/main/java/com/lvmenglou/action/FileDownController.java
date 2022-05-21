package com.lvmenglou.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

@Controller
public class FileDownController {
    private static final Log logger = LogFactory.getLog(FileDownController.class);

    @RequestMapping("showDownFiles")
    public String show(HttpServletRequest request, Model model) {
        String realpath = request.getServletContext().getRealPath("uploadfiles");
        File dir = new File(realpath);
        // 获取目录下所有文件
        File files[] = dir.listFiles();
        ArrayList<String> fileName = new ArrayList<>();
        for (int i = 0; i < files.length; i++) {
            fileName.add(files[i].getName());
        }
        model.addAttribute("files", fileName);
        return "showDownFiles";
    }

    @RequestMapping("down")
    public String down(@RequestParam String filename,
                       HttpServletRequest request, HttpServletResponse response) {
        // 文件路径
        String aFilePath = null;
        // 输入流
        FileInputStream in = null;
        // 输出流
        ServletOutputStream out = null;
        try {
            aFilePath = request.getServletContext().getRealPath("uploadfiles");
            // 设置文件头
            response.setHeader("Content-Type", "application/x-msdownload");
            response.setHeader("Content-Disposition", "attachment; filename=" + toUTF8String(filename));
            // 读入文件
            in = new FileInputStream(aFilePath + "/" + filename);
            // 得到响应对象的输出流，用于向客户端输出二进制数据
            out = response.getOutputStream();
            out.flush();
            int aRead = 0;
            byte b[] = new byte[1024];
            while ((aRead = in.read(b)) != -1 && in != null) {
                out.write(b, 0, aRead);
            }
            out.flush();
            in.close();
            out.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        logger.info("下载成功");
        return null;
    }

    // 下载保存时中文文件名的字符编码转换方法   这个方法还是有问题，文件名是中文的，下载不了 ？？？
    public String toUTF8String(String str) {
        StringBuffer sb = new StringBuffer();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            // 取出文件名中的每个字符
            char c = str.charAt(i);
            // Unicode码值为0~255时，不做处理
            if (c >= 0 && c <= 255) {
                sb.append(c);
            } else {
                byte b[];
                try {
                    b = Character.toString(c).getBytes("UTF-8");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    b = null;
                }
                // 转换为%HH的字符串形式
                // 这里我已经看不懂了 ？？？
                for (int j = 0; j < b.length; j++) {
                    int k = b[j];
                    if (k < 0) {
                        k &= 255;
                    }
                    sb.append("%" + Integer.toHexString(k).toUpperCase());
                }
            }
        }

        return sb.toString();
    }
}
