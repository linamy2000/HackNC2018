package Character;

import java.util.*;

public class Monster {
	// Declare instance variables
	private int _maxhp;
	private int _strength;
	private int _hp;
	
	// Initialize variables
	public Monster (int maxhp, int strength) {
		_maxhp = maxhp;
		_strength = strength;
		_hp = maxhp;
	}
	
	public int monsterDamaged(int otherStrength) {
		_hp -= otherStrength;
		
		if (_hp < 0) {
			return -1;
		}
		
		return _hp;
	}
	
	public void nextMonster() {
		Random r = new Random();
		if ((r.nextInt(2)+1)*-1 < 0)
			_maxhp = _maxhp + r.nextInt(11);
		if ((r.nextInt(2)+1)*-1 > 0)
			_maxhp = _maxhp + r.nextInt(11);
		_strength = r.nextInt(21);
	}
}
