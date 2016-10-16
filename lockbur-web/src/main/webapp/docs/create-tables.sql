--- 2016-10-16 王坤 图片主表
CREATE TABLE `tb_photo` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `orders` int(11) DEFAULT NULL COMMENT '排序标识',
  `source` varchar(255) DEFAULT NULL COMMENT '原图片地址',
  `thumbnail` varchar(255) DEFAULT NULL COMMENT '缩略图地址',
  `title` varchar(200) DEFAULT NULL COMMENT '图片标题',
  `member_id` varchar(255) NOT NULL COMMENT '上传者id,默认是管理上传',
  `wallhaven_id` varchar(9) DEFAULT NULL COMMENT 'wallhaven的图片id',
  `storage_host` varchar(20) DEFAULT NULL COMMENT '图片服务器，主要显示主机名',
  `status` TINYINT(4) DEFAULT 0 COMMENT '图片的一些状态信息 0:未处理 1:已审核通过 9:已删除',
	`created_time` datetime NOT NULL COMMENT '创建时间',
  `modified_time` datetime NOT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8;

