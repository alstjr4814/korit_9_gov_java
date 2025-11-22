package korit_9_gov_java.src.main.java.com.korit.study.ch28;

interface ClickListener {
    void onClick();
}

class HomeButtonClickListener implements ClickListener {
    @Override
    public void onClick() {
        System.out.println("홈으로 이동합니다.");
    }
}

class LoginButtonClickListener implements ClickListener {
    @Override
    public void onClick() {
        System.out.println("로그인 화면으로 이동합니다.");
    }
}

class Button {
    private ClickListener listener;

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        listener.onClick();
    }
}

public class ButtonMain {
    public static void main(String[] args) {
        Button homeButton = new Button();
        HomeButtonClickListener homeButtonClickListener = new HomeButtonClickListener();
        homeButton.setClickListener(homeButtonClickListener);
        homeButton.click();

        Button loginButton = new Button();
        LoginButtonClickListener loginButtonClickListener = new LoginButtonClickListener();
        loginButton.setClickListener(loginButtonClickListener);
        loginButton.click();

        Button registerButton = new Button();
        ClickListener registerButtonClickListener = new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("회원가입 화면으로 이동합니다.");
            }
        };
        registerButton.setClickListener(registerButtonClickListener);
        registerButton.click();

        Button mypageButton = new Button();
        mypageButton.setClickListener(new ClickListener() {
            @Override
            public void onClick() {
                System.out.println("마이페이지로 이동합니다.");
            }
        });
        mypageButton.click();

        Button shopButton = new Button();
        shopButton.setClickListener(() -> {
            System.out.println("상점으로 이동합니다.");
            System.out.println("명령 하나 더 추가");
        });
        shopButton.click();
    }
}
