// this program is prepared by patelvraj_21ce105
// Develop a Program that illustrate method overloading concept.
// GITHUB LINK : https://github.com/PatelVraj10/java-practical-file-1
public class P2_5 {
float getAverage(float a)
{ 
    //Here we use getter 
    float avg;
    avg=a; 
    return avg;
}
float getAverage(float a,float b)
{	
    //Here we use getter 
    float avg;
    avg=(a+b)/2; 
    return avg;
}
float getAverage(float a,float b,float c)
{	 
    //Here we use getter
    float avg; 
    avg=(a+b+c)/3; 
    return avg;
}
}
