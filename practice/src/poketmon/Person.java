package poketmon;

public class Person implements Hunter {
	
	Poketmon[] poket;
	int index;
	
	public Person(Poketmon[] poket, int index) {
		this.poket = poket;
		this.index = index;
	}
	
	@Override
	public void hunt(Poketmon pocketmon) {
		poket[index++] = pocketmon;
		for(int i=0;i< this.index;i++) {
			System.out.println(this.poket[i].name);
		}
		
	}

	@Override
	public void release() {
		
		for(int i=0;i<this.index;i++) {
			if(this.poket[i].name == "라이츄") {
				this.poket[i] = null;
			}
		}
		for(int i=0;i< this.index;i++) {
			if(this.poket[i] != null) {				
				System.out.println(this.poket[i].name);
			}
		}
	}
}
