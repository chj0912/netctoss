package com.netctoss.dao;

import java.util.List;

import com.netctoss.pojo.RolePrivilegeExample;
import com.netctoss.pojo.RolePrivilegeKey;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePrivilegeMapper {
    long countByExample(RolePrivilegeExample example);

    int deleteByExample(RolePrivilegeExample example);

    int deleteByPrimaryKey(RolePrivilegeKey key);

    int insert(RolePrivilegeKey record);

    int insertSelective(RolePrivilegeKey record);

    List<RolePrivilegeKey> selectByExample(RolePrivilegeExample example);

    int updateByExampleSelective(@Param("record") RolePrivilegeKey record,
                                 @Param("example") RolePrivilegeExample example);

    int updateByExample(@Param("record") RolePrivilegeKey record, @Param("example") RolePrivilegeExample example);
}