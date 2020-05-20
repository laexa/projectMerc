/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moon.projectx.PDFGenerator;

import com.itextpdf.text.Anchor;
import static com.itextpdf.text.Chunk.ENCODING;
import java.io.File;
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
import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import moon.projectx.SettingAndUser;
import moon.projectx.objectTable.Merch;

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
    
    public boolean creatDoucumentAndEdit(String pathString) {
        try {
            
            Document document = new Document(PageSize.A4, 0, 0, 0, 0);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(getPathe() + "/nameDocument"+ new Date().toString()+".pdf"));
            document.open();
//            
            Anchor anchor = new Anchor("Fists anchor");
            anchor.setName("back to top");
            
            Paragraph paragraph = new Paragraph();
            paragraph.setSpacingBefore(50);
            paragraph.add(anchor);
            document.add(paragraph);
        
            PdfPTable table = new PdfPTable(3);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            
            PdfPCell cell1 = new PdfPCell(new Phrase("cell1"));
            table.addCell(cell1);
            
            PdfPCell cell2 = new PdfPCell(new Phrase("cell2"));
            table.addCell(cell2);
            
            PdfPCell cell3 = new PdfPCell(new Phrase("cell3"));
            table.addCell(cell3);
            
            table.addCell("1.1");
            table.addCell("1.2");
            table.addCell("1.3");
            
            document.add(table);
            document.close();
            return true;
        } catch (Exception e) {
        }
        
        return false;
    }
    
    public boolean creatInvoice(Merch merch, int count, int price){
        try {
            
            Document document = new Document(PageSize.A4, 0, 0, 0, 0);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(getPathe() + "/invoice"+SettingAndUser.User.userLastName+ SettingAndUser.User.userName+ new Date().toString()+".pdf"));
            document.open();
            
            BaseFont helvetica = BaseFont.createFont("/Users/alex/NetBeansProjects/projectMerc/src/main/java/moon/projectx/font/ArialBlack.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
           
            Font font = new Font(helvetica, 10, Font.NORMAL);
            
            
            Anchor anchor = new Anchor("руский ", font);
           
            
            Anchor anchorDesc = new Anchor("Name Seller " + SettingAndUser.User.userLastName + SettingAndUser.User.userName);
          
            
            Anchor anchorData = new Anchor("Date : " + new Date().toString());
         
            Paragraph paragraph = new Paragraph();
            Paragraph paragraph1 = new Paragraph();
            Paragraph paragraph2 = new Paragraph();
            
            paragraph.setSpacingBefore(25);
            paragraph.setFont(font);
            paragraph1.setSpacingBefore(25);
            paragraph2.setSpacingBefore(25);
            
            paragraph.add(anchor);
            paragraph1.add(anchorDesc);
            paragraph2.add(anchorData);
            
            document.add(paragraph);
            document.add(paragraph1);
            document.add(paragraph2);
            
            
            PdfPTable table = new PdfPTable(5);
            table.setSpacingBefore(25);
            table.setSpacingAfter(25);
            
            PdfPCell cellName = new PdfPCell(new Phrase("Name"));
            table.addCell(cellName);
            
            PdfPCell cellCount = new PdfPCell(new Phrase("Count"));
            table.addCell(cellCount);
            
            PdfPCell cellDate = new PdfPCell(new Phrase("Date"));
            table.addCell(cellDate);
            
            PdfPCell cellCustomer = new PdfPCell(new Phrase("Customer"));
            table.addCell(cellCustomer);
            
            PdfPCell cellPrice = new PdfPCell(new Phrase("Price"));
            table.addCell(cellPrice);
            
            table.addCell("1.1");
            table.addCell("1.1");
            table.addCell("1.1");
            table.addCell("1.1");
            table.addCell("1.1");
            table.addCell("1.1");
            
            document.add(table);
            document.close();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return false;
    }
}
