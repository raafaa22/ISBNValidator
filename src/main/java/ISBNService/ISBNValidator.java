package ISBNService;

import com.daehosting.webservices.isbn.*;
import com.dataaccess.webservicesserver.*;

public class ISBNValidator {
	
    public boolean validateISBN10(String isbn) {
        ISBNService service = new ISBNService();
        ISBNServiceSoapType isbnServiceSoap = service.getISBNServiceSoap();
        return isbnServiceSoap.isValidISBN10(isbn);
    }

    
    public boolean validateISBN13(String isbn) {
        ISBNService service = new ISBNService();
        ISBNServiceSoapType isbnServiceSoap = service.getISBNServiceSoap();
        return isbnServiceSoap.isValidISBN13(isbn);
    }
    
    public String changeResult(String isbn, String text) {
    	TextCasing textService = new TextCasing();
        TextCasingSoapType textServiceSoap = textService.getTextCasingSoap();
    	
    	 char lastChar = isbn.charAt(isbn.length() - 1);
         boolean isEven= Character.isDigit(lastChar) && (lastChar - '0') % 2 == 0;
         
         if(isEven)
        	 return textServiceSoap.allUppercaseWithToken(text, "");
         else
        	 return textServiceSoap.allLowercaseWithToken(text, "");
    }
}
