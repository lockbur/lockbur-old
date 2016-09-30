/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.mikesu.fastdfs.dir;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.mikesu.fastdfs.FastdfsClient;

/**
 *
 * @author Administrator
 */
public class UploadDir {

    private FastdfsClient fastdfsClient;

    public UploadDir(FastdfsClient fastdfsClient) {
        this.fastdfsClient = fastdfsClient;
    }

    public void getFiles(String filePath) {
        File root = new File(filePath);
        File[] files = root.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                getFiles(file.getAbsolutePath());
            } else {
                try {
                    String fileId = fastdfsClient.upload(file);
                    System.out.println("显示" + filePath + "下所有子目录" + fileId);
                } catch (Exception ex) {
                    Logger.getLogger(UploadDir.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
