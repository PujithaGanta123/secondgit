package quizDemo;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArr = {8,16,32,64,128};
		//option a: ArrayIndexOutOfBoundsException
		for(int i: intArr) {
			System.out.println(intArr[i] + " ");
		}
		
		
		//option b: 
		/*for(int i: intArr) {
			System.out.println(i + " ");
		}*/
		
		//option c: syntax error
		/*for(int i=0 : intArr) {
			System.out.println(intArr[i] + " ");
			i++;
		}*/
		
		//option d: index
		/*for(int i=0 ; i<intArr.length; i++) {
			System.out.println(i + " ");
		}*/
		
		//option e:
		/*for(int i=0 ; i<intArr.length; i++) {
			System.out.println(intArr[i] + " ");
		}*/
		
		//option f: initialize variable
		/*for(int i ; i<intArr.length; i++) {
			System.out.println(intArr[i] + " "); 
		}*/

	}

}
