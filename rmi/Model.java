package rmi;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
 import java.util.Scanner;
// import java.io.*;

//! this class needs to be present in both server as well as client as this acts as the object for passing all the data

interface ServerInterface extends Remote{
    public int Add(int a,int b) throws RemoteException;
    public int Sub(int a,int b) throws RemoteException;
    public int Mul(int a,int b) throws RemoteException;
    public int Div(int a,int b) throws RemoteException;
    public int Factorial(int a) throws RemoteException;
    public int [][] MatrixMultiplication() throws RemoteException;
    public int fibonacci() throws RemoteException;
    public int[][] matrixTranspose() throws RemoteException;
    public int inverseMatrix(int [][] a) throws RemoteException;
}

public class Model extends UnicastRemoteObject implements ServerInterface{
    
    protected Model() throws RemoteException {
        super();
    }

    public int Add(int a, int b) throws RemoteException{
        return a+b;
    }

    @Override
    public int Sub(int a, int b) throws RemoteException {
        
        return a-b;
    }

    @Override
    public int Mul(int a, int b) throws RemoteException {
        return a*b;
    }

    @Override
    public int Div(int a, int b) throws RemoteException {
        return a/b;
    }

    @Override
    public int Factorial(int a) throws RemoteException {
        int ans=1;
        for(int i=1;i<=a;i++){
            ans*=i;
        }
        return ans;
    }


    @Override
    public int [][] MatrixMultiplication() throws RemoteException {
        int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
            int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
    
//creating another matrix to store the multiplication of two matrices    
             int c[][]=new int[3][3];  //3 rows and 3 columns  
            
//multiplying and printing multiplication of 2 matrices    
           for(int i=0;i<3;i++){    
           for(int j=0;j<3;j++){    
                c[i][j]=0;      
           for(int k=0;k<3;k++){      
           c[i][j]+=a[i][k]*b[k][j];      
   }
         
   }   
        } 
        return c;
    }

    @Override
    public int fibonacci() throws RemoteException {
         
        int i;
        Scanner sc= new Scanner(System.in);
       int  n=sc.nextInt();
        sc.close();
        int dp[]=new int[n]; 
        dp[0]=0;
        dp[1]=1;
        for(i=2;i<n;i++)
        dp[i]=dp[i-1]+dp[i-2]; 
       // System.out.println("The nth fibonacci number is "+values[n-1]);
       
        return dp[n-1];
        
    }

    @Override
    public int[][] matrixTranspose() throws RemoteException {
         int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
    
        //creating another matrix to store transpose of a matrix  
        int transpose[][]=new int[3][3];  
            
        //Code to transpose a matrix  
        for(int i=0;i<3;i++){    
        for(int j=0;j<3;j++){    
        transpose[i][j]=a[j][i];  
        }    
        }    
    
        return transpose;    

   }

    @Override
    public int inverseMatrix(int[][] a) throws RemoteException {
        // TODO Auto-generated method stub
        return 0;
    }

   

}