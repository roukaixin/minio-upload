package com.roukaixin.oss.strategy;

import com.roukaixin.pojo.UploadTask;
import com.roukaixin.pojo.dto.FileInfoDTO;

/**
 * 上传接口
 *
 * @author 不北咪
 * @date 2024/2/21 上午10:51
 */
public interface UploadStrategy {


    /**
     * 创建文件分片，minio 会返回 uploadId，local只是插入把数据插入数据库
     * @param fileInfo 文件信息
     * @return 上传文件信息
     */
    UploadTask createMultipartUpload(FileInfoDTO fileInfo);
}
