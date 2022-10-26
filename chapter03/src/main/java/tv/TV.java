package tv;

public class TV {
	private int channel;	// 1~255 사이 값을 가지게 하고 라운딩 할 것
	private int volume;		// 0~100 사이 값을 가지게 하고 라운딩 할 것
	private boolean power;	
	

	public void status() {
		System.out.println("TV[channel: " + channel +
						   ", volume: " + volume +
						   ", power: " + (power ? "On" : "Off") + "]");
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
		if(this.channel <= 0) {
			this.channel = 255;
		} else if(this.channel > 255) {
			this.channel = 1;
		}
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
		if(this.volume > 100) {
			this.volume = 0;
		} else if (this.volume < 0) {
			this.volume = 100;
		}
	}


	public boolean isPower() {
		return power;
	}


	public void setPower(boolean power) {
		this.power = power;
	}

	public void volume(boolean b) {
		if(b == true) {
			setVolume(volume);
			volume++;
		} else if(b == false) {
			volume--;
			setVolume(volume);
		}
	}

	public void channel(boolean b) {
		if(b == true) {
		setChannel(this.channel);
		channel++;
		} else if(b == false) {
			setChannel(this.channel);
			channel--;
		}
	}
}
