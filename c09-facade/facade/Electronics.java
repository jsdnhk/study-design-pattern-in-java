package c09.facade;
/**
 * 電子產品介面，全部的電子產品都可以開關電源
 */
public abstract class Electronics {
	private boolean power = false;   // 電源
	
	// 啟動電源
	public void powerOn() {
		this.power = true;
	}
	// 關閉電源
	public void powerOff() {
		this.power = false;
	}
	// 電源是否有開
	public boolean isPowerOn() {
		return power;
	}
	// 顯示機器狀態
	protected void showStatus(){
		if(power){
			System.out.println(this.getClass().getSimpleName() + "運作中");
		} else {
			System.out.println(this.getClass().getSimpleName() + "電源未開啟");
		}
	}
}

/**
 * 液晶電視
 */
public class Television  extends Electronics {
	private int sound = 50 ;         // 音量 (0為靜音，100為最大)
	private String source = "tvBox"; // 訊號源
	private int channel = 9;         // 電視頻道
	
	// 選擇訊號源
	public void switchSource(String source) {
		this.source = source;
	}
	
	// 調整音量
	public void setSound(int sound) {
		this.sound = sound;
	}
	
	// 選電視頻道
	public void switchChannel(int channel) {
		this.channel = channel;
	}
	
	// 看目前觀看電視頻道
	public void showTV() {
		System.out.println("目前觀看的是頻道: " + channel);
	}

	@Override
	public void showStatus(){
		super.showStatus();
		if(isPowerOn()){
			System.out.print(this.getClass().getSimpleName()  + "音量為: " + sound);
			if(source.equals("tvBox")){
				System.out.println(", 頻道: " +  channel);
			}
			
			if(source.equals("ktv")){
				System.out.println(", ktv播放中");
			}
			
			if(source.equals("ps")){
				System.out.println(", ps畫面顯示中");
			}
		}
	}
	
	public int getSound() {
		return sound;
	}

	public String getSource() {
		return source;
	}

	public int getChannel() {
		return channel;
	}
}

/**
 * 環繞音響
 */
public class Stereo extends Electronics {
	private int sound = 50 ;         // 音量 (0為靜音，100為最大)
	
	// 調整音量
	public void setSound(int sound) {
		this.sound = sound;
	}

	public int getSound() {
		return sound;
	}
	
	@Override
	public void showStatus(){
		super.showStatus();
		if(isPowerOn()){
			System.out.println(this.getClass().getSimpleName()  + "音量為: " + sound);
		}
	}
}

/**
 * KTV點歌機
 */
public class KTVsystem extends Electronics {
	private String song; // 歌曲
	
	//選歌
	public void selectSong(String song){
		this.song = song;
	}
	//播放
	public void playSong(){
		System.out.println(this.getClass().getSimpleName() + "播放 " + song );
	}
}

/**
 * PS3 
 */
public class PlayStation3 extends Electronics {
	private String cd ; // 目前播放的CD

	// 放入CD片
	public void putCd(String cd) {
		this.cd = cd;
	}

	public String getCd() {
		return cd;
	}

	// 播放CD
	public void play(){
		System.out.println(this.getClass().getSimpleName()  + "開始播放 " + cd);
	}
	
	@Override
	public void showStatus(){
		super.showStatus();
		if(isPowerOn()){
			System.out.println(this.getClass().getSimpleName()  + "目前放入cd: " + cd);
		}
	}
}