public class numprim{
	public static void main(String[] arg){
		System.out.println("Numeros Primos");
		for (int j=2;j<=100;j++){
			int a=0;
			for(int i=1;i<=100;i++){
			     if(j%i==0)
			     a++;
			}
 			if (a==2){
			System.out.println(j);
			}
		}
	}
}