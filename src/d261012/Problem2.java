//문제 2: 배열 뒤집기
//새 배열을 만들지 말고 원래 배열 안에서 순서를 뒤집어봐.
//
//입력: {1, 2, 3, 4, 5}
//출력: 5 4 3 2 1
//{1, 2, 3, 4, 5, 6}처럼 길이가 짝수일 때도 되는지 확인해봐.
//생각해볼 것: 반복을 배열 길이의 절반까지만 돌리면 되는 이유는 뭘까?

package d261012;

public class Problem2 {
    public static void main(String[] args){

        int[] s = {1,2,3,4,5};
        int n=s.length/2;
        int temp;

        for(int i=0;i<n;i++){
            temp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=temp;}
        for(int i=0;i<s.length;i++)
            System.out.print(s[i]+" ");
    }
}
