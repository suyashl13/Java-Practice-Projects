class MusicPlayer {
    public void playMusic () {
        System.out.println("Music is Playing!!!");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10) {
            return "Pen"; 
        } else return "Nothing";
    }
}

public class MethodDemo {

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.playMusic();
        String pen =  musicPlayer.getMeAPen(10);
        
        System.out.println("What I got => " + pen);
    }
}