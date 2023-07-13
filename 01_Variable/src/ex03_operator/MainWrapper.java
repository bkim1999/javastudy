package ex03_operator;

public class MainWrapper {
  
  // 메소드 정의
  public static void ex01() {

    int a = 5;
    int b = 2;
    
    int add = a + b;
    int sub = a - b;
    int mul = a * b;
    int mok = a / b;
    int mod = a % b;
    
    System.out.println(add);
    System.out.println(sub);
    System.out.println(mul);
    System.out.println(mok);
    System.out.println(mod);
    
    double x = 5;
    double y = 2;

    double addResult = x + y;
    double subResult = x - y;
    double mulResult = x * y;
    double mokResult = x / y;
    double modResult = x % y;
    
    System.out.println(addResult);
    System.out.println(subResult);
    System.out.println(mulResult);
    System.out.println(mokResult);
    System.out.println(modResult);
    
    int i = 5;
    int j = 2;
    
    double result = (double)i / (double)j;
    System.out.println(result);
     
  }
  
  public static void ex02() {
    
    int a = 10;
    System.out.println(++a);
    System.out.println(a);
    
    int b = 10;
    System.out.println(b++);
    System.out.println(b);
    
  }
  
  public static void ex03() {
    int a = 10;
    int b = 1;
    a += b;
  }
  
  public static void ex04() {
    int a = 3;
    int b = 5;
    
    boolean result1 = a > b;
    boolean result2 = a >= b;
    boolean result3 = a < b;
    boolean result4 = a <= b;
    boolean result5 = a == b;
    boolean result6 = a != b;
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(result6);
    
    int x = 10;
    int y = 20;
    
    boolean andResult = x == 10 && y == 10;
    boolean orResult = x == 10 || y == 10;
    boolean notResult = !(x==10 || y == 10);
    
    System.out.println(andResult);
    System.out.println(orResult);
    System.out.println(notResult);
    
    /* Short Circuit Evaluation
     * 1. 논리 AND : 결과 false -> 더이상 체크 X
     * 2. 논리 OR  : 결과 true  -> 더이상 체크 X
     */
    
    int i = 10;
    int j = 10;
    
    boolean andSceResult = (++i == 10) && (++j == 10);
    System.out.println("j = " + j);
    
    boolean orSceResult = (j++ == 10) || (i++ == 10);
    System.out.println("i = " + i);
       
  }
  
  public static void ex05() {
    int score = 50;
    String result = score >= 60 ? "합격" : "불합격";
    System.out.println(result);
  }
  
  public static void ex06() {
    String supers = "SUPER";
    String shy = "SHY";
    String superShy = supers + shy;
    System.out.println(superShy);
  }
  
  public static void main(String[] args) {
   
    // 메소드 호출
    firstLove();

  }
  
  public static void supershy() {
    System.out.println("I'm super shy super shy but wait a minute while I make you mine make you mine"
                      + "떨리는 지금도 You're on my mind all the time I wanna tell you but I'm super shy super shy"
                      + "나 원래 말도 잘하고 그런데 왜 이러는지 I don't like that"
                      + "but I'm supershy super shy wait a minute while I make you mine make you mine"
                      + "You don't even know my name do you?"
                      + "You don't even know my name do you?");
  }
  
  public static void firstLove() {
    System.out.println("주인공은 아니었지"
                      + "\n누구의 시선에서도"
                      + "\n그냥 스쳐지나가거나"
                      + "\n친구3이라거나"
                      + "\n이름 없는 역할뿐"
                      + "\n너에게는 알 수 없는"
                      + "\n멋진 향기가 났었지"
                      + "\n지나칠 수 없는 마음을"
                      + "\n대사 한 줄 없지만"
                      + "\n말하고 싶었는데"
                      + "\n창가에 비친 너의 얼굴은"
                      + "\n나만을 위한 등장이었는지"
                      + "\n단 한 번의 명장면이"
                      + "\n빠르게 지나가고 있었지"
                      + "\n소리쳐 이름을 불러볼까"
                      + "\n한시간쯤은 기억해줄까"
                      + "\n뒤를 돌아봐주었지만"
                      + "\n너의 미소는"
                      + "\n내게 와주지 않앗지"
                      + "\n다음 편이 기대되지 않는"
                      + "\n예상 가능한 엔딩만 남은"
                      + "\n로맨스도 뭣도 아닌"
                      + "\n나의 부동의 첫사랑"
                      + "\n좋아하는 마음이란"
                      + "\n왜 감출 수가 없는지"
                      + "\n나는 바보같은 말투로"
                      + "\n대본에도 없었던"
                      + "\n고백을 해버렸지"
                      + "\n대답이 없는 너의 표정은"
                      + "\n누구를 위한 연출이었는지"
                      + "\n웃기라도 해준다면"
                      + "\n이상한 애가 되도 좋은데"
                      + "\n소리쳐 이름을 불러볼까"
                      + "\n30분쯤은 기억해줄까"
                      + "\n뒤를 돌아봐 주었지만"
                      + "\n너의 미소는"
                      + "\n내게 와주지 않았지"
                      + "\n다음 편이 기대되지 않는"
                      + "\n예상 가능한 엔딩만 남은"
                      + "\n로맨스도 뭣도 아닌"
                      + "\n나의 부동의 첫사랑"
                      + "\n굳이 응원해준 사람도 없었지만"
                      + "\n너를 향한 노래가 생겼어"
                      + "\n이젠 웃으며 부를 수 있어"
                      + "\n그저 흐릿한 조명처럼"
                      + "\n너의 미소를 빛내줄 수만 있다면"
                      + "\n예고편이 공개되지 않고"
                      + "\n뻔한 엔딩도 맺지 못했지만"
                      + "\n나의 마음속 언제나"
                      + "\n항상 빛나고 있는"
                      + "\n부동의 첫사랑");
  }             
  
