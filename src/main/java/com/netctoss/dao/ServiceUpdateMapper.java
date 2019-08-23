package com.netctoss.dao;

import com.netctoss.pojo.ServiceUpdate;
import com.netctoss.pojo.ServiceUpdateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ServiceUpdateMapper {
    long countByExample(ServiceUpdateExample example);

    int deleteByExample(ServiceUpdateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServiceUpdate record);

    int insertSelective(ServiceUpdate record);

    List<ServiceUpdate> selectByExample(ServiceUpdateExample example);

    ServiceUpdate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServiceUpdate record, @Param("example") ServiceUpdateExample example);

    int updateByExample(@Param("record") ServiceUpdate record, @Param("example") ServiceUpdateExample example);

    int updateByPrimaryKeySelective(ServiceUpdate record);

    int updateByPrimaryKey(ServiceUpdate record);
}