package com.ice.job.model.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 招聘评价
 * @TableName recruitment_comment
 */
@TableName(value ="recruitment_comment")
@Data
public class RecruitmentComment implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    /**
     * 发布者id
     */
    private Long userId;

    /**
     * 招聘id
     */
    private Long recruitmentId;

    /**
     * 评分
     */
    private BigDecimal star;

    /**
     * 评价内容
     */
    private String commentText;

    /**
     * 点赞数
     */
    private Integer likeNum;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}