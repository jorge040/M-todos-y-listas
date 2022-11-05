public class Lista {

    public static void main(String[] args) {
        int n;
        int v[]  = new int[8];
        n=10;
        v[0] = 58;
        v[1] = 68;
        v[2] = 920;
        v[3] = 15;
        v[4] = 16;
        v[5] = 85;
        v[6] = 75;
        v[7] = 32;

        System.out.println("Antes:"+"\n"+n+"\n"+v[0]+"\n"+v[1]+"\n"+v[2]+"\n"+v[3]+"\n"+v[4]+"\n"+v[5]+"\n"+v[6]+"\n"+v[7]+"\n");

        cambiar(n,v);

        System.out.println("Despues:"+"\n"+n+"\n"+v[0]+"\n"+v[1]+"\n"+v[2]+"\n"+v[3]+"\n"+v[4]+"\n"+v[5]+"\n"+v[6]+"\n"+v[7]+"\n");

    }

    public static void cambiar(int a, int [] b){
       
        a=10;
        b[0] = 58;
        b[1] = 90;
        b[2] = 25;
        b[3] = 15;
        b[4] = 16;
        b[5] = 85;
        b[6] = 75;
        b[7] = 32; 
        

        System.out.println("Cambiar:"+"\n"+a+"\n"+b[0]+"\n"+b[1]+"\n"+b[2]+"\n"+b[3]+"\n"+b[4]+"\n"+b[5]+"\n"+b[6]+"\n"+b[7]+"\n");

    }

}
