public class iphone {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    
        // Interface ReprodutorMusical
public interface ReprodutorMusical {
    void playMusic();
    void pauseMusic();
    void nextTrack();
    void previousTrack();
}

// Interface AparelhoTelefonico
public interface AparelhoTelefonico {
    void makeCall(String number);
    void receiveCall(String caller);
    void endCall();
}

// Interface NavegadorInternet
public interface NavegadorInternet {
    void browseWeb(String url);
    void search(String term);
}

// Classe iPhone implementando as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void playMusic() {
        // Implementação específica para reproduzir música no iPhone
    }

    @Override
    public void pauseMusic() {
        // Implementação específica para pausar música no iPhone
    }

    @Override
    public void nextTrack() {
        // Implementação específica para ir para a próxima faixa de música
    }

    @Override
    public void previousTrack() {
        // Implementação específica para voltar para a faixa anterior de música
    }

    @Override
    public void makeCall(String number) {
        // Implementação específica para fazer uma chamada telefônica
    }

    @Override
    public void receiveCall(String caller) {
        // Implementação específica para receber uma chamada telefônica
    }

    @Override
    public void endCall() {
        // Implementação específica para encerrar uma chamada telefônica
    }

    @Override
    public void browseWeb(String url) {
        // Implementação específica para navegar na internet
    }

    @Override
    public void search(String term) {
        // Implementação específica para realizar uma busca na internet
    }

    // Outros métodos específicos do iPhone, se necessário
}

// Classe Main para testar o iPhone
public class Main {
    public static void main(String[] args) {
        iPhone myPhone = new iPhone();
        
        // Exemplo de uso como reprodutor musical
        myPhone.playMusic();
        myPhone.pauseMusic();
        
        // Exemplo de uso como aparelho telefônico
        myPhone.makeCall("123456789");
        myPhone.receiveCall("Alice");
        
        // Exemplo de uso como navegador internet
        myPhone.browseWeb("https://www.example.com");
        myPhone.search("iPhone features");
    }
}

    
    }
}
