import java.util.Random;

public class Activity
{
	//0 is silent
	//1 is interactive
	private int activity;
	private Random rand;

	public Activity()
	{
		rand = new Random();
		
		activity = rand.nextInt(2);
	}

	public void setEmotion(Student[][] s)
	{
		for(int y = 0; y < 8; y++)
			for(int x = 0; x < 8; x++){
				if(s[y][x].getSpawn() != false && s[y][x].getPersonality() == 1)
					setBully(s[y][x], activity);
				if(s[y][x].getSpawn() != false && s[y][x].getPersonality() == 2)
					setClueless(s[y][x], activity);
				if(s[y][x].getSpawn() != false && s[y][x].getPersonality() == 3)
					setMotivated(s[y][x], activity);
				if(s[y][x].getSpawn() != false && s[y][x].getPersonality() == 4)
					setNerd(s[y][x], activity);
				if(s[y][x].getSpawn() != false && s[y][x].getPersonality() == 5)
					setQuiet(s[y][x], activity);
				if(s[y][x].getSpawn() != false && s[y][x].getPersonality() == 6)
					setUnmotivated(s[y][x], activity);
				if(s[y][x].getSpawn() != false && s[y][x].getPersonality() == 7)
					setUnorganized(s[y][x], activity);
				if(s[y][x].getSpawn() != false && s[y][x].getPersonality() == 8)
					setPotStirrer(s[y][x], activity);
			}
	}

	public void setBully(Student s, int activity)
	{
		if(activity == 0){
			s.setEngaged(30);
			s.setConfused(10);
			s.setGiveUp(60);
			s.setLearningRate(50);
		}

		else{
			s.setEngaged(60);
			s.setConfused(20);
			s.setGiveUp(20);
			s.setLearningRate(60);
		}
	}

	public void setClueless(Student s, int activity)
	{
		if(activity == 0){
			s.setEngaged(50);
			s.setConfused(30);
			s.setGiveUp(20);
			s.setLearningRate(50);
		}

		else{
			s.setEngaged(50);
			s.setConfused(30);
			s.setGiveUp(20);
			s.setLearningRate(60);
		}
	}

	public void setMotivated(Student s, int activity)
	{
		if(activity == 0){
			s.setEngaged(80);
			s.setConfused(10);
			s.setGiveUp(10);
			s.setLearningRate(90);
		}

		else{
			s.setEngaged(70);
			s.setConfused(20);
			s.setGiveUp(10);
			s.setLearningRate(90);
		}
	}

	public void setNerd(Student s, int activity)
	{
		if(activity == 0){
			s.setEngaged(80);
			s.setConfused(10);
			s.setGiveUp(10);
			s.setLearningRate(90);
		}

		else{
			s.setEngaged(70);
			s.setConfused(20);
			s.setGiveUp(10);
			s.setLearningRate(90);
		}
	}

	public void setQuiet(Student s, int activity)
	{
		if(activity == 0){
			s.setEngaged(80);
			s.setConfused(10);
			s.setGiveUp(10);
			s.setLearningRate(90);
		}

		else{
			s.setEngaged(60);
			s.setConfused(20);
			s.setGiveUp(20);
			s.setLearningRate(50);
		}
	}

	public void setUnmotivated(Student s, int activity)
	{
		if(activity == 0){
			s.setEngaged(50);
			s.setConfused(30);
			s.setGiveUp(20);
			s.setLearningRate(50);
		}

		else{
			s.setEngaged(50);
			s.setConfused(30);
			s.setGiveUp(20);
			s.setLearningRate(50);
		}
	}

	public void setUnorganized(Student s, int activity)
	{
		if(activity == 0){
			s.setEngaged(50);
			s.setConfused(30);
			s.setGiveUp(20);
			s.setLearningRate(50);
		}

		else{
			s.setEngaged(50);
			s.setConfused(30);
			s.setGiveUp(20);
			s.setLearningRate(50);
		}
	}

	public void setPotStirrer(Student s, int activity)
	{
		if(activity == 0){
			s.setEngaged(40);
			s.setConfused(10);
			s.setGiveUp(50);
			s.setLearningRate(50);
		}

		else{
			s.setEngaged(60);
			s.setConfused(20);
			s.setGiveUp(20);
			s.setLearningRate(50);
		}
	}

	public int getActivity()
	{
		return activity;
	}

}