package com.hanni.dao;

import static org.junit.Assert.*;

import java.sql.ResultSet;
import java.util.List;

import org.junit.Test;

import com.hanni.entity.SanPham;
import com.hanni.utils.JdbcHelper;

public class SanPhamDAOTest {

    private SanPhamDAO createTestSubject() {
        return new SanPhamDAO();
    }

    @Test
    public void testInsert() throws Exception {
        SanPhamDAO testSubject = createTestSubject();
        SanPham entity = new SanPham("SP100", "Product 1", 100.0, 10, 5.0, "image.jpg", "Description", "PL001");

        // Perform test
        testSubject.insert(entity);

        // Verify the insertion
        SanPham insertedEntity = testSubject.selectById("SP100");
        assertNotNull(insertedEntity);
        assertEquals(entity.getMaSP(), insertedEntity.getMaSP());
        assertEquals(entity.getTenSP(), insertedEntity.getTenSP());
        assertEquals(entity.getGia(), insertedEntity.getGia());
        assertEquals(entity.getSoLuong(), insertedEntity.getSoLuong());
        // Add more assertions for other properties as needed
        
        // Print the result
        System.out.println("Inserted entity: " + insertedEntity.toString());
    }


    @Test
    public void testUpdate() throws Exception {
        SanPhamDAO testSubject = createTestSubject();
        SanPham entity = null;

        // Perform test
        testSubject.update(entity);
    }

    @Test
    public void testSelectAll() throws Exception {
        SanPhamDAO testSubject = createTestSubject();
        List<SanPham> result;

        // Perform test
        result = testSubject.selectAll();
        System.out.println("rs: " + result );
    }

    @Test
    public void testSelectById() throws Exception {
        SanPhamDAO testSubject = createTestSubject();
        String id = "sp001";
        SanPham result;

        // Perform test
        result = testSubject.selectById(id);
    }

    @Test
    public void testSelectBySql() throws Exception {
        SanPhamDAO testSubject = createTestSubject();
        String sql = "SELECT * FROM SanPham WHERE maSP = ?";
        Object[] args = new Object[] { "SP001" }; // Example argument
        List<SanPham> result;

        // Perform test
        ResultSet rs = JdbcHelper.query(sql, args);
        
//        // Process ResultSet as needed
//        result = processResultSet(rs); // Assume you have a method to process the ResultSet
//        // Assert the result meets expectations
//        assertNotNull(result);
//        assertEquals(1, result.size()); // Example assertion, assuming one result is expected
    }
    
    @Test
    public void testDelete() throws Exception {
        SanPhamDAO testSubject = createTestSubject();
        String id = "SP100";

        // Perform test
        testSubject.delete(id);
    }
}
