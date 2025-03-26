package cleaner_class;

import java.lang.ref.Cleaner;

class Student {
    private String name;
    private int roll;
    private static final Cleaner cleaner = Cleaner.create();
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        cleaner.register(this, new CleanupiTask(name));
    }

    public void display() {
        System.out.println(name + "  " + roll);
    }

    private static class CleanupTask implements Runnable {
        private final String name;

        public CleanupTask(String name) {
            this.name = name;
        }
		/*
		 * @Override public void run() { System.out.println("Object deleted: " + name);
		 * }
		 */

		@Override
		public void run() { System.out.println("Object deleted: " + name);
			// TODO Auto-generated method stub
			
		}
    }
}

public class q01 {
    public static void main(String[] args) {
        Student a1 = new Student("bvx", 757);
        Student a11 = new Student("gdyt", 6587);
        
        a1.display();
        a11.display();
        
        // Make objects eligible for garbage collection
        a1 = null;
        a11 = null;
        
        // Request garbage collection
        System.gc();
        
        
    }
}
