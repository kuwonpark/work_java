package ch07;

class Tv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}

class VCR{
	boolean power;
	int counter =0;
	void power() {power = !power;}
	void paly() {}
	void stop() {}
	void rew() {}
	void ff() {}
}
public class TVCR extends Tv {
	VCR vcr = new VCR();
	int counter = vcr.counter;
	
	void play() {
		vcr.paly();
	}
	void stop() {
	vcr.stop();	
	}
	void rew() {
		vcr.rew();	
		}
	void ff() {
		vcr.ff();	
		}
	

}
