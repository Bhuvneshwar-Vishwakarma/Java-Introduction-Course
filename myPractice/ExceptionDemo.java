package myPractice;
class Test1 
{ 
int m1()  
{ 
try   
{ 
System.out.println("hi try");   
 return 10;   
}  
finally   
{ 
System.out.println("hi finally");
        
} 
}  
public static void main(String[] args) 
 { 
int a;
Test1 t= new Test1();
a=t.m1();
//int a = new Test1().m1();   
System.out.println("return value="+a); 
 } 
}
