package testNG.dao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import com.hanni.dao.KhachHangDAO;
import com.hanni.entity.KhachHang;

public class KhachHangDAO_TestNG {

    private KhachHangDAO createTestSubject() {
        return new KhachHangDAO();
    }

    @Test
    public void testInsert() throws Exception {
        KhachHangDAO testSubject = createTestSubject();
        KhachHang entity = new KhachHang("KH010", "John Doe", "Address", "123456789", "john@example.com");

        // Perform test
        testSubject.insert(entity);

        // Verify the insertion
        KhachHang insertedEntity = testSubject.selectById("KH010");
        assertNotNull(insertedEntity);
        assertEquals(entity.getMaKH(), insertedEntity.getMaKH());
        assertEquals(entity.getHoTen(), insertedEntity.getHoTen());
        // Add more assertions for other properties as needed
        
        // Print the result (Optional)
        System.out.println("Inserted entity: " + insertedEntity.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        KhachHangDAO testSubject = createTestSubject();
        KhachHang entity = new KhachHang("KH010", "Jane Doe", "New Address", "987654321", "jane@example.com");

        // Perform test
        testSubject.update(entity);

        // Verify the update
        KhachHang updatedEntity = testSubject.selectById("KH010");
        assertNotNull(updatedEntity);

        // Compare properties
        assertEquals(entity.getHoTen(), updatedEntity.getHoTen());
        assertEquals(entity.getDiaChi(), updatedEntity.getDiaChi());
        // Add more assertions for other properties as needed

        // Print the result (Optional)
        System.out.println("Updated entity: " + updatedEntity.toString());
    }

    @Test
    public void testSelectAll() throws Exception {
        KhachHangDAO testSubject = createTestSubject();
        List<KhachHang> result;

        // Perform test
        result = testSubject.selectAll();
        // Verify the result
        assertNotNull(result);
        assertTrue(result.size() > 0);

        // Print the result (Optional)
        System.out.println("List of entities: " + result);
    }

    @Test
    public void testSelectById() throws Exception {
        KhachHangDAO testSubject = createTestSubject();
        String id = "KH001";
        KhachHang result;

        // Perform test
        result = testSubject.selectById(id);
        assertNotNull(result);
    }

    @Test
    public void testDelete() throws Exception {
        KhachHangDAO testSubject = createTestSubject();
        String id = "KH010";

        // Perform test
        testSubject.delete(id);

        // Verify the deletion
        KhachHang deletedEntity = testSubject.selectById(id);
        assertNull(deletedEntity, "Entity should be deleted!");

        // Print the result (Optional)
        System.out.println("Deleted entity: " + id);
    }
}

