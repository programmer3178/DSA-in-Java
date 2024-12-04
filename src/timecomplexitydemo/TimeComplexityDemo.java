/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timecomplexitydemo;
public class TimeComplexityDemo {
public static void main(String[] args) {
        double now = System.currentTimeMillis();
        TimeComplexityDemo demo = new TimeComplexityDemo();
        System.out.println(demo.findSum(99999));
        System.out.println("Time taken - " + (System.currentTimeMillis() - now) + "milliseconds");

    }

/*Two approaches 
1.Mathematical formula and normal looping method
2.Normal Looping method

public int findSum(int n){
    int sum = 0;
    for(int i = 1; i <= n; i++){
        sum = sum + i;
    }
return sum;
}
}
*/
//1.Mathematical formula method
public int findSum(int n)
{
return n * (n + 1) /2;
}
}