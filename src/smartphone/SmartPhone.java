/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 19/02/2022
 */

package smartphone;

public class SmartPhone extends Phone implements ICamera, IMusicPlayer {
    public void VideoCall() {
        System.out.println("Smart Phone Video Calling");
    }

    public void click() {
        System.out.println("Smart phone clicking photo");
    }

    public void record() {
        System.out.println("Smart phone recording video");
    }

    public void play() {
        System.out.println("Smart phone playing music");
    }

    public void stop() {
        System.out.println("Smart phone stopped playing music");
    }

}