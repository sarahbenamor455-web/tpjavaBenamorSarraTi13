public class app2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[][] m=new int[30];
        do{
            System.out.println("donner nl");
            int nl=sc.nextInt();
            System.out.println("donner nc");
            int nc=sc.nextInt();}

        while(nl>30||nc>30);
        for(int i=0;i<nl;i++){
            for(int j=0;j<nc;j++){
                do{
                System.out.println("donner t["+i+"]"+"t["+j+"]");
                m[i][j]=sc.nextInt();}
                while(m[i][j]<=30);
                



            }
        }

        

    }
    
}