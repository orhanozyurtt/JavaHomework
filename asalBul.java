
public class asalBul {
    public static void main(String[] args) {
        int bit = 100 ;

        boolean asal = false;
        //int deger = 32;

        for(int i = 2; i <= bit ; i++ ){
                if(i == 2){
                    System.out.print(i + " ");
                    continue;
                }
                for (int j = 2; j < i ; j++){
                    if(i % j == 0 ){
                        asal = false;
                        break;
                    }else {
                        asal = true;
                    }
                }
                if (asal == true){
                    System.out.print(i +" ");
                    asal = false;
                }

        }

        }

    }

