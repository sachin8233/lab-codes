package rmi;

import java.rmi.*;

public class Client {
    public static void main(String args[]) {
        try {
            ServerInterface stub = (ServerInterface) Naming.lookup("rmi://localhost:5001/server");
           //System.out.println(stub.Factorial(5));
           // System.out.println(stub.Sub(34, 4));
           // System.out.println(stub.Div(34, 4));
           // System.out.println(stub.fibonacci());
            
        //   int a[][]=  stub.MatrixMultiplication();
        //   for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++)System.out.print(a[i][j] +" ");
        //     System.out.println();
        //   }
        int ans[][]=stub.matrixTranspose();
        for(int i=0;i<3;i++){    
                for(int j=0;j<3;j++){    
             System.out.print(ans[i][j]+" "); 
            // System.out.println();   
                }   
                System.out.println();

            }
            

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}  