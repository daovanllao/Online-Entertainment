package testNG.dao;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.Test;

import com.hanni.dao.ChamSocKhachHangDAO;
import com.hanni.entity.CSKH;

public class ChamSocKhachHangDAO_TestNG {

    private ChamSocKhachHangDAO createTestSubject() {
        return new ChamSocKhachHangDAO();
    }

    @Test
    public void testInsert() throws Exception {
        ChamSocKhachHangDAO testSubject = createTestSubject();
        CSKH entity = new CSKH("CSKH010", "Nội dung", "KH001", "TK001", java.sql.Date.valueOf("2024-04-06"));

        // Perform test
        testSubject.insert(entity);

        // Verify the insertion
        CSKH insertedEntity = testSubject.selectById("CSKH010");
        assertNotNull(insertedEntity);
        assertEquals(entity.getMaCSKH(), insertedEntity.getMaCSKH());
        assertEquals(entity.getNoiDung(), insertedEntity.getNoiDung());
        // Add more assertions for other properties as needed
        
        // Print the result (Optional)
        System.out.println("Inserted entity: " + insertedEntity.toString());
    }

    @Test
    public void testUpdate() throws Exception {
        ChamSocKhachHangDAO testSubject = createTestSubject();
        CSKH entity = new CSKH("CSKH010", "Nội dung cập nhật", "KH003", "TK003", java.sql.Date.valueOf("2024-04-07"));

        // Perform test
        testSubject.update(entity);

        // Verify the update
        CSKH updatedEntity = testSubject.selectById("CSKH010");
        assertNotNull(updatedEntity);

        // Compare properties
        assertEquals(entity.getNoiDung(), updatedEntity.getNoiDung());
        assertEquals(entity.getMaTK(), updatedEntity.getMaTK());
        // Add more assertions for other properties as needed

        // Print the result (Optional)
        System.out.println("Updated entity: " + updatedEntity.toString());
    }

    @Test
    public void testSelectAll() throws Exception {
        ChamSocKhachHangDAO testSubject = createTestSubject();
        List<CSKH> result;

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
        ChamSocKhachHangDAO testSubject = createTestSubject();
        String id = "CSKH001";
        CSKH result;

        // Perform test
        result = testSubject.selectById(id);
        assertNotNull(result);
    }

    @Test
    public void testDelete() throws Exception {
        ChamSocKhachHangDAO testSubject = createTestSubject();
        String id = "CSKH010";

        // Perform test
        testSubject.delete(id);

        // Verify the deletion
        CSKH deletedEntity = testSubject.selectById(id);
        assertNull(deletedEntity, "Entity should be deleted!");

        // Print the result (Optional)
        System.out.println("Deleted entity: " + id);
    }
}

