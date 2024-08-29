package testNG.dao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import com.hanni.dao.DonHangDAO;
import com.hanni.entity.DonHang;

public class DonHangDAO_TestNG {

    private DonHangDAO createTestSubject() {
        return new DonHangDAO();
    }

    @Test
    public void testInsert() throws Exception {
        DonHangDAO testSubject = createTestSubject();
        DonHang entity = new DonHang("DH010", "KH001", java.sql.Date.valueOf("2024-04-06"), 500.0, true);

        // Perform test
        testSubject.insert(entity);

        // Verify the insertion
        DonHang insertedEntity = testSubject.selectById("DH010");
        assertNotNull(insertedEntity);
        assertEquals(entity.getMaDH(), insertedEntity.getMaDH());
        assertEquals(entity.getMaKH(), insertedEntity.getMaKH());
        // Add more assertions for other properties as needed
        
        // Print the result (Optional)
        System.out.println("Inserted entity: /n" + insertedEntity.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        DonHangDAO testSubject = createTestSubject();
        DonHang entity = new DonHang("DH010", "KH002", java.sql.Date.valueOf("2024-04-07"), 600.0, false);

        // Perform test
        testSubject.update(entity);

        // Verify the update
        DonHang updatedEntity = testSubject.selectById("DH010");
        assertNotNull(updatedEntity);

        // Compare properties
        assertEquals(entity.getMaKH(), updatedEntity.getMaKH());
        assertEquals(entity.getNgayLap(), updatedEntity.getNgayLap());
        // Add more assertions for other properties as needed

        // Print the result (Optional)
        System.out.println("Updated entity: " + updatedEntity.toString());
    }

    @Test
    public void testSelectAll() throws Exception {
        DonHangDAO testSubject = createTestSubject();
        List<DonHang> result;

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
        DonHangDAO testSubject = createTestSubject();
        String id = "DH001";
        DonHang result;

        // Perform test
        result = testSubject.selectById(id);
        assertNotNull(result);
    }

    @Test
    public void testDelete() throws Exception {
        DonHangDAO testSubject = createTestSubject();
        String id = "DH010";

        // Perform test
        testSubject.delete(id);

        // Verify the deletion
        DonHang deletedEntity = testSubject.selectById(id);
        assertNull(deletedEntity, "Entity should be deleted!");

        // Print the result (Optional)
        System.out.println("Deleted entity: " + id);
    }
}

