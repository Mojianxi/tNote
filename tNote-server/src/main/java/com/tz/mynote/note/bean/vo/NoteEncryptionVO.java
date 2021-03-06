package com.tz.mynote.note.bean.vo;

import com.tz.mynote.common.dao.SaveService;
import com.tz.mynote.common.dao.UpdateService;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.Date;

/**
 * @author cxt
 */
@Data
public class NoteEncryptionVO {
    private Long id;

    /**
     * 加密对象id
     */
    @NotEmpty(message = "the parameter targetId must not be null" ,groups = SaveService.class)
    private String targetId;

    /**
     * 密码 前端md5 加密，后端盐值二次加密
     */
    @NotEmpty(message = "the parameter password must not be null" ,groups = {SaveService.class,UpdateService.class})
    private String password;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * 删除标记0 false，1true
     */
    private Byte deleted;
}