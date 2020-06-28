/*public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int degree1[] = new int[n];
		for(int i = 0; i < n; i++){
			degree1[i] = s.nextInt();
		}
		int coeff1[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff1[i] = s.nextInt();
		}
		Polynomial first = new Polynomial();
		for(int i = 0; i < n; i++){
			first.setCoefficient(degree1[i],coeff1[i]);
		}
		n = s.nextInt();
		int degree2[] = new int[n];
		for(int i = 0; i < n; i++){
			degree2[i] = s.nextInt();
		}
		 int coeff2[] = new int[n];
		for(int i = 0; i < n; i++){
			coeff2[i] = s.nextInt();
		}
		Polynomial second = new Polynomial();
		for(int i = 0; i < n; i++){
			second.setCoefficient(degree2[i],coeff2[i]);
		}
		int choice = s.nextInt();
		Polynomial result;
		switch(choice){
		// Add
		case 1: 
			 result = first.add(second);
			result.print();
			break;
		// Subtract	
		case 2 :
			 result = first.subtract(second);
			result.print();
			break;
		// Multiply
		case 3 :
			 result = first.multiply(second);
			result.print();
			break;
		}

	}
  */


public class Polynomial {
    int array[];

	 Polynomial(){
     array=new int[10];
        
    }
	/* This function sets coefficient for a particular degree value, if degree is not there in the polynomial
	 *  then corresponding term(with specified degree and value is added int the polynomial. If the degree
	 *  is already present in the polynomial then previous coefficient is replaced by
	 *  new coefficient value passed as function argument
	*/
	public void setCoefficient(int degree, int coeff){
        if (degree>this.array.length - 1){
            // doubleCapacity();
            int tempArray[] = this.array;
            this.array = new int[degree + 1];
            for(int i = 0; i < tempArray.length; i++) {
                this.array[i] = tempArray[i];
            }
        }

		this.array[degree]=coeff;
	}
		// private void doubleCapacity() {
		// int temp[]=array;
		// array=new int[2*temp.length];
		// for(int i=0;i<temp.length;i++) {
		// 	array[i]=temp[i];
		// }
	
	// Prints all the terms(only terms with non zero coefficients are to be printed) in increasing order of degree. 
	public void print(){
        for(int i=0;i<this.array.length;i++){
            if(this.array[i]!=0){
                System.out.print(this.array[i]+"x"+ i + " ");
            }
        }
		
	}

	
	// Adds two polynomials and returns a new polynomial which has result
	public Polynomial add(Polynomial p){
        Polynomial result = new Polynomial();
        int size=Math.min(this.array.length, p.array.length);
        int i;
        for(i=0; i<size; i++){
            // array[i]=array[i]+p[i];
           result.setCoefficient(i, this.array[i] + p.array[i]);
        }
        while(i < this.array.length) {
         result.setCoefficient(i, this.array[i]);   
            i++;
        }
		
         while(i < p.array.length) {
         result.setCoefficient(i, p.array[i]);   
            i++;
        }
        return result;
	}
	
	// Subtracts two polynomials and returns a new polynomial which has result
	public Polynomial subtract(Polynomial p){
		 Polynomial result = new Polynomial();
        int size=Math.min(this.array.length, p.array.length);
        int i;
        for(i=0; i<size; i++){
            // array[i]=array[i]-p[i];
           result.setCoefficient(i, this.array[i] - p.array[i]);
        }
        while(i < this.array.length) {
         result.setCoefficient(i, this.array[i]);   
            i++;
        }
		
         while(i < p.array.length) {
         result.setCoefficient(i, -p.array[i]);   
            i++;
        }
        return result;
	}
    
    public int getCoeff(int degree){
        if(degree < this.array.length){
            return array[degree];
        }
        return 0;
    }
	
	// Multiply two polynomials and returns a new polynomial which has result
	public Polynomial multiply(Polynomial p){
        // if(degree>array.length){
        //     doubleCapacity();
        // }
        // int mul[]=new int[array.length];
        // mul[]=array;
        Polynomial mul = new Polynomial();
        for(int i=0;i< this.array.length;i++){
            for(int j=0;j<p.array.length;j++){
                int deg = i + j;
                int coeff = this.array[i] * p.array[j];
                int oldCoeff = mul.getCoeff(deg);
                mul.setCoefficient(deg, coeff + oldCoeff);
                }
            }
         return mul;
        }
        
         
		
	}

