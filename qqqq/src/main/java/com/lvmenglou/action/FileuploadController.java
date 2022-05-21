package com.lvmenglou.action;

import com.lvmenglou.entity.FileDomain;
import com.lvmenglou.entity.MultiFileDomain;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;

@Controller
public class FileuploadController {
    // 定义日志记录
//    private static final Log logger = LogFactory.getLog(FileuploadController.class);

    @RequestMapping("/getFileupload")
    public String getFileUpload() {
        return "fileupload";
    }

    @RequestMapping("/fileupload")
    public String oneFileUpload(@ModelAttribute FileDomain fileDomain, HttpServletRequest request) {
        // 文件上传到服务器的位置“/uploadfiles”
        String realpath = request.getServletContext().getRealPath("uploadfiles");
        String filename = fileDomain.getMyfile().getOriginalFilename();
        File targetFile = new File(realpath, filename);
        if (!targetFile.exists()) {
            targetFile.mkdirs();
        }
        // 上传
        try {
            fileDomain.getMyfile().transferTo(targetFile);
//            logger.info("上传成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "showFile";
    }

    @RequestMapping("/getmultiFile")
    public String getmultiFile() {
        return "multiFiles";
    }

    @RequestMapping("/multifile")
    public String multiFileUpload(@ModelAttribute MultiFileDomain multiFileDomain, HttpServletRequest request) {
        String realpath = request.getServletContext().getRealPath("uploadfiles");
        File targetDir = new File(realpath);
        if (!targetDir.exists()) {
            targetDir.mkdirs();
        }
        List<MultipartFile> files = multiFileDomain.getMyfile();
        System.out.println("files " + files);
        for (int i = 0; i < files.size(); i++) {
            MultipartFile file = files.get(i);
            String fileName = file.getOriginalFilename();
            File targetFile = new File(realpath, fileName);
            // 上传
            try {
                file.transferTo(targetFile);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "showMulti";
    }
}
