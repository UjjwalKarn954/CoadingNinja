
public class solution {

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		// Write your code here
       
if(disks==0){
    //System.out.println(source+" "+destination);
    return;
}
        towerOfHanoi(disks-1,source,destination,auxiliary);
        System.out.println(source+" "+destination);
        towerOfHanoi(disks-1,auxiliary,source,destination);
	}
}
