package tv;

public class WatchTv {

	public static void main(String[] args) {
         TV tv = new TV(7, 20, false);  	
         
         tv.status();	
         
         tv.power(true);
         tv.volume(120); // 100이 넘어가면 0으로 셋팅
         tv.status();		          
         
         tv.volume(false);
         tv.status();
         
         tv.channel( 0 ); // 채널 255
         tv.status();		          
         
         tv.channel(true);
         tv.channel(true);
         tv.channel(true);
         tv.status();

         tv.power(false);
         tv.status();      		          
		     }
		}

}

}
