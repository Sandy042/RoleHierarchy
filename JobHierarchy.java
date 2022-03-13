package JobHierarchy;
import java.util.*;
public class JobHierarchy {
	
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
			 List<String> roledata= new ArrayList<String>(); 
			 List<String> reportTo= new ArrayList<String>(); 
			 List<String> userName= new ArrayList<String>();
			 List<String> userRole= new ArrayList<String>();
		    int ch=0;
		    int i=0;
		    System.out.print("Create the root role:\n");
		    System.out.print("Enter the root name: ");
		    roledata.add(scan.next());
		    reportTo.add(0,"null");
		    System.out.println(roledata);
		    while(true) 
		    {
		    System.out.print("\nOperations:\n");
		    System.out.print("1.Add Sub Role.\n2.Display Roles\n3.Delete Roles\n4.Add Users\n5.Display Users.\n6.Display Users and sub Users.\n7.Delete Users\n8.Number of users from top.\n9.Height of role hierarchy.\n10.Common Boss\n");
		    System.out.print("Action to be performed: ");
		    ch=scan.nextInt();
		    scan.nextLine();
		    
		    switch(ch) {
		    
		    case 1:
		    	System.out.print("\nEnter Sub Role Name: ");
		    	roledata.add(scan.nextLine());
		    	System.out.print("Enter reporting to role  name: ");
		    	reportTo.add(scan.nextLine());
		    	 break;
		    	 
		    case 2:
		    	for(int f = 0; f < roledata.size(); f++)
		    	{   
		    	    System.out.print(roledata.get(f)+", ");
		    	}  
		    	 break;
		    	 
		    case 3:
		    	System.out.print("\nEnter Role to be deleted: ");
		    	roledata.remove(scan.next());
		    	 break;
		    case 4:
		    	
		    	System.out.print("\nEnter User Name: ");
	    	    userName.add(scan.nextLine());
	    	    System.out.print("\nEnter Role: ");
	    	    userRole.add(scan.nextLine());
		    	 break;
		    	 
		    case 5:
		    	int l=userName.size();
		    	for(int c=0;c<l;c++)
		    	{
		    	    System.out.println(userName.get(c)+"-"+userRole.get(c));
		        } 
		    	break;
		    	 
		    case 6: 
		    	int cnt=0;
		    	for(int a=0;a<userName.size();a++) 
		    	{
		    		for(int b=0;b<userName.size();b++) 
		    		{
		    	if((roledata.get(a)).equals(userRole.get(b))) 
		    	{
		    		System.out.print(userName.get(a)+"-");
		    		cnt++;
		    	}	
		    	}
		    		for(int p=cnt;p<userName.size();p++) 
		    		{
		    			if(userRole.get(p)!=(reportTo.get(p)))
		    			{
		    				System.out.print(userName.get(p)+",");
		    			}
		    		
		    		System.out.print("\n");
		    	}
		    	}
		    	 break;
		    	 
		    case 7:
		    	System.out.print("\nEnter Username to be deleted: ");
		    	userName.remove(scan.next());
		    	 break;
		    case 8:
		    	// System.out.print("Number of users from top.");
		    	 break;
		    case 9:
		    	// System.out.print("Height of role hierarchy.");
		    	 break;
		    case 10:
		    	 System.out.print("Common Boss -"+userName.get(0));
		    	 break;
		    }
		   
		 
		    }  
	}

}
