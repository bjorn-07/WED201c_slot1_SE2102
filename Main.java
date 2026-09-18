package javaapplication52;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== HE THONG MANG XA HOI ===");

        
        // 4. USAGE OF 'this' & CONSTRUCTOR
        // Khởi tạo các instance đối tượng (gọi constructor có dùng 'this')
        
        MangXaHoi hao = new MangXaHoi("ID001", "Phuoc Hao");
        MangXaHoi duc = new MangXaHoi("ID002", "Huynh Duc");
        MangXaHoi phu = new MangXaHoi("ID003", "Phu Le");
        MangXaHoi thinh = new MangXaHoi("ID004", "Duc Thinh");
        MangXaHoi van = new MangXaHoi("ID005", "Ngoc Van");

        
        // 2. DEMO READ-WRITE PROPERTY (Có cả Get và Set)
        
        System.out.println("\n--- 1. Demo Read-Write (Bien 'ten') ---");
        System.out.println("Ten cu: " + hao.getTen());
        hao.setTen("Hao"); // Thực hiện Set
        System.out.println("Ten moi sau khi cap nhat: " + hao.getTen()); // Thực hiện Get

        
        // 2. DEMO READ-ONLY PROPERTY (Chỉ có Get, không có Set)
       
        System.out.println("\n--- 2. Demo Read-Only (Bien 'id') ---");
        System.out.println("UID cua Duc la: " + duc.getId());
        // duc.setId("ID999"); // LỖI BIÊN DỊCH: Vì không có hàm setId() -> Bảo vệ ID không bị sửa!

       
        // 2. DEMO WRITE-ONLY PROPERTY (Chỉ có Set, không có Get)
       
        System.out.println("\n--- 3. Demo Write-Only (Bien 'matkhau') ---");
        thinh.setMatkhau("Thinh123@"); // Chỉ cho phép đặt mật khẩu
        System.out.println("Tai khoan cua Thinh da dat mat khau thanh cong!");
        // System.out.println(thinh.getMatkhau()); // LỖI BIÊN DỊCH: Vì không có hàm getMatkhau() -> Bảo mật tuyệt đối!

        
        // 1. DEMO ACCESS MODIFIERS (Truy cập thuộc tính public)
       
        System.out.println("\n--- 4. Demo Access Modifiers ---");
        thinh.baocao();
        thinh.khangcao();
        // Truc tiep truy cap bien 'public String tenphanmem' từ lớp bên ngoài
        System.out.println("Nen tang dang su dung: " + thinh.tenPhanMem); 

        
        // 3. DEMO STATIC METHOD & STATIC FIELD
        // Gọi phương thức static thông qua tên Lớp (Mangxahoi.getTong())
        
        System.out.println("\n--- 5. Demo Static Field & Method ---");
        System.out.println("Tong so nguoi dung trong he thong: " + MangXaHoi.getTong());
    }
}