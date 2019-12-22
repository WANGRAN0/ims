package com.ims.entity;

import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author admin
 * @since 2019-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Teacher implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("T_no")
    private String tNo;

    @TableField("T_name")
    private String tName;

    @TableField("T_sex")
    private String tSex;

    @TableField("T_birth")
    private LocalDate tBirth;

    @TableField("D_name")
    private String dName;

    @TableField("T_nation")
    private String tNation;

    @TableField("T_phone")
    private String tPhone;


}
