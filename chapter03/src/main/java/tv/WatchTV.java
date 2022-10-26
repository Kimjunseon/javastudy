package tv;

public class WatchTV {

	public static void main(String[] args) {
         TV tv = new TV(7, 20, false);  	
         tv.status();	
         
         tv.setPower(true);
         tv.setVolume(120); // 100이 넘어가면 0으로 셋팅
         tv.status();		          
         
         tv.volume(false);
         tv.status();
         
         tv.setChannel( 0 ); // 채널 255
         tv.status();		          
        
         tv.channel(true);
         tv.channel(true);
         tv.channel(true);
         tv.status();

         tv.setPower(false);
         tv.status();      		          
		     }
}

// 7   20  off
// 7   0   on
// 7   100 on
// 255 100 on
// 3   100 on
// 3   100 off
