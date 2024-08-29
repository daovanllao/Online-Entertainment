package testNG.dao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.sql.ResultSet;
import java.util.List;

import org.testng.annotations.Test;

import com.hanni.dao.SanPhamDAO;
import com.hanni.entity.SanPham;
import com.hanni.utils.JdbcHelper;

public class SanPhamDAO_TestNG {

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
        
        // Print the result (Optional)
        System.out.println("Inserted entity: " + insertedEntity.toString());
    }
    


    @Test
    public void testUpdate() throws Exception {
        SanPhamDAO testSubject = createTestSubject();
        SanPham entity = new SanPham("SP100", "Updated Product", 150.0, 20, 7.0, "image.jpg", "Updated Description", "PL001");

        // Perform test
        testSubject.update(entity);
     // Xác minh cập nhật
        SanPham updatedEntity = testSubject.selectById("SP100");
        assertNotNull(updatedEntity);

        // So sánh các thuộc tính
        assertEquals(entity.getTenSP(), updatedEntity.getTenSP());
        assertEquals(entity.getGia(), updatedEntity.getGia());
        assertEquals(entity.getSoLuong(), updatedEntity.getSoLuong());
        // So sánh các thuộc tính khác

        // In ra kết quả
        System.out.println("Cập nhật sản phẩm thành công: " + updatedEntity.toString());
    }

    @Test
    public void testSelectAll() throws Exception {
        SanPhamDAO testSubject = createTestSubject();
        List<SanPham> result;

        // Perform test
        result = testSubject.selectAll();
        // Xác minh kết quả
        assertNotNull(result);
        assertTrue(result.size() > 0);

        // So sánh một vài sản phẩm trong danh sách
        // Ví dụ: so sánh sản phẩm đầu tiên
        assertEquals(result.get(0).getMaSP(), "SP001");
        assertEquals(result.get(0).getTenSP(), "Product A");

        // In ra kết quả
        System.out.println("Danh sách sản phẩm: " + result);
    }

    @Test
    public void testSelectById() throws Exception {
        SanPhamDAO testSubject = createTestSubject();
        String id = "SP100";
        SanPham result;

        // Perform test
        result = testSubject.selectById(id);
        assertNotNull(result);
    }

//    @Test
//    public void testSelectBySql() throws Exception {
//        SanPhamDAO testSubject = createTestSubject();
//        String sql = "SELECT * FROM SanPham WHERE maSP = ?";
//        Object[] args = new Object[] { "SP001" }; // Example argument
//        List<SanPham> result;
//
//        // Perform test
//        ResultSet rs = JdbcHelper.query(sql, args);
//        
//        // Process ResultSet as needed (you can implement processing logic here)
//    }
    
    @Test
    public void testSelectBySql() throws Exception {
      SanPhamDAO testSubject = createTestSubject();
      String sql = "SELECT * FROM SanPham WHERE maSP = ?";
      Object[] args = new Object[] { "SP001" }; // Ví dụ đối số

      // Thực hiện truy vấn
      ResultSet rs = JdbcHelper.query(sql, args);

      // Xử lý ResultSet
      while (rs.next()) {
        SanPham entity = new SanPham();
        entity.setMaSP(rs.getString("MaSP"));
        entity.setTenSP(rs.getString("TenSP"));
        // Lấy các thuộc tính khác

        // So sánh dữ liệu
        assertEquals(entity.getMaSP(), "SP001");
        assertEquals(entity.getTenSP(), "Product A");
      }

      // In ra kết quả
      System.out.println("Kết quả truy vấn: " + rs);
    }
    
    @Test
    public void testDelete() throws Exception {
        SanPhamDAO testSubject = createTestSubject();
        String id = "SP100";

        // Perform test
        testSubject.delete(id);

        // Verify the deletion
        SanPham deletedEntity = testSubject.selectById(id);
        assertNull(deletedEntity, "Sản phẩm không được xoá!");

        // In ra console
        System.out.println("Xóa sản phẩm thành công: " + id);
    }

}

