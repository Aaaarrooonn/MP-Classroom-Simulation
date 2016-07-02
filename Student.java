import java.util.Random;

public class Student
{
	private final int personality;
	private final boolean spawn;
	private Random rand;
	private int happinessindex;
	private int engaged;
	private int confused;
	private int giveup;
	private int emotion;
	private int learningrate;

	//1 engaged
	//2 confused
	//3 giveup

	//1 bully
	//2 clueless
	//3 motivated
	//4 nerd
	//5 quiet
	//6 unmotivated
	//7 unorganized
	//8 pot-stirrer

	public Student()
	{
		rand = new Random();
		spawn = rand.nextBoolean();
		personality = rand.nextInt(7) + 1;
		setHappinessIndex(happinessindex);
	}

	public void generateEmotion()
	{
		emotion = rand.nextInt(99) + 1;

		if(emotion <= getEngaged())
			setEmotion(1);

		if(emotion > getEngaged() && emotion <= (getEngaged() + getConfused()))
			setEmotion(2);

		if(emotion > (getEngaged() + getConfused()))
			setEmotion(3);
 	}

 	public void setLearningRate(int value)
 	{
 		learningrate = value;
 	}

 	public void setEmotion(int value)
 	{
 		emotion = value;
 	}

	public void setEngaged(int value)
	{	
		engaged = value;
	}

	public void setConfused(int value)
	{	
		confused = value;
	}

	public void setGiveUp(int value)
	{	
		giveup = value;
	}

	public void setHappinessIndex(int temp)
	{
		happinessindex += temp;
	}

	public int getEngaged()
	{
		return engaged;
	}
	
	public int getConfused()
	{
		return confused;
	}

	public int getGiveUp()
	{
		return giveup;
	}

	public boolean getSpawn()
	{
		return spawn;
	}

	public int getPersonality()
	{
		return personality;
	}

	public int getHappinessIndex()
	{
		return happinessindex;
	}

	public int getEmotion()
	{
		return emotion;
	}

	public int getLearningRate()
	{
		return learningrate;
	}
}