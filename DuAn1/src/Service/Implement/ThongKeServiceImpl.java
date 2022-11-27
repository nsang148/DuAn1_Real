/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service.Implement;

import ViewModels.ThongKeResponse;
import Repository.ThongKeRepository;
import Service.ThongKeService;
import ViewModels.SanPhamHet;
import ViewModels.SoHoaDon;
import ViewModels.SoSanPhamTon;
import ViewModels.ThongKeSPResponse;
import java.util.List;

/**
 *
 * @author acer
 */
public class ThongKeServiceImpl implements ThongKeService{

    private ThongKeRepository repo = new ThongKeRepository();
    @Override
    public List<ThongKeResponse> getAll() {
        return repo.getAll();
    }

    @Override
    public List<ThongKeSPResponse> getAllSP() {
        return repo.getAllThongKeSP();
    }

    @Override
    public List<ThongKeResponse> HienThiDoanhThu() {
        return repo.HienThiDoanhThu();
    }

    @Override
    public List<SoHoaDon> HienThiSoHoaDon() {
        return repo.hienThiTongHoaDon();
    }

    @Override
    public List<SoSanPhamTon> HienThiSoLuongTon() {
        return repo.hienThiSoLuongTon();
    }

    @Override
    public List<SanPhamHet> HienThiSanPhamHet() {
        return repo.hienThiSoPhamHet();
    }

    @Override
    public List<ThongKeResponse> search(String dateBD, String dateKT) {
        return repo.search(dateBD, dateKT);
    }
}
