/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class unsortedarray {
    static int findElement(int arr[],int n,int key)
    {
        for(int i=0;i<n;i++)
        
            if(arr[i]==key)
                return i;
        return-1;
    }
               
            public static void main(String[] args) {
        int arr[]={12,34,10,6,40};
        int n=arr.length;
        int key=40;
        int position=findElement(arr,n,key);
        if(position==-1)
                    System.out.println("Element not found");
        else
                    System.out.println("Element found at position:"+(position+1));
    }
    
}
