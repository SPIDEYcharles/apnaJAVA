import java.util.*;

class Complex{
    int real;
    int imag;
    public Complex (int r,int i){
        real = r;
        imag = i;
    } 

    public static Complex add(Complex a, Complex b){
        return new Complex((a.real+b.real),(a.imag+b.imag));
    }
    
    public static Complex prod(Complex a, Complex b){
        return new Complex((a.real*b.real)-(a.imag*b.imag),(a.real*b.imag)+(b.real*a.imag));
    }
    
    public static Complex diff(Complex a, Complex b){
        return new Complex((a.real-b.real),(a.imag-b.imag));
    }

    public void printComp(){
        if (real==0 && imag==0) {
            System.out.println(0);
        }
        else if(imag == 0 ){
            System.out.println(real);
        }
        else if(real == 0){
            String i = imag==1?"i":imag==-1?"-i":imag+"i";
            System.out.println(i);
        }
        else{  
            String sign = imag>0?"+":"-";   
            String i = Math.abs(imag) ==1?"i":"i"+Math.abs(imag);
            System.out.println(real+sign+i);
        }
        
    }
    
}

public class q1 {
    public static void main(String arg[]){
        Complex a = new Complex(1,-3);
        Complex b = new Complex(0,0);

        Complex c = Complex.add(a, b) ;
        c.printComp();
    }
}