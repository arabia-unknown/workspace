//7018903 –xˆä–GŠó
package s7018903_conversion;

public class S7018903_LengthConversion {
    public void print(double n){
        System.out.println(n + "[km] = " + Math.round( (n * 0.6214)*10.0 )/10.0+"[mile]");//km¨mileo—Í
        System.out.println(n + "[km] = " + Math.round( (n * 1093.613298)*10.0 )/10.0+"[yard]");//km¨yardo—Í
    
    }
}