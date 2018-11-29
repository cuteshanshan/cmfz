package com.baizhi.controller;

import com.baizhi.entity.Album;
import com.baizhi.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;

@Controller
public class AlbumController {
    @Autowired
    private AlbumService albumService;

    @RequestMapping("/getAllAlbum")
    public @ResponseBody Map getAllAlbum(int page, int rows){
        System.out.println(page+"-----------"+rows);
        return albumService.getAll(page,rows);
    }

    @RequestMapping("/addAlbum")
    public @ResponseBody boolean addAlbum(Album album, MultipartFile myjar, HttpServletRequest request){
        try {
            String fileName = myjar.getOriginalFilename();
            fileName = new Date().getTime() + "_" + fileName;
            String realPath = request.getRealPath("/audioCollection/");

            String imagePath = fileName;
            album.setCoverImg(imagePath);
            albumService.add(album);
            myjar.transferTo(new File(realPath + "\\" + fileName));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
