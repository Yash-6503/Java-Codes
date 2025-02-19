/*
create an Address Book application in Java that utilizes a Contact class to represent contacts.
The program should allow users to maintain an address book, add new contacts, remove existing contacts, 
and exit the application.
*/

import java.util.*;

public class AddressBookApplication 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		
		HashMap<String,Long> addressBook = new HashMap<String, Long>();
		do {
			System.out.println("\nAddress Book Application");
			System.out.println("1. Add Contact");
			System.out.println("2. Remove Contact");
			System.out.println("3. Display Contacts");
			System.out.println("4. Exit");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice) {
				case 1:
					System.out.println("Enter contact name: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Enter contact number: ");
					Long number = sc.nextLong();
					addressBook.put(name, number);
					System.out.println("Contact Name and Number added successfully..");
					break;
					
				case 2:
					if(addressBook.isEmpty()) {
						System.out.println("Address Book is empty");
					}else {
						System.out.println("Enter contact name: ");
						sc.nextLine();
						String cName = sc.nextLine();
						if(addressBook.containsKey(cName)) {
							addressBook.remove(cName);
							System.out.println("Contact removed from AddressBook");
						}else {
							System.out.println("Contact name not found");
						}
					}
					break;
					
				case 3:
					if(addressBook.isEmpty()) {
						System.out.println("Address Book is empty");
					}else {
						addressBook.forEach((k,v)->System.out.println(k+" : "+v));
					}
					break;
					
				case 4:
					System.out.println("Exiting....");
					System.exit(0);
					
				default:
					System.out.println("Invalid choice");
			}
		}while(choice != 4);
	}
}

/*
 
Address Book Application
1. Add Contact
2. Remove Contact
3. Display Contacts
4. Exit
Enter your choice: 
1
Enter contact name: 
Smith
Enter contact number: 
1234567890
Contact Name and Number added successfully..

Address Book Application
1. Add Contact
2. Remove Contact
3. Display Contacts
4. Exit
Enter your choice: 
3
Smith : 1234567890

Address Book Application
1. Add Contact
2. Remove Contact
3. Display Contacts
4. Exit
Enter your choice: 
1
Enter contact name: 
Alex
Enter contact number: 
0987654321
Contact Name and Number added successfully..

Address Book Application
1. Add Contact
2. Remove Contact
3. Display Contacts
4. Exit
Enter your choice: 
3
Alex : 987654321
Smith : 1234567890

Address Book Application
1. Add Contact
2. Remove Contact
3. Display Contacts
4. Exit
Enter your choice: 
2
Enter contact name: 
Scott
Contact name not found

Address Book Application
1. Add Contact
2. Remove Contact
3. Display Contacts
4. Exit
Enter your choice: 
2
Enter contact name: 
Smith
Contact deleted from AddressBook

Address Book Application
1. Add Contact
2. Remove Contact
3. Display Contacts
4. Exit
Enter your choice: 
3
Alex : 987654321

Address Book Application
1. Add Contact
2. Remove Contact
3. Display Contacts
4. Exit
Enter your choice: 
4
Exiting...
*/
