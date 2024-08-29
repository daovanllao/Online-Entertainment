package testNG.dao;

import com.hanni.dao.BaoCaoThongKeDAO;
import com.hanni.entity.BaoCaoThongKe;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class BaoCaoThongKeDAO_TestNG {

    private BaoCaoThongKeDAO baoCaoThongKeDAO;

    @BeforeMethod
    public void setUp() {
        baoCaoThongKeDAO = new BaoCaoThongKeDAO();
    }

    @AfterMethod
    public void tearDown() {
        baoCaoThongKeDAO = null;
    }

    // Other test methods as before...

    @Test
    public void testSelectBySql() {
        String sql = "EXEC ThongKeDonHang"; // Example SQL statement
        List<BaoCaoThongKe> result = baoCaoThongKeDAO.selectBySql(sql);
        assertNotNull(result);
        // Print out the result
        System.out.println("Result of testSelectBySql:");
        for (BaoCaoThongKe entity : result) {
            System.out.println(entity.toString());
        }
        // Assert other conditions based on your expectations
    }

    @Test
    public void testSelectAllDoanhThuThang() {
        List<BaoCaoThongKe> result = baoCaoThongKeDAO.selectAllDoanhThuThang();
        assertNotNull(result);
        // Print out the result
        System.out.println("Result of testSelectAllDoanhThuThang:");
        for (BaoCaoThongKe entity : result) {
            System.out.println(entity.toString());
        }
        // Assert other conditions based on your expectations
    }

    @Test
    public void testSelectAllDoanhThuNam() {
        List<BaoCaoThongKe> result = baoCaoThongKeDAO.selectAllDoanhThuNam();
        assertNotNull(result);
        // Print out the result
        System.out.println("Result of testSelectAllDoanhThuNam:");
        for (BaoCaoThongKe entity : result) {
            System.out.println(entity.toString());
        }
        // Assert other conditions based on your expectations
    }

    @Test
    public void testSelectAllDoanhThuNgay() {
        List<BaoCaoThongKe> result = baoCaoThongKeDAO.selectAllDoanhThuNgay();
        assertNotNull(result);
        // Print out the result
        System.out.println("Result of testSelectAllDoanhThuNgay:");
        for (BaoCaoThongKe entity : result) {
            System.out.println(entity.toString());
        }
        // Assert other conditions based on your expectations
    }
}
