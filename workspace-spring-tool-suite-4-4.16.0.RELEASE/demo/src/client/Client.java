package client;

import java.util.Scanner;

import com.cg.bean.Chapter;
import com.cg.bean.Publisher;

import book.Book;
import bookservice.BookService;
import chapterService.ChapterService;
import publisherService.PublisherService;

public class Client {

	public static void main(String[] args) {
		Book b=new Book();
		Publisher p=new Publisher();
		PublisherService ps=new PublisherService();
		BookService bs=new BookService();
		Chapter c=new Chapter();
		ChapterService ch1=new ChapterService();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1-Insert Publisher");
		System.out.println("2-Insert Book");
		System.out.println("3-Retrieve Publisher");
		System.out.println("4-Retrieve Book");
		System.out.println("5-Insert chapter");
		System.out.println("6-Retrive chapter");
		
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Enter publisherID");
			p.setPid(sc.nextInt());
			System.out.println("Enter PublisherName");
			p.setPname(sc.next());
			System.out.println("Enter number of books");
			p.setNumberofbooks(sc.nextInt());
			
			
			//persist
			ps.persistObject(p);
			System.out.println("Publisher added");
			break;
		case 2:
			System.out.println("Enter Book id");
			b.setBid(sc.nextInt());
			System.out.println("Enter Book Name");
			b.setBname(sc.next());
			System.out.println("Enter Publisher Id");
			b.setPid(sc.nextInt());
			System.out.println("Enter Book price");
			b.setPrice(sc.nextFloat());				
			bs.persistObject(b);
			System.out.println("Book added");
			break;
			
		case 3:
			System.out.println("Enter publisherID to retrieve");
			int pid=sc.nextInt();
			b=bs.retrieve(pid);
			System.out.println("Retrieved object:"+p);
			break;
			
		case 4:
			 System.out.println("Enter book id to retrieve");
			 int bid=sc.nextInt();
			 b=bs.retrieve(bid);
			 System.out.println("Retrieved object:"+b);
			  break;
		case 5:		
			System.out.println("Enter Chapter ID");
			c.setCid(sc.nextInt());
			System.out.println("Enter Chapter Name");
			c.setCname(sc.next());
			System.out.println("Enter Book ID");
			c.setBid(sc.nextInt());
			System.out.println("Enter number of pages");
			c.setNop(sc.nextInt());
			ch1.persistCHObject(c);
			break;
		case 6:
			ch1.retrieve(ch);
			break;
			
		default:
				System.out.println("Enter correct choice");
		}
		
		

	}

}
