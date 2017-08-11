/* To use List or ArrayList, you must import:
 *	-- java.util.List, 
 *	-- java.util.ArrayList, or 
 *	-- java.util.*;
*/
import java.util.*;

//Declare the class
public class ListObject {
	
	//Instance fiels or variable
	List<String> item1;
	List<Integer> item2;
	List<Object> objList;
	
	public ListObject(){
		item1 = new ArrayList<>();
		item2 = new ArrayList<>();
		objList = new ArrayList<>();
		
		creatItem1();
		//printListObject(item1);
		createItem2();
		//printListObject(item2);
		addItem1();
		//printListObject(objList);
		addItem2();
		//printListObject(objList);
		addItem1Item2();
		//printListObject(objList);
		addItem1Item2Mixed();
		printListObject(objList);
	}
	
	void creatItem1(){
		for(int i=0;i<20;i++){	//Adding 20 items of type String
			item1.add("Item1 #"+(i+1));
		}		
	}
	
	void createItem2(){
		for(int j=0;j<5;j++){	//Adding 5 items of type Integer
			item2.add(j+1);
		}
	}
	
	void addItem1(){
		objList.clear();
		for(int k=0; k<item1.size(); k++){
			objList.add(item1.get(k));
		}
	}
	
	void addItem2(){
		objList.clear();
		for(int k=0; k<item2.size(); k++){
			objList.add(item2.get(k));
		}
	}
	
	void addItem1Item2(){
		objList.clear();
		for(int k=0; k<item1.size(); k++){
			objList.add(item1.get(k));
		}
		for(int k=0; k<item2.size(); k++){
			objList.add(item2.get(k));
		}
	}
	
	void addItem1Item2Mixed(){
		objList.clear();
		for(int k=0; k<item1.size(); k++){
			objList.add(item1.get(k));
		}
		int i=0;
		for(int k=5; k<objList.size(); k+=6){
			objList.add(k, item2.get(i));
			i++;
			if(i==5)break;
		}
	}
	
	void printListObject(List<?> list){
		for(int i=0; i<list.size(); i++){
			System.out.println ("Index "+i+" - "+list.get(i)+"\n");
		}
	} 
	
	public static void main(String args[]){		
		new ListObject();		
	}
	
}