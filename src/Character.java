package Characters;

import java.util.*;

public class Character {
	// Declare instance variables
	private String _name;
	private String _job;
	private int _hp; // max is 100
	private int _maxhp;
	private int _strength;
	
	// Initialize variables
	public Character (String name, String job, int maxhp, int strength) {
		_name = name;
		_job = job;
		_hp = maxhp;
		_maxhp = maxhp;
		_strength = strength;
	}
	
	public String getName() {
		return _name;
	}
	
	public int getStrength() {
		return _strength;
	}
	
	public String getJob() {
		return _job;
	}
	
	public int getHP() {
		return _hp;
	}
	
	public boolean playerIsAlive() {
		if (_hp > 0) {
			return true;
		} else
		return false;
	}
	
	public int playerDamaged(int otherStrength) {
		_hp -= otherStrength;
		
		if (_hp < 0)
			return -1;
		
		return _hp;
	}
	
	public int drankSmallPotion() {
		_hp += 10;
		if (_hp > _maxhp) {
			_hp = _maxhp;
		}
		return _hp;
	}
	
	public int drankMedPotion() {
		_hp += 20;
		if (_hp > _maxhp) {
			_hp = _maxhp;
		}
		return _hp;
	}
	
	public int drankLargePotion() {
		_hp += 30;
		if (_hp > _maxhp) {
			_hp = _maxhp;
		}
		return _hp;
	}
	
	public boolean critical() {
		Random r = new Random();
		int i = r.nextInt(9);
		if (i == 0) {
			return true;
		}
		return false;
	}
	
}
