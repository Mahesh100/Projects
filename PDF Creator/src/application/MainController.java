package application;

import java.awt.Color;
import java.io.FileOutputStream;

import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.FontFactory;
import com.lowagie.text.pdf.PdfWriter;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class MainController {
	@FXML
	TextArea area;
	
	
	public void getData()
	{
		String data=area.getText();
		Document d = new Document();
		try 
		{   
			PdfWriter.getInstance(d, new FileOutputStream("mydata.pdf"));
			d.open(); com.lowagie.text.Font font =
			FontFactory.getFont(FontFactory.COURIER, 16,Color.black); 
			Chunk chunk = new Chunk(data,font);
			d.add(chunk); d.close();
			System.out.println(chunk);
	      } 
		  catch (Exception e) { e.printStackTrace(); }		 
	}
}
