package lab4;

public class Item {
			private int uid=1,ncopies=3;

			private String title="Never Give up!";

			Item() {

			}

			public void setter()

			{	

			}

			public int getUid()

			{	

				return uid;

			}

			public int getNcopies()

			{	

				return ncopies;

			}

			public String getTitle()

			{	

				return title;

			}

			boolean equals()

			{

				return false; 

			}

			public String toString()

			{

				return null;

			}

			public void print()

			{	

			}

			public void checkIn()

			{	

			}

			public void checkOut() {

			}

			public void addItem() {

			}

		}

		abstract class WrittenItem1 extends Item{

			private String author="Meghana";

			public void setter()

			{	

			}

			public String getAuthor()

			{	

				return author;

			}

			public void checkIn()

			{	

				System.out.println("Check in");

			}

			public void checkOut() {

				System.out.println("Check out");

			}

		}

		class Book extends WrittenItem1{

			public void print()

			{

				System.out.println("Unique Id:"+getUid()+"\nNo of copies:"+getNcopies()+"\nTitle:"+getTitle());

			}

		}

		public class JournalPaper extends WrittenItem1{

			private int year;

			public static void main(String args[]) {

				JournalPaper obj = new JournalPaper();

				Book b = new Book();

				obj.checkIn();

				b.print();

				System.out.println("Author: "+b.getAuthor());

				obj.checkOut();

			}

		}



