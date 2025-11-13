public class operationlogique {
    public static void main(String[] args) {
        int A=6,B=21;
        boolean Res;
        Res=A>B;
        System.out.println ("A>B?"+Res);
        /*A>B?false*/
        Res=!(A>B);
        System.out.println("!(A>B)?"+Res);
        /* !(A>B)?true*/
        Res=A<B;
        System.out.println("A<B?"+Res);
        /* A<B?true*/
        Res=A==B;
        System.out.println("A==B ?"+Res);
        /* A==B ?false*/

        Res=A!=B;
        System.out.println("A!=B?"+Res);
        /*A!=B?true*/
        Res=(A<B)&(A==B);
        System.out.println("(A<B)&(A==B)"+Res);
        /*(A<B)&(A==B)false*/
        Res=(A<B)|(A==B);
        System.out.println("(A<B)|(A==B)"+Res);
        /*(A<B)|(A==B)true*/
        Res=(A<B)^(A==B);
        System.out.println("(A<B)^(A==B)"+Res);
        /*(A<B)^(A==B)true*/

        Res=A<B?true:false;
        System.out.println("A<B?true:false"+Res);
        /*A<B?true:falsetrue*/

        



        
    }
    
}
