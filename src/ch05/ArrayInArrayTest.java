package ch05;

public class ArrayInArrayTest {
    public static void main(String[] args) {
        int[][] scores = {
                {75,100,88},//수학
                {98,100,76},//영어
                {100,90,100}//국어
        };
        String[] names = {"김영희","김철수","홍길동"};
        String[] subject = {"수학","영어","국어"};
        int[] totalSocres = new int[names.length];
        int[] subjectScores = new int[subject.length];
        for(int i =0;i< scores.length;i++){
            for(int z=0;z<scores[i].length;z++ ){
                totalSocres[i]+=scores[z][i];
                subjectScores[i]+=scores[i][z];
            }
        }
        for(int i = 0;i<scores.length;i++){
            System.out.printf("%s 총점 : %d, 평균 : %.1f\n",names[i],totalSocres[i],(float)(totalSocres[i]/scores[i].length));
        }
        for(int i = 0;i<subject.length;i++){
            System.out.printf("%s 총점 : %d, 평균 : %.1f\n",subject[i],subjectScores[i],(float)(subjectScores[i]/ subjectScores.length));
        }
    }
}
