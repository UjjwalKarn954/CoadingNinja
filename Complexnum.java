
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}


public class ComplexNumbers {
	// Complete this class
    int real;
    int imaginary;
    public ComplexNumbers(int real, int imaginary){
        this.real=real;
        this.imaginary=imaginary;
        
    }
    
	public void plus(ComplexNumbers c2){
        this.real=this.real+c2.real;
        this.imaginary=this.imaginary+c2.imaginary;
        
    }
    public void multiply(ComplexNumbers c2){

     int real1 = this.real;
        int imag1 = this.imaginary;
        this.real = real1 * c2.real + (-1)*(imag1*c2.imaginary);
        this.imaginary = real1 * c2.imaginary + (imag1 * c2.real);
        

    }
    public void print(){
        System.out.println(real+" "+"+"+" "+"i"+imaginary);
    }
}
