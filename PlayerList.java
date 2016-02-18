public class PlayerList
{
	private static final int INITIAL_SIZE = 2;
	
	private Player[] storage;
	private int count;

	/*
	// Initialize a new instance of PlayerList
	// of size INITIAL_SIZE and
	// count initialized to 0
	*/
	public PlayerList(){
		count = 0;
		storage = new Player [INITIAL_SIZE];
		
	}

 
	//return the element at position index

	public Player get (int index){
		return storage[index];
	} 

	public void remove (int index) {
		int i = 0;
		if(count == 0)
			storage=storage;
		else if (count==1)
			count--;
		else if(storage.length>1){	
			while(i<storage.length-1){
				if(i<index)
					i++;
				else if (i==index){
					storage[index]=storage[i+1];
					i++;
				}			
				else if (i>index){
					storage[i]=storage[i+1];
					i++;	
				}
			}	
	
			Player [] temp = new Player [storage.length-1];
			count--;
		
			for(int z = 0; z<temp.length; z++)
				temp[z]=storage[z];
			
			storage = new Player [count];
		
			for (int z = 0; z<storage.length; z++)
				storage[z]=temp[z];	
		}
	}

	//return the number of elements in the list

	public int size(){
	
		return count;
	}


	//add the player p to the list

	public void add (Player p){
		if(storage.length==count){
			Player [] temp = new Player [count*2];
			for(int i = 0; i<storage.length; i++){
				temp[i]=storage[i];
			}
			storage=temp;
		}
		
		storage[count]=p;
		count++;
	}


	//return the index where p is in the list, -1 otherwise

	public int find (Player p)
	{	
		int i = 0;
		while(i<storage.length) {
			if (p.equals(storage[i])){
				return i;
			}
			i++;
		}
		return -1;		
	}

}
