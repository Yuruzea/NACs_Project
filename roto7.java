import java.util.Random;

public class roto7{
    public static void main(String[] args){
        int chs=7;
        int[] num=new int[38];
        for(int i=0;i<=37;i++){
            num[i]=i;
        }
        Random rdm=new Random();
        int[] set1=new int[8];
        int ans=0;
        for(int j=0;j<=chs;j++){
            ans=num[rdm.nextInt(38)];
            if(ans==0){
                System.out.println("error:0 was chosen");
                System.out.println("      Please execute the program once more");
                System.exit(1);
            }
            set1[j]=ans;
        }

        int[] set2=new int[7];
        for(int p=0;p<chs;p++){
            set2[p]=set1[p];
        }
        int m=0;
        for(int k=0;k<set2.length-1;k++){
            for(int l=set2.length-1;l>k;l--){
                if(set2[l]<set2[l-1]){
                    m=set2[l];
                    set2[l]=set2[l-1];
                    set2[l-1]=m;
                }
                if(set2[l]==set2[l-1]){
                    System.out.println("error:The selected number was duplicated");
                    System.out.println("      Please execute the program once more");
                    System.exit(1);
                }
            }
        }

        for(int o=0;o<chs;o++){
           System.out.printf("%d ",set2[o]);
        }
        System.out.printf("\n");
        System.out.println("I wish you good luck!");
    }
}