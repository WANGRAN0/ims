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
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("I_no")
    private String iNo;

    @TableField("I_name")
    private String iName;

    @TableField("I_sex")
    private String iSex;

    @TableField("I_birth")
    private LocalDate iBirth;

    @TableField("I_nation")
    private String iNation;

    @TableField("C_name")
    private String cName;

    @TableField("D_name")
    private String dName;

    @TableField("M_name")
    private String mName;

    @TableField("I_phone")
    private String iPhone;


}
