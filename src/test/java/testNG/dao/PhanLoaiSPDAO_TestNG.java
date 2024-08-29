package testNG.dao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import com.hanni.dao.PhanLoaiSPDAO;
import com.hanni.entity.PhanLoaiSP;

public class PhanLoaiSPDAO_TestNG {

    private PhanLoaiSPDAO createTestSubject() {
        return new PhanLoaiSPDAO();
    }

    @Test
    public void testInsert() throws Exception {
        PhanLoaiSPDAO testSubject = createTestSubject();
        PhanLoaiSP entity = new PhanLoaiSP("PL004", "Category 1", "Information for Category 1");

        // Perform test
        testSubject.insert(entity);

        // Verify the insertion
        PhanLoaiSP insertedEntity = testSubject.selectById("PL004");
        assertNotNull(insertedEntity);
        assertEquals(entity.getMaPL(), insertedEntity.getMaPL());
        assertEquals(entity.getTenPL(), insertedEntity.getTenPL());
        // Add more assertions for other properties as needed
        
        // Print the result (Optional)
        System.out.println("Inserted entity: " + insertedEntity.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        PhanLoaiSPDAO testSubject = createTestSubject();
        PhanLoaiSP entity = new PhanLoaiSP("PL004", "Updated Category", "Updated Information");

        // Perform test
        testSubject.update(entity);

        // Verify the update
        PhanLoaiSP updatedEntity = testSubject.selectById("PL004");
        assertNotNull(updatedEntity);

        // Compare properties
        assertEquals(entity.getTenPL(), updatedEntity.getTenPL());
        assertEquals(entity.getThongTin(), updatedEntity.getThongTin());
        // Add more assertions for other properties as needed

        // Print the result (Optional)
        System.out.println("Updated entity: " + updatedEntity.toString());
    }

    @Test
    public void testSelectAll() throws Exception {
        PhanLoaiSPDAO testSubject = createTestSubject();
        List<PhanLoaiSP> result;

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
        PhanLoaiSPDAO testSubject = createTestSubject();
        String id = "PL001";
        PhanLoaiSP result;

        // Perform test
        result = testSubject.selectById(id);
        assertNotNull(result);
    }

    @Test
    public void testDelete() throws Exception {
        PhanLoaiSPDAO testSubject = createTestSubject();
        String id = "PL004";

        // Perform test
        testSubject.delete(id);

        // Verify the deletion
        PhanLoaiSP deletedEntity = testSubject.selectById(id);
        assertNull(deletedEntity, "Entity should be deleted!");

        // Print the result (Optional)
        System.out.println("Deleted entity: " + id);
    }
}

