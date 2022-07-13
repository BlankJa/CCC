import java.util.Scanner;
public class Punchy {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int A=0,B=0;
        String b;

        while (true){
            String v = input.next();
            int n = Integer.parseInt(v);
            if(n==7){
                break;
            }
            String a = input.next();
            
            switch(n){

                case 1:
                    String l = input.next();
                    int m = Integer.parseInt(l);
                    if(a.equals("A")){
                        A=m;
                    }
                    else{
                        B=m;
                    }
                    break;
                case 2:
                    if(a.equals("A")){
                        System.out.println(A);

                    }
                    else{
                        System.out.println(B);
                    }
                    break;
                case 3:
                    b = input.next();
                    if(a.equals("A")&&b.equals("B")){
                        A+=B;
                    }
                    else if(a.equals("B")&&b.equals("A")){
                        B+=A;
                    }
                    else if(a.equals("A")&&b.equals("A")){
                        A+=A;
                    }
                    else if(a.equals("B")&&b.equals("B")){
                        B+=B;
                    }
                    break;

                case 4:
                    b = input.next();
                    if(a.equals("A")&&b.equals("B")){
                        A*=B;
                    }
                    else if(a.equals("B")&&b.equals("A")){
                        B*=A;
                    }
                    else if(a.equals("A")&&b.equals("A")){
                        A*=A;
                    }
                    else if(a.equals("B")&&b.equals("B")){
                        B*=B;
                    }
                    break;
                case 5:
                 b= input.next();
                 if(a.equals("A")&&b.equals("B")){
                    A-=B;
                }
                else if(a.equals("B")&&b.equals("A")){
                    B-=A;
                }
                else if(a.equals("A")&&b.equals("A")){
                    A-=A;
                }
                else if(a.equals("B")&&b.equals("B")){
                    B-=B;
                }
                    break;
                case 6:
                 b = input.next();
                 if(a.equals("A")&&b.equals("B")){
                    A/=B;
                }
                else if(a.equals("B")&&b.equals("A")){
                    B/=A;
                }
                else if(a.equals("A")&&b.equals("A")){
                    A/=A;
                }
                else if(a.equals("B")&&b.equals("B")){
                    B/=B;
                }
                    break;
            }


        }
    }
}
