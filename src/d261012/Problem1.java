//문제 1: 점수 분석
//int[] scores = {72, 85, 90, 64, 98, 77};로 아래를 구해봐. 단 Arrays나 정렬 메서드는 쓰지 말고 반복문만 써.
//
//합: 486
//평균: 81.0
//최댓값: 98 (인덱스 4)
//최솟값: 64

package d261012;

public class Problem1 {
    public static void main(String[] args) {

        int[] scores = {72, 85, 90, 64, 98, 77};

        int sum = 0;
        int max = scores[0];
        int maxIndex = 0;
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];

            if (scores[i] > max) {
                max = scores[i];
                maxIndex = i;
            }

            if (scores[i] < min) {
                min = scores[i];
            }
        }
        double avg = (double) sum / scores.length;
        System.out.println("합: " + sum);
        System.out.println("평균: " + avg);
        System.out.println("최댓값: " + max + " (인덱스 " + maxIndex + ")");
        System.out.println("최솟값: " + min);
    }
}
