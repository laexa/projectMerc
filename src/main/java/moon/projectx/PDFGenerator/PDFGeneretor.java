/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.PDFGenerator;

import java.io.File;
import com.itextpdf.text.Anchor;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import moon.projectx.Main;
import moon.projectx.SettingAndUser;
import moon.projectx.objectTable.Merch;
import moon.projectx.objectTable.Statistics;
import moon.projectx.driver.ConnectionDataBase;
import moon.projectx.driver.RequestDataBase;
import moon.projectx.objectTable.Customer;

/**
 *
 * @author alex
 */
public class PDFGeneretor {
    public String getPathe(){
        try {
            return new File(PDFGeneretor.class.getProtectionDomain().getCodeSource().getLocation().toURI()).getPath();
        } catch (URISyntaxException ex) {
            Logger.getLogger(PDFGeneretor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
    public boolean generateInvoice(Statistics stat){
        
        try {
            Customer customer = new Customer();
            ConnectionDataBase connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            RequestDataBase requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
            customer = requestDataBase.getCustomer(stat.getCustomerId());
            
            BaseFont uaFont = BaseFont.createFont("/Users/alex/NetBeansProjects/projectMerc/src/main/java/moon/projectx/font/OpenSans-Light.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font defaultFont = new Font(uaFont, 10, Font.NORMAL);
            
            Date nowDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd'|'hh:mm:ss");
            SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy.MM.dd");
            
            Document document = new Document(PageSize.A4, 10, 10, 10, 10);
            
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(ClassLoader.getSystemClassLoader().getResource(".").getPath()
                    + "/invoice_"+
                    SettingAndUser.User.userLastName +"_"+ 
                    SettingAndUser.User.userName + 
                    "_"  + dateFormat.format(nowDate) +".pdf"));
            document.open();
            
            
            Anchor otherText_1 = new Anchor("Накладна ",new Font(uaFont, 14));
            Anchor otherText_2 = new Anchor("Імя продавця:  " + SettingAndUser.User.userLastName + " " + SettingAndUser.User.userName, new Font(uaFont, 12));
            Anchor otherText_3 = new Anchor("Дата формування: " + dateFormat.format(nowDate), new Font(uaFont, 12));
            Anchor otherText_4 = new Anchor("Номер накладної " + requestDataBase.getLastStatRow(), new Font(uaFont, 12, Font.BOLD));
            
            
            
            Paragraph p = new Paragraph();
            
            p.add(otherText_1);
            document.add(p);
            p.clear();
            
            p.add(otherText_2);
            document.add(p);
            p.clear();
            
            p.add(otherText_3);
            document.add(p);
            p.clear();
            
            p.add(otherText_4);
            document.add(p);
            p.clear();
            // Table generator
            
            PdfPTable table = new PdfPTable(5);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            
            PdfPCell cellName = new PdfPCell(new Phrase("Імя", defaultFont));
            table.addCell(cellName);
            
            PdfPCell cellCount = new PdfPCell(new Phrase("Кількість", defaultFont));
            table.addCell(cellCount);
            
            PdfPCell cellDate = new PdfPCell(new Phrase("Дата", defaultFont));
            table.addCell(cellDate);
            
            PdfPCell cellCustomer = new PdfPCell(new Phrase("Покупець", defaultFont));
            table.addCell(cellCustomer);
            
            PdfPCell cellPrice = new PdfPCell(new Phrase("Ціна", defaultFont));
            table.addCell(cellPrice);
            
            
            table.addCell(new Phrase(stat.getName(), defaultFont));
            table.addCell(String.valueOf(stat.getCount()));
            table.addCell(simpleFormat.format(nowDate));
            table.addCell(new Phrase(customer.getLastName() + " " + customer.getName(), defaultFont));
            table.addCell(String.valueOf(stat.getPrice()));
            
            
            
            document.add(table);
            
            
            p.setSpacingAfter(20);
            p.setSpacingBefore(20);
            otherText_1.clear();
            otherText_1 = new Anchor("Підпис працівника  ________________________", new Font(uaFont, 12, Font.UNDERLINE));
            p.add(otherText_1);
            document.add(p);
            p.clear();
            otherText_1.clear();
            
            otherText_1 = new Anchor("Підпис покупця (Необовязково _______________)", new Font(uaFont, 12, Font.UNDERLINE));
            p.add(otherText_1);
            document.add(p);
            p.clear();
            otherText_1.clear();
            
            document.close();
            
            return true;
            
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        
        return false;
    }
    
    public boolean generatorReport(ArrayList<Statistics> arrayListStat){
        try {
            
            Customer customer = new Customer();
            ConnectionDataBase connectionDataBase = new ConnectionDataBase();
            connectionDataBase.connect();
            RequestDataBase requestDataBase = new RequestDataBase(connectionDataBase.getConnection());
            File path = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath().toString());
            
            
            File t = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().getPath().toString());
            System.out.println(t.getParent()+"OpenSans-Light.ttf");
            BaseFont uaFont = BaseFont.createFont(t.getParent()+"/OpenSans-Light.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            Font defaultFont = new Font(uaFont, 10, Font.NORMAL);
            
            Date nowDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd'|'hh:mm:ss");
            SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy.MM.dd");
            
            Document document = new Document(PageSize.A4, 10, 10, 10, 10);
//            JOptionPane.showMessageDialog(null, path.getParent());
    
            
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream( path.getParent()
                    + "/invoice_"+
                    SettingAndUser.User.userLastName +"_"+ 
                    SettingAndUser.User.userName + 
                    "_"  + dateFormat.format(nowDate) +".pdf"));
            document.open();
            
//            JOptionPane.showMessageDialog(null, "Формирования Шапки накладної");
            Anchor otherText_1 = new Anchor("Накладна ",new Font(uaFont, 14));
            Anchor otherText_2 = new Anchor("Імя продавця:  " + SettingAndUser.User.userLastName + " " + SettingAndUser.User.userName, new Font(uaFont, 12));
            Anchor otherText_3 = new Anchor("Дата формування: " + dateFormat.format(nowDate), new Font(uaFont, 12));
            Anchor otherText_4 = new Anchor("Номер накладної " + requestDataBase.getLastStatRow(), new Font(uaFont, 12, Font.BOLD));
            
            
//            JOptionPane.showMessageDialog(null, "добавления параграфив");
            Paragraph p = new Paragraph();
            
            p.add(otherText_1);
            document.add(p);
            p.clear();
            
            p.add(otherText_2);
            document.add(p);
            p.clear(); 
            
            p.add(otherText_3);
            document.add(p);
            p.clear();
            
            p.add(otherText_4);
            document.add(p);
            p.clear();
            // Table generator
//            JOptionPane.showMessageDialog(null, "Генерация таблици");
            PdfPTable table = new PdfPTable(5);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            
            PdfPCell cellName = new PdfPCell(new Phrase("Імя", defaultFont));
            table.addCell(cellName);
            
            PdfPCell cellCount = new PdfPCell(new Phrase("Ціна", defaultFont));
            table.addCell(cellCount);
            
            PdfPCell cellDate = new PdfPCell(new Phrase("Дата", defaultFont));
            table.addCell(cellDate);
            
            PdfPCell cellCustomer = new PdfPCell(new Phrase("Покупець", defaultFont));
            table.addCell(cellCustomer);
            
            PdfPCell cellPrice = new PdfPCell(new Phrase("Кількість", defaultFont));
            table.addCell(cellPrice);
            
            Statistics st;
            for (int i = 0; i < arrayListStat.size(); i++) {
                
                st = new Statistics();
                st = arrayListStat.get(i);
                table.addCell(new Phrase(st.getName(), defaultFont));
                table.addCell(String.valueOf(st.getCount()));
                table.addCell(st.getDateString()); 
                table.addCell(new Phrase(st.getCustomer(), defaultFont));
                table.addCell(String.valueOf(st.getPrice()));
                
                st = null;
                
                 
                
            }
            
            
            
            
            
            document.add(table);
            
            
            p.setSpacingAfter(20);
            p.setSpacingBefore(20);
            otherText_1.clear();
            otherText_1 = new Anchor("Підпис працівника  ________________________", new Font(uaFont, 12, Font.UNDERLINE));
            p.add(otherText_1);
            document.add(p);
            p.clear();
            otherText_1.clear();
            
            document.close();
            
            return true;
            
        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
//            JOptionPane.showMessageDialog(null, e.getMessage());
            JOptionPane.showMessageDialog(null, e.toString());
        }
        return false;
    }
}
