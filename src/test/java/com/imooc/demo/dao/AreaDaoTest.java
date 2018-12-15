package com.imooc.demo.dao;

import com.imooc.demo.entity.Area;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;
    @Test
    @Ignore
    public void queryArea() {
        List<Area> areaList=areaDao.queryArea();
        assertEquals(2,areaList.size());
    }

    @Test
    @Ignore
    public void queryAreaById() {
        Area area=areaDao.queryAreaById(1);
        assertEquals("东",area.getAreaName());
    }

    @Test
    @Ignore
    public void insertArea() {
        Area area=new Area();
        area.setAreaName("南");
        area.setPriority(1);
        int affectNum=areaDao.insertArea(area);
        assertEquals(1,affectNum);
    }

    @Test
    @Ignore
    public void updateArea() {
        Area area=new Area();
        area.setAreaName("西r");
        area.setAreaId(3);
        area.setLastEditTime(new Date());
        area.setPriority(3);
        int effectedNum=areaDao.updateArea(area);
        assertEquals(1,effectedNum);
    }

    @Test
    public void deleteArea() {
        int effectNum=areaDao.deleteArea(3);
        assertEquals(1,effectNum);
    }
}