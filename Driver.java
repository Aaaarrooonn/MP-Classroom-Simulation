public class Driver
{
	public void displayBoard(Student[][] tables)
	{
		for(int y = 0; y < 8; y++){
			System.out.println();
			for(int x = 0; x < 8; x++){
				if(tables[y][x].getSpawn() == false)
					System.out.print("* | ");
				else
					switch(tables[y][x].getPersonality()){
						case 1: System.out.print("B | "); break;
						case 2: System.out.print("C | "); break;
						case 3: System.out.print("M | "); break;
						case 4: System.out.print("N | "); break;
						case 5: System.out.print("Q | "); break;
						case 6: System.out.print("UM| "); break;
						case 7: System.out.print("UO| "); break;
						case 8: System.out.print("PS| "); break;
					}
				}
			}
	}

		public void computeHappinessPoints(Student s1, Student s2)
		{
			if(s1.getPersonality() == 1)
				if(s2.getSpawn() == true)
					switch(s2.getPersonality()){
						case 1: s1.setHappinessIndex(3); break;
						case 2: s1.setHappinessIndex(4); break;
						case 3: s1.setHappinessIndex(2); break;
						case 4: s1.setHappinessIndex(4); break;
						case 5: s1.setHappinessIndex(4); break;
						case 6: s1.setHappinessIndex(2); break;
						case 7: s1.setHappinessIndex(0); break;
						case 8: s1.setHappinessIndex(-3); break;
					}
				else s1.setHappinessIndex(2);


			else if(s1.getPersonality() == 2)
				if(s2.getSpawn() == true)
					switch(s2.getPersonality()){
						case 1: s1.setHappinessIndex(0); break;
						case 2: s1.setHappinessIndex(-2); break;
						case 3: s1.setHappinessIndex(3); break;
						case 4: s1.setHappinessIndex(4); break;
						case 5: s1.setHappinessIndex(-2); break;
						case 6: s1.setHappinessIndex(-2); break;
						case 7: s1.setHappinessIndex(-2); break;
						case 8: s1.setHappinessIndex(-4); break;
					}
				else s1.setHappinessIndex(2);


			else if(s1.getPersonality() == 3)
				if(s2.getSpawn() == true)
					switch(s2.getPersonality()){
						case 1: s1.setHappinessIndex(0); break;
						case 2: s1.setHappinessIndex(0); break;
						case 3: s1.setHappinessIndex(4); break;
						case 4: s1.setHappinessIndex(4); break;
						case 5: s1.setHappinessIndex(1); break;
						case 6: s1.setHappinessIndex(0); break;
						case 7: s1.setHappinessIndex(0); break;
						case 8: s1.setHappinessIndex(-1); break;
					}
				else s1.setHappinessIndex(2);


			else if(s1.getPersonality() == 4)
				if(s2.getSpawn() == true)
					switch(s2.getPersonality()){
						case 1: s1.setHappinessIndex(0); break;
						case 2: s1.setHappinessIndex(0); break;
						case 3: s1.setHappinessIndex(0); break;
						case 4: s1.setHappinessIndex(3); break;
						case 5: s1.setHappinessIndex(2); break;
						case 6: s1.setHappinessIndex(0); break;
						case 7: s1.setHappinessIndex(0); break;
						case 8: s1.setHappinessIndex(-2); break;
					}
				else s1.setHappinessIndex(2);


			else if(s1.getPersonality() == 5)
				if(s2.getSpawn() == true)
					switch(s2.getPersonality()){
						case 1: s1.setHappinessIndex(0); break;
						case 2: s1.setHappinessIndex(0); break;
						case 3: s1.setHappinessIndex(0); break;
						case 4: s1.setHappinessIndex(0); break;
						case 5: s1.setHappinessIndex(-2); break;
						case 6: s1.setHappinessIndex(-2); break;
						case 7: s1.setHappinessIndex(-2); break;
						case 8: s1.setHappinessIndex(-3); break;
					}
				else s1.setHappinessIndex(2);


			else if(s1.getPersonality() == 6)
				if(s2.getSpawn() == true)
					switch(s2.getPersonality()){
						case 1: s1.setHappinessIndex(0); break;
						case 2: s1.setHappinessIndex(0); break;
						case 3: s1.setHappinessIndex(0); break;
						case 4: s1.setHappinessIndex(0); break;
						case 5: s1.setHappinessIndex(0); break;
						case 6: s1.setHappinessIndex(-2); break;
						case 7: s1.setHappinessIndex(-2); break;
						case 8: s1.setHappinessIndex(-3); break;
					}
				else s1.setHappinessIndex(2);


			else if(s1.getPersonality() == 7)
				if(s2.getSpawn() == true)
					switch(s2.getPersonality()){
						case 1: s1.setHappinessIndex(0); break;
						case 2: s1.setHappinessIndex(0); break;
						case 3: s1.setHappinessIndex(0); break;
						case 4: s1.setHappinessIndex(0); break;
						case 5: s1.setHappinessIndex(0); break;
						case 6: s1.setHappinessIndex(0); break;
						case 7: s1.setHappinessIndex(-2); break;
						case 8: s1.setHappinessIndex(-1); break;
					}
				else s1.setHappinessIndex(2);


			else if(s1.getPersonality() == 8)
				if(s2.getSpawn() == true)
					switch(s2.getPersonality()){
						case 1: s1.setHappinessIndex(0); break;
						case 2: s1.setHappinessIndex(0); break;
						case 3: s1.setHappinessIndex(0); break;
						case 4: s1.setHappinessIndex(0); break;
						case 5: s1.setHappinessIndex(0); break;
						case 6: s1.setHappinessIndex(0); break;
						case 7: s1.setHappinessIndex(0); break;
						case 8: s1.setHappinessIndex(-1); break;
					}
				else s1.setHappinessIndex(2);

		}

		public void checkHappiness(Student[][] tables)
		{
			System.out.println();
			for(int y = 0; y < 8; y++){
				System.out.println();
				for(int x = 0; x < 8; x++){
					if(tables[y][x].getSpawn() == false)
						System.out.print("* | ");
					else{
						if(x == 0){
							computeHappinessPoints(tables[y][x], tables[y][x + 1]);
							System.out.print(tables[y][x].getHappinessIndex() + " | ");
						}	
						else if(x == 7){
							computeHappinessPoints(tables[y][x], tables[y][x - 1]);
							System.out.print(tables[y][x].getHappinessIndex() + " | ");
						}
						else{
							computeHappinessPoints(tables[y][x], tables[y][x + 1]);
							computeHappinessPoints(tables[y][x], tables[y][x - 1]);
							System.out.print(tables[y][x].getHappinessIndex() + " | ");
						}
						
					}
				}
			}
		}

		public void checkEmotion(Student[][] tables)
		{
			System.out.println();
			for(int y = 0; y < 8; y++){
				System.out.println();
				for(int x = 0; x < 8; x++){
					if(tables[y][x].getSpawn() == false)
						System.out.print("* | ");
					else
						System.out.print(tables[x][y].getEmotion() + " | ");
				}
			}
		}

		public void checkLearningRate(Student[][] tables)
		{
			System.out.println();
			for(int y = 0; y < 8; y++){
				System.out.println();
				for(int x = 0; x < 8; x++){
					if(tables[y][x].getSpawn() == false)
						System.out.print("* | ");
					else
						System.out.print(tables[x][y].getLearningRate() + " | ");
				}
			}
		}

		public static void main(String[] args) 
		{
			Driver driver = new Driver();		
			Student[][] tables = new Student[8][8];

			for(int y = 0; y < 8; y++)
				for(int x = 0; x < 8; x++)
					tables[y][x] = new Student();

			Activity activity = new Activity();

			for(int y = 0; y < 8; y++)
				for(int x = 0; x < 8; x++){
					tables[y][x].generateEmotion();
					activity.setEmotion(tables);
				}
			
			System.out.println(activity.getActivity());
			driver.displayBoard(tables);		
			driver.checkHappiness(tables);
			driver.checkEmotion(tables);
			driver.checkLearningRate(tables);
		}
}
