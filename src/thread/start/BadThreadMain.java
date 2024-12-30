package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        // 메인 메서드가 아니라 메인 스레드임
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.run();      // run() 직접 실행
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후");


        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