  public static void gradation() {
    System.out.println("밤은 다시 길고 깊어졌네"
                     + "/n나는 점점 너로 잠못들게돼"
                     + "/n글로 적어내긴 어려운 이 기분을"
                     + "/n너도 느꼈으면 좋겠는데"
                     + "/n너는 아무 생각 없이 몇 번"
                     + "/n나를 지나가며 웃은 거라지만"
                     + "/n나의 하얀 옷에 너의 잉크가 묻어"
                     + "/n닦아낼 수 없을만큼 번졌네"
                     + "/n달콤한 색감이 물들어 조금씩"
                     + "/n정신을 차렸을 땐 알아볼수도 없지"
                     + "/n가득한 마음이 여물다 못해 터지고 있어"
                     + "/n내일은 말을 걸어봐야지"
                     + "/n요즘 노랜 뭔가 맘에 안들어"
                     + "/n네게 들려주기엔 넘 어려워서"
                     + "/n나름 며칠밤을 세워 연습했지만"
                     + "/n네게 들려주기엔 무린 것같아"
                     + "/n너는 번질 수록 진해져가고"
                     + "/n나의 밤은 다시 길고 외롭지만"
                     + "/n자연스레 떠오르는 너의 얼굴은"
                     + "/n방을 가득 채워 무지개같이"
                     + "/n달콤한 색감이 물들어 조금씩"
                     + "/n정신을 차렸을 땐 알아볼 수도 없지"
                     + "/n가득한 마음이 여물다 못해 터지고 있어"
                     + "/n내일은 말을 걸어봐야지"
                     + "/n바람을 맞고 빗물에 젖어"
                     + "/n나의 색감도 흐려지겠지만"
                     + "/n너는 항상 빛에 반짝일테니까"
                     + "/n멋진 말들을 전하지 못하고"
                     + "/n아무도 관심 없는 그림이 되겠지만"
                     + "/n달콤한 색감은 감추지 못해 터지고 있어"
                     + "/n내일은 말을 걸어봐야지"
                     + "/n그냥 이 노래가 어떨까 싶어"
                     );
  }
    
    public static void hurt(){
      System.out.println("보고싶은 생각에"
                       + "들어간 우리 창에"
                       + "나는 말을 거는데"
                       + "보내지는 않을래"
                       + "느린 한마디보다"
                       + "조용합이 더 좋아"
                       + "기다리고 있지만"
                       + "매일 이런 건 아냐"
                       + "난 재미없어"
                       + "게임 같은 거"
                       + "다 필요없어"
                       + "아무리 좋아도 널 no"
                       + "말로만은 지겨운 걸"
                       + "먼저 와서 보여줘"
                       + "먼저 와서 보여줘"
                       + "I'm not gonna be the one to get hurt"
                       + "Hurt, nono I'm not gonna be the one to get hurt"
                       + "매일 잠들기 전에 그리고 또 아침에"
                       + "쥐고 있는 내 손엔 너 없는 화면인데"
                       + "느린 한마디 보다"
                       + "조용함이 더 좋아"
                       + "");
    }
    
    public static void hurt(){
      System.out.println("보고싶은 생각에"
                       + "들어간 우리 창에"
                       + "나는 말을 거는데"
                       + "보내지는 않을래"
                       + "느린 한마디보다"
                       + "조용함이 더 좋아"
                       + "기다리고 있지만"
                       + "매일 이런 건 아냐"
                       + "난 재미없어"
                       + "게임 같은 거"
                       + "다 필요없어"
                       + "아무리 좋아도 널 no"
                       + "말로만은 지겨운 걸"
                       + "먼저 와서 보여줘"
                       + "먼저 와서 보여줘"
                       + "I'm not gonna be the one to get hurt"
                       + "Hurt, nono I'm not gonna be the one to get hurt"
                       + "매일 잠들기 전에 그리고 또 아침에"
                       + "쥐고 있는 내 손엔 너 없는 화면인데"
                       + "느린 한마디 보다"
                       + "조용함이 더 좋아"
                       + "기다리고 있지만"
                       + "매일 이런 건 아냐"
                       + "난 재미없어"
                       + "게임 같은 거"
                       + "다 필요없어"
                       + "무리도 좋아도 널")
      }
}