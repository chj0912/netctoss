package com.netctoss.dao;

import com.netctoss.pojo.Host;
import com.netctoss.pojo.HostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HostMapper {
    long countByExample(HostExample example);

    int deleteByExample(HostExample example);

    int insert(Host record);

    int insertSelective(Host record);

    List<Host> selectByExample(HostExample example);

    int updateByExampleSelective(@Param("record") Host record, @Param("example") HostExample example);

    int updateByExample(@Param("record") Host record, @Param("example") HostExample example);
}