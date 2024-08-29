package testNG.dao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import com.hanni.dao.DonHangChiTietDAO;
import com.hanni.entity.DonHangChiTiet;

public class DonHangChiTietDAO_TestNG {

    private DonHangChiTietDAO createTestSubject() {
        return new DonHangChiTietDAO();
    }

    @Test
    public void testInsert() throws Exception {
        DonHangChiTietDAO testSubject = createTestSubject();
        DonHangChiTiet entity = new DonHangChiTiet("DHCT020", "SP001", "DH001", 100.0, 5);

        // Perform test
        testSubject.insert(entity);

        // Verify the insertion
        DonHangChiTiet insertedEntity = testSubject.selectById("DHCT020");
        assertNotNull(insertedEntity);
        assertEquals(entity.getMaDHCT(), insertedEntity.getMaDHCT());
        assertEquals(entity.getMaSP(), insertedEntity.getMaSP());
        // Add more assertions for other properties as needed
        
        // Print the result (Optional)
        System.out.println("Inserted entity: " + insertedEntity.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        DonHangChiTietDAO testSubject = createTestSubject();
        DonHangChiTiet entity = new DonHangChiTiet("DHCT020", "SP002", "DH002", 150.0, 7);

        // Perform test
        testSubject.update(entity);

        // Verify the update
        DonHangChiTiet updatedEntity = testSubject.selectById("DHCT020");
        assertNotNull(updatedEntity);

        // Compare properties
        assertEquals(entity.getMaSP(), updatedEntity.getMaSP());
        assertEquals(entity.getMaDH(), updatedEntity.getMaDH());
        // Add more assertions for other properties as needed

        // Print the result (Optional)
        System.out.println("Updated entity: " + updatedEntity.toString());
    }

    @Test
    public void testSelectAll() throws Exception {
        DonHangChiTietDAO testSubject = createTestSubject();
        List<DonHangChiTiet> result;

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
        DonHangChiTietDAO testSubject = createTestSubject();
        String id = "DHCT001";
        DonHangChiTiet result;

        // Perform test
        result = testSubject.selectById(id);
        assertNotNull(result);
    }

    @Test
    public void testDelete() throws Exception {
        DonHangChiTietDAO testSubject = createTestSubject();
        String id = "DHCT020";

        // Perform test
        testSubject.delete(id);

        // Verify the deletion
        DonHangChiTiet deletedEntity = testSubject.selectById(id);
        assertNull(deletedEntity, "Entity should be deleted!");

        // Print the result (Optional)
        System.out.println("Deleted entity: " + id);
    }
}

