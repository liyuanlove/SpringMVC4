package com.powernode.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/test")
public class MyController {

    @RequestMapping(value = "/upload.do", method = RequestMethod.POST)
    public String doUpload(MultipartFile img) throws Exception {
        String path = "D:/images";

        if (img.getSize() > 0) {
            //获取到上传文件的原始名称
            String fileName = img.getOriginalFilename();
            if (fileName.endsWith("jpg") || fileName.endsWith("png")) {
                File file = new File(path, fileName);
                img.transferTo(file);
            }
        }

        return "/success.jsp";
    }

}
