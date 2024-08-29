package testNG.dao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import com.hanni.dao.TaiKhoanDAO;
import com.hanni.entity.TaiKhoan;

public class TaiKhoanDAO_TestNG {

    private TaiKhoanDAO createTestSubject() {
        return new TaiKhoanDAO();
    }

    @Test
    public void testInsert() throws Exception {
        TaiKhoanDAO testSubject = createTestSubject();
        TaiKhoan entity = new TaiKhoan("TK010", "John Doe", "password", "Address", "123456789", "john@example.com", true);

        // Perform test
        testSubject.insert(entity);

        // Verify the insertion
        TaiKhoan insertedEntity = testSubject.selectById("TK010");
        assertNotNull(insertedEntity);
        assertEquals(entity.getMaTK(), insertedEntity.getMaTK());
        assertEquals(entity.getMatKhau(), insertedEntity.getMatKhau());
        // Add more assertions for other properties as needed
        
        // Print the result (Optional)
        System.out.println("Inserted entity: " + insertedEntity.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        TaiKhoanDAO testSubject = createTestSubject();
        TaiKhoan entity = new TaiKhoan("TK010", "Jane Doe", "new_password", "New Address", "987654321", "jane@example.com", false);

        // Perform test
        testSubject.update(entity);

        // Verify the update
        TaiKhoan updatedEntity = testSubject.selectById("TK010");
        assertNotNull(updatedEntity);

        // Compare properties
        assertEquals(entity.getMatKhau(), updatedEntity.getMatKhau());
        assertEquals(entity.getHoTen(), updatedEntity.getHoTen());
        // Add more assertions for other properties as needed

        // Print the result (Optional)
        System.out.println("Updated entity: " + updatedEntity.toString());
    }

    @Test
    public void testSelectAll() throws Exception {
        TaiKhoanDAO testSubject = createTestSubject();
        List<TaiKhoan> result;

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
        TaiKhoanDAO testSubject = createTestSubject();
        String id = "TK001";
        TaiKhoan result;

        // Perform test
        result = testSubject.selectById(id);
        assertNotNull(result);
    }

    @Test
    public void testDelete() throws Exception {
        TaiKhoanDAO testSubject = createTestSubject();
        String id = "TK010";

        // Perform test
        testSubject.delete(id);

        // Verify the deletion
        TaiKhoan deletedEntity = testSubject.selectById(id);
        assertNull(deletedEntity, "Entity should be deleted!");

        // Print the result (Optional)
        System.out.println("Deleted entity: " + id);
    }
}

