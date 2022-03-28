package class_object;

public class Test {
	
	public static void main(String[] args) {
		
		Book b = new Book();
		/*
		 *  //object-1
		 *   (24 bytes)
		 *    b[
		 *        bookName
		 *        author
		 *        price
		 *        pages
		 *     ]
		 *     
		 *     //object-2
		 *     (24 bytes)
		 *     b1[
		 *        bookName
		 *        author
		 *        price
		 *        pages
		 *     ]
		 */
		
		b.bookName = "Math";
		b.author = "S.K Sharma";
		b.price = 5000;
		b.pages = 2500;
		
		b.printBookInfo();
		
		int a,d,c;//general variable
		   a = 900;
		
		Book x,y,z;//Reference variable
		     x = new Book();
		     
	}
}
