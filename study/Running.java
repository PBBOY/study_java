import java.util.Arrays;
import java.util.HashMap;

/**
 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.

입출력 예
participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"
 */

/**
 문제 파악 
 1. 스트링 배열로 참가자와 완주자가 정보가 주어짐.
 2. 완주자를 Hash에 담아보자.
 3. 해시에 담겨진 값에 맞춰서 완주자가 있는지 체크하자.
 4. 완주자가 있으면 넘기고 없으면 그 값을 return 
 5. 중복일 경우가 있어서 중복값 확인하자.
 */


public class Running {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        // Arrays.sort(participant);
        // Arrays.sort(completion);
        
        // int i;

        // for (i=0;i<completion.length; i++){

        //     if (! participant[i].equals(completion[i])){
        //         return participant[i];
        //     }  
        // }
        // return participant[i];

       
        // 하나의 해시에 key(String)는 player / Integer는 중복 체크를 위해 사용
        HashMap<String, Integer> hash = new HashMap<>();

        // 완주자 해시에 담는다.
        for (String player: participant){
                            // 기존에 있는 key값이 있는지 확인하고 있으면 그 키의 value를 return해서 +1을 한다.
            hash.put(player, hash.getOrDefault(player, 0) + 1);
        }
        // 완주자는 hash의 value 값을 get해서 값을 빼고 기존 hash를 update한다.
        for (String player: completion){
            hash.put(player, hash.get(player) -1);
        }

        // 해시가 0이 아니면 완주가 아니기 때문에 그 player의 key값을 전달한다.
        for (String value : hash.keySet()){
            if (hash.get(value) != 0){
                answer = value;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant  = {"mislav", "stanko", "mislav", "ana"};

        String[] completion = {"mislav", "stanko", "ana"};

        Running running = new Running();

        System.out.println(running.solution(participant, completion));
    }
}
